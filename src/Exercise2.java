public class Exercise2 {

    public static void main(String[] args){

        int age = 21;
        int year = 2025;
        int quantity = 1;

        System.out.println(age);
        System.out.println("The year is " + year);
        System.out.println(quantity);

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("\n");
        System.out.println("price is " + price);
        System.out.println("gpa is " + gpa);
        System.out.println("temperature is " + temperature);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("\n");
        System.out.println("grade is " + grade);
        System.out.println("symbol is " + symbol);
        System.out.println("currency is " + currency);

        boolean isStudent = false;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println("\n");
        System.out.println("For sale? " + forSale);
        System.out.println("Are you online? " + isOnline);

        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are NOT a student");
        }


        String name = "Tony Le Huynh";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("\nMy name is " + name);
        System.out.println("Favourite food is " + food);
        System.out.println("My email is " + email);

        System.out.println("I am " + age + " years old");


        System.out.println("My car is a " + color + " " + year + " " + car + " ");

        System.out.println("The prie is: " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is NOT for sale");
        }
    }
}
