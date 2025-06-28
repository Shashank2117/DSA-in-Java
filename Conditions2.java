// 2.	Grading System: Develop a Java program to determine the grade of a student based on their exam scores.
//      Prompt the user to input their exam scores for three subjects. 
//      Calculate the average score and determine their grade according to the following criteria:
// •	Average score >= 90: Grade A
// •	80 <= Average score < 90: Grade B
// •	70 <= Average score < 80: Grade C
// •	60 <= Average score < 70: Grade D
// •	Average score < 60: Grade F


import java.util.Scanner;
public class Conditions2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculating Grades");
        System.out.println();

        System.out.println("Enter Marks of Maths :");
        int math = sc.nextInt();

        System.out.println();

        System.out.println("Enter Marks of Physics :");
        int phy = sc.nextInt();

        System.out.println();

        System.out.println("Enter Marks of Chemistry :");
        int chem = sc.nextInt();

        System.out.println();

        int average = (math + phy + chem) / 3;

        if (average >= 90) {
            System.out.println("A Grade");

        }else if (average >= 80 && average < 90) {
            System.out.println("B Grade");

        }else if (average >= 70 && average < 80) {
            System.out.println("C Grade");

        }else if (average >= 60 && average < 70) {
            System.out.println("D Grade");

        }else if (average >= 0 && average > 60) {
            System.out.println("Fail");

        }else{
            System.out.println("Please Enter Valid Number of Subjects ");
        }


    }
}
