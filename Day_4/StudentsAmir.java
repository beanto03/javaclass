import java.util.Scanner;
public class StudentsAmir {
    private String name;
    private int[][] scores = new scores[5][3];
    private double averagescore;

    public Student(String name, int[][] scores) {
        this.name = name;
        this.scores = scores;
    }

    //use to connect with front end (submitted form from user)
    public String getAverageScore() {
        calculateAverage(scores);
        return averagescore;
    }

    public void setAverageScore (double averagescore) {
        this.averagescore = averagescore;
    }

    public void calculateAverage(scores) {
        for (int row = 0; row < scores.length; row++) {
            for (int col = 0; col < scores[row].length; col++) {
                averagescore[col] = averagescore[col] + scores;
                averagescore[row] = averagescore[col]/3;
            }
        }
        return averagescore[row];
    }

    public void assignGrade(averagescore) {
        char grade;
        if (averagescore <= 90) {
            grade = "A";
        } else if (grade >= 80 && grade <= 89) {
            grade = "B";
        } else if (grade >= 70 && grade <= 79) {
            grade = "C";
        } else if (grade >= 60 && grade <= 69) {
            grade = "D";
        } else if (grade <60) {
            grade = "F";
        }
        return grade;
    }
    public static void main(String[] args) {
        Students[] student = new Students[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter student " + i);
            name[i] = sc.nextLine();
            System.out.println("Enter math score :");
            scores[i][0] = sc.nextLine();
            System.out.println("Enter science score :");
            scores[i][1] = sc.nextLine();
            System.out.println("Enter english score :");
            scores[i][2] = sc.nextLine();
        }

        for(int i; i < student.length; i++){
            student.displayStudent(student,averagescore);
        }
        
        public void displayStudent(String name, double averagescore) {
            System.out.println(name + " average score is " + averagescore);
        }
    }
}

    
