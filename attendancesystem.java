package classattendance;

public class attendancesystem {
	print("Do you want to enter attendance for another day? (Y/N): ");
    choice = sc.next().charAt(0);

} while ((choice == 'Y' || choice == 'y') && days < 30);

// 3. Process data
int totalAttendance = 0;
int lowAttendanceDays = 0;

System.out.println("\n--- Attendance Report ---");
System.out.println("Day\tStudents Present");
for (int i = 0;
private double days; i < days; i++) {
    int[] attendance;
	System.out.println((i + 1) + "\t" + attendance[i]);
    totalAttendance += attendance[i];

    int totalStudents;
	if (attendance[i] < (totalStudents / 2)) {
        lowAttendanceDays++;
    }
}

// Calculate average
double average = (double) totalAttendance / days;
double lowPercentage = ((double) lowAttendanceDays / days) * 100;

System.out.println("\nAverage Attendance: " + average);
System.out.println("Low Attendance Days (<50%): " + lowAttendanceDays);
System.out.println("Percentage of Low Attendance Days: " + lowPercentage + "%");

sc.close();
}
}


