/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author miguel
 */
@Entity
public class Facture implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private long id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ActualDate",nullable=false)
    private Date actualDate;
    @Column(name="Subtotal",nullable=false)
    private double subtotal; 
    @Column(name="IVA",nullable=false)
    private double iva;
    @Column(name="Total",nullable=false)
    private double total;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ExitDate",nullable=false)
    private Date exitDate;
    @Column(name="Plate",nullable=false)
    private String plate; 
    @Column(name="Ticket",nullable=false)
    private String ticket; 
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EntryDate",nullable=false)
    private Date entryDate;
    @JoinColumn(name="EmployeeExit")
    private Employee employeeExit; 
    @JoinColumn(name="EmployeeEntry")
    private Employee employeeEntry; 
    @JoinColumn(name="VehicleType")
    private VehicleType vehicleType;

    public Facture() {
    }

    public Employee getEmployeeEntry() {
        return employeeEntry;
    }

    public void setEmployeeEntry(Employee employeeEntry) {
        this.employeeEntry = employeeEntry;
    }

    public Employee getEmployeeExit() {
        return employeeExit;
    }

    public void setEmployeeExit(Employee employeeExit) {
        this.employeeExit = employeeExit;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getExitDate() {
        return exitDate;
    }

    public void setExitDate(Date exitDate) {
        this.exitDate = exitDate;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    /*@OneToMany
    private List<FactureTurn> facturesTurn = new ArrayList();*/
    //@OneToMany
    //private List<FactureTurn> facturesTurn = new ArrayList();
   
    public Date getActualDate() {
        return actualDate;
    }

    public void setActualDate(Date actualDate) {
        this.actualDate = actualDate;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Facture)) {
            return false;
        }
        Facture other = (Facture) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Facture[ id=" + id + " ]";
    }
    
}
