import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor2 {

    // Method to read integers from a file
    public ArrayList<Integer> readFile(String fileName) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    // Attempt to parse each line as an integer
                    numbers.add(Integer.parseInt(line));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format: " + line);
                }
            }
        }
        return numbers;
    }

    // Method to divide each number by the given divisor
    public List<Integer> divideNumbers(List<Integer> numbers, int divisor) {
        List<Integer> results = new ArrayList<>();
        for (int number : numbers) {
            try {
                results.add(number / divisor);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero error for number " + number);
                results.add(null); // Using null to indicate division error
            }
        }
        return results;
    }

    // Method to write results to a file
    public void writeFile(String fileName, List<Integer> numbers) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Integer number : numbers) {
                if (number != null) {
                    writer.write(number.toString());
                } else {
                    writer.write("Division by zero error");
                }
                writer.newLine();
            }
        }
    }

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        Scanner scanner = new Scanner(System.in);

        try {
            // Read integers from input file
            List<Integer> numbers = processor.readFile("input.txt");
            
            // Get divisor from user input
            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            // Perform division operation
            List<Integer> results = processor.divideNumbers(numbers, divisor);

            // Write results to output file
            processor.writeFile("output.txt", results);
            System.out.println("Results have been written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
