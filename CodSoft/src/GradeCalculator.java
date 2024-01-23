// Task 2



import java.util.Scanner;

class GradeCalculator{
    public String calculateGrade(float percentage){
        if(percentage >= 90)
            return "A+";
        else if(percentage >= 85)
            return "A";
        else if(percentage >= 80)
            return "B+";
        else if(percentage >= 75)
            return "B";
        else if(percentage >= 70)
            return "C+";
        else if(percentage >= 65)
            return "C";
        else if(percentage >= 60)
            return "D+";
        else if(percentage >= 50)
            return "D";
        else
            return "Fail";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeCalculator grd = new GradeCalculator();
        System.out.print("Enter total subjects : ");
        int totalSubjects = sc.nextInt();
        int totalMarks = 0;
        for(int i=1; i <= totalSubjects; i++){
            System.out.print("Obtained Marks of subject "+i+" : ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }
        float percentage = (float) totalMarks /totalSubjects;
        String grade = grd.calculateGrade(percentage);

        System.out.println("Total Obtained Marks : "+totalMarks);
        System.out.println("Percentage : "+percentage);
        System.out.println("Grade : "+grade);
    }
}