package StringsPractice;

public class ConstructorsConcept {
	String name;
	int price;
	String model;
	String year;
	
	public ConstructorsConcept (String name, int price, String model){
	this.name = name;
	this.price= price;
	this.model =model;
	}
	
	public ConstructorsConcept(String year){
		this.year=year;
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorsConcept obj =new ConstructorsConcept("BMW",80000,"x-series");
		ConstructorsConcept obj1 =new ConstructorsConcept("Audi",90000,"A-series");
		ConstructorsConcept obj2 =new ConstructorsConcept("Jaguar",90000,"XJ-series");
		
		
		ConstructorsConcept obj3 =new ConstructorsConcept("2019");
		
		System.out.println(obj.name+" "+obj.price+" "+obj.model);
		
		System.out.println(obj1.name+" "+obj1.model+" "+obj1.price);
		
		System.out.println(obj2.name+" "+obj2.model+" "+obj3.year);
		
		System.out.println(obj3.year);
	}

}
