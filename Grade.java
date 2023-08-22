package my_java_project;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		int rno;
		String name,class1;
		int physics,chemistry,biology,math,it;
		
		System.out.println("");
		System.out.println("");
		System.out.println("Enter Student ROLL NUMBER :- ");
		rno = sc.nextInt();
		System.out.println("Enter Student Name :- ");
		name = sc.next();
		System.out.println("Enter Student Class :- ");
		class1 = sc.next();
		System.out.println("Enter the Marks PHYSICS :- ");
		physics = sc.nextInt();
		System.out.println("Enter the Marks CHEMISTRY :- ");
		chemistry = sc.nextInt();
		System.out.println("Enter the Marks BIOLOGY :- ");
		biology = sc.nextInt();
		System.out.println("Enter the Marks MATH :- ");
		math = sc.nextInt();
		System.out.println("Enter the Marks IT :- ");
		it = sc.nextInt();
		
		int total,averge;
		String grade;
		
		total = physics + chemistry + biology + math + it;
		
		averge = total / 5;
		
		if(averge >= 80)
		{
			grade = "A";
		}
		else if(averge >= 70)
		{
			grade = "B";
		}
		else if(averge >= 60)
		{
			grade = "C";
		}
		else if(averge >= 50)
		{
			grade = "D";
		}
		else if(averge >= 40)
		{
			grade = "F";
		}
		else
		{
			grade = "FAIL!!!";
		}
		
		System.out.println("Total obtain marks of Student : "+total);
		System.out.println("Averge Percentage Of marks is : "+averge);
		System.out.println("Obtain GRADE : "+grade);
        System.out.println("");

	}

}
