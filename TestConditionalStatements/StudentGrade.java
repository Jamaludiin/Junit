package TestConditionalStatements;

public class StudentGrade {
    // Write a program that takes a student's score and outputs their grade based on the following criteria:
    // Score >= 90 -> "A"
    // Score >= 80 -> "B"
    // Score >= 70 -> "C"
    // Score >= 60 -> "D"
    // Score < 60 -> "F"

    int score = 0;
    char grade = 'A';

    char getGrade(int score) {

        if (score >= 90) {
            grade = 'A';
            return grade;
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        StudentGrade studentGrade = new StudentGrade();
        System.out.println(studentGrade.getGrade(95));
    }
}
