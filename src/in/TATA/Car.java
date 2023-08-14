package in.TATA;

public class Car {

private IEngine engine;	

 public Car (IEngine engine) {
	this.engine = engine; 
 }

public void Drive() {
	int status =  engine.Start();
	if(status>=1) {
		System.out.println("Journey started");
	}else {
		System.out.println("Engine Trouble");
	}
	
	
}
	
	
	
	
}
