public class StudentRadia {

    
    static class Student {
        
        private String name;
        private int[] scores = new int[3]; 
        private double avgScore;

        
        public Student(String name, int math, int science, int english) {
            this.name = name;
            this.scores[0] = math;   
            this.scores[1] = science;
            this.scores[2] = english; 
        }

        
        public String getName() {
            return name;
        }

    
        public int[] getScores() {
            return scores;
        }

        
        public double calcAvrg() {
            int total = 0;
            for (int score : scores) {
                total += score;
            }
            this.avgScore = total / 3.0; 
            return this.avgScore;
        }

        
        public char assignGrade() {
            if (this.avgScore >= 90) {
                return 'A';
            } else if (this.avgScore >= 80) {
                return 'B';
            } else if (this.avgScore >= 70) {
                return 'C';
            } else if (this.avgScore >= 60) {
                return 'D';
            } else {
                return 'F';
            }
        }

        
        public void displayStudentInfo() {
            System.out.println("Student Name: " + getName());
            System.out.println("Math Score: " + scores[0]);
            System.out.println("Science Score: " + scores[1]);
            System.out.println("English Score: " + scores[2]);
            System.out.println("Average Score: " + calcAvrg());
            System.out.println("Grade: " + assignGrade());
        }
    }

    
    public static void main(String[] args) {
        
        Student[] students = new Student[5];

        students[0] = new Student("Radaiatul", 85, 78, 92);
        students[1] = new Student("Aisyah", 90, 88, 91);
        students[2] = new Student("Abdullah", 60, 65, 70);
        students[3] = new Student("Pasraisy", 72, 76, 80);
        students[4] = new Student("Belle", 95, 99, 94);

        
        for (Student student : students) {
            student.displayStudentInfo();
            System.out.println("");
        }
    }
}