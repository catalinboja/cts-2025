package ro.ase.csie.cts.course.test;

import ro.ase.csie.cts.course.Student;
import ro.ase.csie.cts.course.accounting.IAccounting;
import ro.ase.csie.cts.course.accounting.PayByCardModule;
import ro.ase.csie.cts.course.accounting.PayByCryptoModule;
import ro.ase.csie.cts.course.dependency.containter.DependencyContainer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student("John", null);
		student.setPaymentMode(new PayByCryptoModule());
		student.payTuition(500);
		student.setPaymentMode(new PayByCardModule());
		student.payTuition(500);
		
        // Register dependencies
        DependencyContainer.register(IAccounting.class, new PayByCardModule());

        // Resolve dependency
        IAccounting paymentService = DependencyContainer.resolve(IAccounting.class);

        // Use the service
        student.setPaymentMode(paymentService);
        student.payTuition(800);
		
	}

}
