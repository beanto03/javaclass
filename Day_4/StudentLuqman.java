package Day_4;

import java.util.Scanner;
public class StudentLuqman {

    private String name;
    private int[] scores;
    private double averageScore;


    
    //constructor .
    public StudentLuqman(String name, int[] scores){
        this.name = name;
        this.scores = scores;
    }
        // public void setScores(int[] scores){
    //     this.scores = scores;
    // }
        // public void setName(String name){
    //     this.name = name;
    // }



    public String getName(){
        return name;
    }



    public int[] getScores(){
        return scores;
    }


    public void setAverageScore(double averageScore){
        this.averageScore = averageScore;
    }

    public double getAverageScore(){
        return averageScore;
    }

    public double calculateAverage(){
        for(int score: scores){
            total += score;          
        }
        averageScore = (double)scores.length;
        return averageScore; 
        
    }

    public char assignGrade(){  
            if(averageScore >= 90){
                return 'A';
            }else if (averageScore >= 80 && averageScore <= 89){
                return 'B';
            }else if (averageScore >= 70 && averageScore <= 79){
                return 'C';
            }else if (averageScore >= 60 && averageScore <= 69){
                return 'D';
            }else{
                return 'F';
            }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Create an array to hold a list of 5 students.
        StudentLuqman[] students = new StudentLuqman[5]; 

        for (int i = 0; i < students.length; i++) {

            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter scores for Math, Science, and English (separated by space): ");
            String[] scoreInputs = scanner.nextLine().split(" ");
            int[] scores = new int[3];

            for (int j = 0; j < scores.length; j++) {
                scores[j] = Integer.parseInt(scoreInputs[j]);
            }

            students[i] = new StudentLuqman(name, scores);
        }

                // Loop to display each student's name, average score, and assigned grade
                System.out.println("\nStudent Details:");
                for (StudentLuqman student : students) {
                    double averageScore = student.calculateAverage();
                    char grade = student.assignGrade();
                    System.out.println("Name: " + student.getName() + ", Average Score: " + averageScore + ", Grade: " + grade);
                }
                scanner.close();
            
    }

}