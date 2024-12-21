package TestConditionalStatements;

public class SimpleMethods {
    
    int score;
    char grade;

    // empty constructor
    SimpleMethods() {    
    }

    // parameterized constructor
    SimpleMethods(int score) {
        this.score = score;
    }
    

    public void setScore(int score) {
        this.score = score;
    }       
    
    // get score in int format
    public int getScore() {
        return score;
    }

   

    // get score in char format
    public char getGrade() {
        if (score >= 90) {
            grade = 'A';
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
}
