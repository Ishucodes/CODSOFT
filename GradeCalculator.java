import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many subjects? ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double averagePercentage = total / n;
        String grade;

        if (averagePercentage >= 90)      grade = "A+";
        else if (averagePercentage >= 80) grade = "A";
        else if (averagePercentage >= 70) grade = "B";
        else if (averagePercentage >= 60) grade = "C";
        else if (averagePercentage >= 50) grade = "D";
        else                    grade = "F";

        System.out.println("\nRESULT" + "");
        System.out.println("Total Marks : " + total);
        System.out.println("averagePercentage     : " + averagePercentage + "%");
        System.out.println("Grade       : " + grade);

        sc.close();
    }
}


