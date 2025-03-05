package ro.ase.csie.cts.course;

import ro.ase.csie.cts.course.accounting.IAccounting;

public class Student {
	String getName(){ return "";}
	//void payTuition(){ }
	IAccounting accDepartament;
	void takeOOPExam(){ }
	void saveToDB(){ }
	
	void payTuition(){ 
		this.accDepartament.payTuition(this);
	}
}
