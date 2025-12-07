package week1.day2;

public class Learnif {
	
	public static void main(String[]args) {
		int marks=40;
		//type if and do ctrl+space
		
		//if case
		if (marks>=35) {
			System.out.println("pass");		
		}
		
		//if else case
		if (marks>=50) {
			System.out.println("pass");
		} else {
			System.out.println("fail");

		}
		
		//nested if case
		int marks1=70;
				if (70==70) {
					System.out.println("GradeA");
				}
				else if(marks1<40){
					System.out.println("Fail");
				}
				else if(marks1>=85){
					System.out.println("Distinction");
				}
				else {
					System.out.println("Out of Range");
		}

	}
}
