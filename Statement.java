import java.util.Scanner;

public class Statement {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter number");
        num = sc.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        }
        if (num % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
