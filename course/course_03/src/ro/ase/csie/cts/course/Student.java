package ro.ase.csie.cts.course;

import ro.ase.csie.cts.course.accounting.IAccounting;

public class Student {
	
	String name;
	
	private IAccounting paymentService;
	
	//setter injection
	public void setPaymentMode(IAccounting service) {
		this.paymentService = service;
	}
	
	//constructor injection
	public Student(String name, IAccounting paymentService) {
		super();
		this.name = name;
		this.paymentService = paymentService;
	}
	
	
	String getName(){ return this.name;}
	


	public void payTuition(double value){ 
//		System.out.println("Pay by card");
//		System.out.println("Pay by crypto");
		
		if(this.paymentService != null) {
			this.paymentService.payTuition(value);
		}
		
	}
	void takeOOPExam(){ }
	void saveToDB(){ }
	
}
