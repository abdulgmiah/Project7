package Keywords;

public class Car {
String carModel;
int year;
public Car(){
	System.out.println("This is Car object");
}
public Car(String carModel){
	this.carModel = carModel;
	System.out.println(this.carModel);
}
public Car(String carModel, int year){
	this.carModel = carModel;
	this.year = year;
	System.out.println(this.carModel+" "+this.year);
}
public void engine(){
	System.out.println("Run by regular oil");
}
}
