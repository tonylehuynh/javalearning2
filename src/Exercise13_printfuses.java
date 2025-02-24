public class Exercise13_printfuses {
    public static void main(String[] args){

        String name = "Jack";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        // %[flags][width][.precision][specifier-character]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 9000.99;
        double price2 = 100000.15;
        double price3 = -540.01;

        System.out.printf("%,.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%(.2f\n", price3);


        // width
        // 0 = zero padding
        // number = right justified padding
        // negative numbner = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
