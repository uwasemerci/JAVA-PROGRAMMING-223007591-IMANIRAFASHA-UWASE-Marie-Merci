package exammarks;

import java.util.Scanner;

public class studentgrade {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int totalStudents = 0;
	        int passes = 0;
	        int fails = 0;
	        char choice;

	        do {
	            // 1. Ask for student mark
	            System.out.print("Enter student mark (0-100): ");
	            int mark = sc.nextInt();

	            // 2. Assign grade
	            String grade;
	            if (mark >= 80 && mark <= 100) {
	                grade = "A";
	            } else if (mark >= 70) {
	                grade = "B";
	            } else if (mark >= 60) {
	                grade = "C";
	            } else if (mark >= 50) {
	                grade = "D";
	            } else {
	                grade = "F";
	            }

	            // Print grade immediately
	            System.out.println("Student grade: " + grade);

	            // Update counters
	            totalStudents++;
	            if (mark >= 50) {
	                passes++;
	            } else {
	                fails++;
	            }

	            // 3. Ask whether to continue
	            System.out.print("Do you want to enter another mark? (Y/N): ");
	            choice = sc.next().charAt(0);

	        } while (choice == 'Y' || choice == 'y');

	        // 4. Print summary
	        System.out.println("\n--- Summary Report ---");
	        System.out.println("Total students: " + totalStudents);
	        System.out.println("Passed: " + passes);
	        System.out.println("Failed: " + fails);

	        if (totalStudents > 0) {
	            double passRate = ((double) passes / totalStudents) * 100;
	            System.out.println("Class Pass Rate: " + passRate + "%");
	        } else {
	            System.out.println("No student data entered.");
	        }

	        sc.close();
	    }
	}


