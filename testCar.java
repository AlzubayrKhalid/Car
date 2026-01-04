package fiaadh;
import java.util.Scanner;

public class testCar {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		Car car1;
		Car car2;
		
		
		System.out.println("Please enter car1 model, year, mileage, hadd and soom");
		String model1= read.next();
		int year1= read.nextInt();
		int mileage1= read.nextInt();
		double hadd1= read.nextDouble();
		double soom1= read.nextDouble();
		

		
		car1 = new Car(model1, year1, mileage1, soom1, hadd1);
		double usersoom= car1.getSoom();
		
		System.out.println("Please enter car2 model, year, mileage, hadd and soom");
		String model2= read.next();
		int year2= read.nextInt();
		int mileage2= read.nextInt();
		double hadd2= read.nextDouble();
		double soom2= read.nextDouble();

		
		car2 = new Car(model2, year2, mileage2, soom2, hadd2);
		
		car1.printCar();
		car2.printCar();
		
		
		
		if (car1.similar(car2))
			System.out.println("Cars are similar");
		else 
			System.out.println("Cars are not similar");
		
		System.out.printf("Car1 difference between soom and hadd must be less than %.1f\n",((2.0/100)*car1.getHadd()));
		
		do
		{
			System.out.printf("The difference is = %.1f SR\n",car1.getHadd()-usersoom);
			System.out.print("Please enter another soom> ");
			usersoom= read.nextDouble();
			
		} while(usersoom<=(car1.getHadd()-((2.0/100)*car1.getHadd())));
		
		System.out.printf("The difference is = %.1f SR which is less than %.1f",(car1.getHadd()-usersoom),(2.0/100*car1.getHadd()));
		
		read.close();
	}

}
