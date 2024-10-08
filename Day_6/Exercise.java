import java.util.ArrayList;
import java.util.function.Predicate;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Exercise {
    public static void main(String[] args) {
        LocalDateTime nowDT = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        String formattedDT = formatter.format(nowDT);

        Predicate<Double>salaryCheck = (salary) -> salary > 1500;
        ArrayList<String>name = new ArrayList<>();

        name.add("Amir");
        name.add("Abuya");
        name.add("Anjir");

        ArrayList<Double>salary = new ArrayList<>();

        salary.add(2000.0);
        salary.add(1500.0);
        salary.add(1000.0);

        for (int i = 0; i < name.size(); i++){
            System.out.println("New employee");
            System.out.println("---------------------------");
            System.out.println("Name: " + name.get(i));
            System.out.println("Salary: " + salary.get(i));
            if (salaryCheck.test(salary.get(i))) {
                System.out.println("Mode: :-) ");
            } else {
                System.out.println("Mode: :-( ");
            }
            System.out.println(formattedDT);
            System.out.println("---------------------------");

        }
    }
}
