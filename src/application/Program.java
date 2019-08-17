package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.ptrimestre = sc.nextDouble();
		student.strimestre = sc.nextDouble();
		student.ttrimestre = sc.nextDouble();
		
		System.out.print("FINAL GRADE = " + student);
		
		if (student.calculaNota() >= 60.00) {
		    System.out.println();
			System.out.println("PASS");
		}
		else {
			System.out.println();
			System.out.print("FAILED");
			System.out.println();
			double dif = student.difNota();
			System.out.println("MISSING " + dif + " POINTS");
		}
		
		sc.close();
		

	}

}
