/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Administration;

import javax.swing.table.DefaultTableModel;


/**
 *
 * @author miguel
 */
import Entity.VehicleType;
import controller.MainController;
import java.util.List;
import java.util.Random;

public class AdministrateVehicleTypeController {

    public static DefaultTableModel totalSearchOfVehicles() {
        DefaultTableModel results = new DefaultTableModel();
        AllVehiclesTypes=MainController.vehicleTypeJpaController.findVehicleTypeEntities();
        results.addColumn("Identificador");
        results.addColumn("Tipo de Vehículo");
        results.addColumn("Ejemplo de Placa");
        results.addColumn("Cantidad de espacio ocupado por vehículo");
        
        for (VehicleType e : AllVehiclesTypes) {
            results.addRow( new Object []{String.valueOf(e.getNumber()), e.getName(), decodePlate(e.getCodification()), e.getPlaces()});
        }
        return results;
    }
    public static String encodePlate(String plate){
         String code="";
         for(int i=0;i<plate.length();i++){
             if(Character.isLetter(plate.charAt(i))){
                 code=code+"1";}
             else if(Character.isDigit(plate.charAt(i))){
                 code=code+"0";}
             else{
                 return "No es un tipo valido de placa";
             }
         }
         return code;
     }
    public static String decodePlate(String code){
        String decode="";
        for(int i=0;i<code.length();i++){
            
            Random rnd = new Random();
            if(code.charAt(i)==49){
            int n=rnd.nextInt(25)+65;
            decode=decode+Character.toString((char)n);
            }
            else{
            int n=rnd.nextInt(9);
            decode=decode+String.valueOf(n);
            }
        }
        return decode;
    }
    
    public static String savePlate(String Name, String Plate,double Places){
       String code=encodePlate(Plate);
       if(!code.equals("No es un tipo valido de placa")){
           VehicleType v=new VehicleType();
           v.setCodification(code);
           v.setName(Name);
           v.setPlaces(Places);
           MainController.vehicleTypeJpaController.create(v);
           String action="Add vehicle type: "+Name;
           MainController.system.NewLogAction(action, null);
           return "Succes";
       }
       return "Failure";
    }
    
    public static boolean verifyTypePlate(String plate){
        
        if(plate.length()<=0 || plate.length()>=25){return false;}
        return true;
        
    }
    public static boolean verifyExamplePlate(String example){
        
        if(example.length()<=0){return false;}
        return true;
    }
    
    private static List<VehicleType> AllVehiclesTypes=null;
}
