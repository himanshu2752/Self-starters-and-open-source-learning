package restApi_CRUD;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "vehicle" , schema="class_vehicle")
/**
 * 
 * @class Vehicle 
 *
 */
public class vehicle_Class implements Serializable {
	
	@Id
	@Column(name = "vehicleID" , nullable = false)
	public int Id ;
	
	@Column(name="vehicle_year")
	public int Year;
	
	@Column(name="vehicle_Make")
	public String Make;
	
	@Column(name="vehicle_Model")
	public String Model;
	
	@Column(name="vehicle_Class")
	public String Class ;
	
@Override
	public String toString() {
		return "Vehicle [Id=" + Id + ", Year=" + Year + ", Make=" + Make + ", Model=" + Model + ", Class=" + Class
				+ "]";
	}


	/**
	 * 
	 * Constructor for vehicle
	 */
	/*	public Vehicle(int id, int year, String make, String model, String clas){
		this.Id = id;
		this.Year = year;
		this.Make = make;
		this.Model = model;
		this.Class = clas;
	}*/
	public int getVehicleId(){
		return Id ;
	}
	
	
	public int getVehicleYear(){
		return Year;
	}
	
	public String getVehicleMake(){
		return Make;
	}
	
	public String getVehicleModel(){
		return Model;
	}
	
	public String getVehicleClass(){
		return Class;
	}
	
	public void setId(int id)
	{
		this.Id = id ;
	}
	
	public void setYear(int year)
	{
		this.Year = year;
	}
	
	public void setMake(String make)
	{
		this.Make = make;
	}
	
	public void setModel(String model)
	{
		this.Model = model ;
	}
	
	public void setClass(String clas)
	{
		this.Class = clas ;
	}
}
