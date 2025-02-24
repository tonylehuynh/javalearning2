import java.util.Scanner;

public class Exercise11_hypotenuseCalc {
    public static void main(String[] args){

        // Hypotenuse c = Math.sqrt(a^2 + b^2)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));

        System.out.println("The hypotenuse (side c) is: " + c + "mm");

        scanner.close();
    }
}
