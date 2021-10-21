package model;

public class Employee {
private String name;
private String empID;
private Device laptopDevice1;
Employee(){
	
}
Employee(String name,Device device)
{
	System.out.println("in constructor");
	this.name = name;
	this.laptopDevice1 = device;
}

Employee(Device device)
{
	//System.out.println("in constructor");
	this.laptopDevice1 = device;
}


Employee(String name)
{
	//System.out.println("in constructor");
	this.name = name;
}
public Device getDevice() {
	return laptopDevice1;
}

public void setDevice(Device device) {
	this.laptopDevice1 = device;
}

	public String getEmpID() {
		return empID;
	
	}

//public Device getLaptopDevice() {
	//return laptopDevice1;
//}
//public void setLaptopDevice(Device laptopDevice) {
	//this.laptopDevice1 = laptopDevice;
//}
public void setEmpID(String empID) {
	this.empID = empID;

}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;

}

	public Device getLaptopDevice1() {
	return laptopDevice1;
}
public void setLaptopDevice1(Device laptopDevice1) {
	System.out.println("In setter:setLaptopDevice1");
	this.laptopDevice1 = laptopDevice1;
}
	public void setEmpId(String empId){
		this.empID=empId;
		System.out.println("Emp empId:"+ empId);
	
	}
}
