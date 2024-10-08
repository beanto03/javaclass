package Day_5;

import java.util.Scanner;
public class EmployeeAmir {

    static class Employee {

        private String name;
        private double baseSalary = 0;
        private double healthAllowance;
        private double transportAllowance;
        private double totalAllowances;
        private double bonus;
        private double totalSalary = 0;
    

        public String getName() {
            return name;
        }

        public double getBaseSalary() {
            return baseSalary;
        }

        public double getHealthAllowance() {
            return healthAllowance;
        }

        public double getTransportAllowance() {
            return transportAllowance;
        }

        public double getTotalAllowance() {
            return totalAllowances;
        }

        public double getBonus() {
            return bonus;
        }

        public double getTotalSalary() {
            return totalSalary;
        }

        public double calculateTotalSalary(double baseSalary, double totalAllowances, double bonus) {
            totalSalary = baseSalary + totalAllowances + bonus;
            return totalSalary;
        }

        public double assignBonus(double baseSalary) {
            if (baseSalary > 50000) {
                bonus = baseSalary * 1.10;
            } else if (baseSalary >= 30000 && baseSalary <= 50000) {
                bonus = baseSalary * 1.05;
            } else {
                bonus = 0;
            }
            return bonus;
        }

        public double setTotalAllowances(double healthAllowance, double transportAllowance) {
            double totalAllowances = healthAllowance + transportAllowance;
            return totalAllowances;
        }

        //constructor .
        public Employee(String name, double baseSalary, double healthAllowance, double transportAllowance){
            this.name = name;
            this.baseSalary = baseSalary;
            this.healthAllowance = 0;
            this.transportAllowance = 0;
            this.totalAllowances = setTotalAllowances(healthAllowance, transportAllowance);
            this.bonus = assignBonus(baseSalary);
            this.totalSalary = calculateTotalSalary(baseSalary, totalAllowances, bonus);
        }
    }
    

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Create an array to hold a list of 5 employee.
        System.out.println("Number of employee");
        int employeeCount = scanner.nextInt();

        EmployeeAmir employee = new EmployeeAmir();

        for (int i = 0; i < employeeCount; i++) {

            System.out.print("Enter name of employer " + (i + 1) + ": ");
            String nameInput = scanner.nextLine();

            System.out.print("Base salary for " + nameInput + ": ");
            double baseSalaryInput = scanner.nextDouble();

            System.out.print("Health allowance for " + nameInput + ": ");
            double healthAllowanceInput = scanner.nextDouble();

            System.out.print("Transportation allowance for " + nameInput + ": ");
            double transportAllowanceInput = scanner.nextDouble();

            Employee[i] = new Employee(nameInput, baseSalaryInput, healthAllowanceInput, transportAllowanceInput);
        }

        // Loop to display each student's na`me, average score, and assigned grade
        System.out.println("\nEmployee Details:");
        for (EmployeeAmir employees : employee) {
            System.out.println("Name: " + employees.name);
            System.out.println("Base salary: " + employees.baseSalary);
            System.out.println("Health allowance: " + employees.healthAllowance);
            System.out.println("Transportation allowance: " + employees.transportAllowance);
            System.out.println("Total allowance: " + employees.totalSalary);
        }

        scanner.close();
            
    }

}