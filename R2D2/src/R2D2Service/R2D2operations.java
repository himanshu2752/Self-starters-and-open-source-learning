package R2D2Service;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

 /**
  * 
  * @author himanshu
  * Mitchell coding challenge
  * This is Part1
  *
  */
public class R2D2operations implements VehicleService {
	
	public List<Vehicle> vehicleList = new ArrayList<>();
	public HashSet<Integer>	vehicleIDs = new HashSet<>();
	public HashMap<Integer, Vehicle> vehicles = new HashMap<>();		

		
	public void Create(Vehicle v)
	{
		if (vehicleIDs.contains(v.Id))
		{
			System.out.println("Vehicle with this vehicle id already exists");
		}
		else{
			int id = vehicles.size()+1;
		v.setClass(v.Class);
		v.setId(id);
		vehicleIDs.add(v.Id);
		v.setMake(v.Make);
		v.setModel(v.Model);
		v.setYear(v.Year);
		vehicles.put(id, v);
		vehicleList.add(v);
		}
	}	
	
	public Vehicle get(int id)
	{
		Vehicle v = vehicles.get(id);
		if (v.equals(null))
		{
			System.out.println("No such vehicle in the system");
		}
		else{
		System.out.println("class: "+v.Class+", model: "+v.Model+", make: "+v.Model+", year: "+v.Year);
		}
		return vehicles.get(id);
	}
	
	public List<Vehicle> Get(){
		return vehicleList;
	}	
	
	public void Update(Vehicle v)
	{	
		if (vehicleIDs.contains(v.Id) )
		{
			v.setClass(v.Class);
			v.setMake(v.Make);
			v.setModel(v.Model);
			v.setYear(v.Year);
		}
		else{
		
		}
	}
	
	public void Delete(Vehicle v)
	{
		vehicles.remove(v);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Please Enter class for the vehicle");
		Scanner sc = new Scanner(System.in);
		String clas = sc.nextLine();
		System.out.println("Please Enter model for the vehicle");
		String model = sc.nextLine();
		System.out.println("Please Enter make for the vehicle");
		String make = sc.nextLine();
		System.out.println("Please Enter year for the vehicle");
		String year = sc.nextLine();
		int yr = Integer.parseInt(year);
		if (yr < 1950 || yr > 2050)
		{
			System.out.println("Please enter the year between 1950 and 2050");
			System.out.println("Please Enter year for the vehicle again");
			 year = sc.nextLine();
			 yr = Integer.parseInt(year);			
		}		
		R2D2operations clasObj = new R2D2operations();
		Vehicle x = new Vehicle();
		x.setClass(clas);
		x.setModel(model);
		x.setMake(make);
		x.setYear(yr);
		x.setId(clasObj.vehicleList.size()+1);		
		clasObj.Create(x);
		try {
			writeTofile(x);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Vehicle successfully created by R2D2");
		clasObj.get(1);
		try {
			readFile();
		} catch (ClassNotFoundException | IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void writeTofile(Vehicle v) throws IOException{
		ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("Vehicle.bin"));
		objOut.writeObject(v);
	}
	public static void readFile() throws IOException, ClassNotFoundException{
		ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("Vehicle.bin"));
		Vehicle v = (Vehicle)objIn.readObject();
		System.out.println(v);
	}
}
