//Q.	Grading System: Develop a Java program to determine the grade of a student based on their exam scores.
//                      Prompt the user to input their exam scores for three subjects. 
//                      Calculate the average score and determine their grade according to the following criteria:
//•	Average score >= 90: Grade A
//•	80 <= Average score < 90: Grade B
//•	70 <= Average score < 80: Grade C
//•	60 <= Average score < 70: Grade D
//•	Average score < 60: Grade F

import java.util.Scanner;

public class Conditions2 {

	public static void main(String[] args) {
		
		System.out.println("Result based on your performance");
		
		System.out.println();
		
//		physics marks input
		System.out.println("Enter the marks of PHYSICS");
		Scanner sc1 = new Scanner(System.in);
		int physics = sc1.nextInt();
		
//		chemistry marks input
		System.out.println("Enter the marks of CHEMISTRY");
		Scanner sc2 = new Scanner(System.in);
		int chemistry = sc2.nextInt();
		
//		maths marks input
		System.out.println("Enter the marks of MATHS");
		Scanner sc3 = new Scanner(System.in);
		int maths = sc3.nextInt();
		
		System.out.println();
		
		System.out.println("According to the marks your final Result is :");
		
		int score = physics + chemistry + maths;
		int averageScore = score/3;
		
		if(averageScore >= 90 && averageScore<= 100) {
			System.out.println("A+ Grade");
		}else if(averageScore >= 80 && averageScore < 90) {
			System.out.println("B Grade");
		}else if(averageScore >= 70 && averageScore < 80) {
			System.out.println("C Grade");
		}else if(averageScore >= 60 && averageScore < 70) {
			System.out.println("D Grade");
		}else if(averageScore < 60) {
			System.out.println("F Grade");
		}else {
			System.out.println("Wrong input");
		}
	}

}
