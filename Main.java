import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter exercise number (1-10): ");
        int exercise = scanner.nextInt();

        if (exercise == 1) {
            f1();
        } else if (exercise == 2) {
            f2();
        } else if (exercise == 3) {
            f3();
        } else if (exercise == 4) {
            f4();
        } else if (exercise == 5) {
            f5();
        } else if (exercise == 6) {
            f6();
        } else if (exercise == 7) {
            f7();
        } else if (exercise == 8) {
            f8();
        } else if (exercise == 9) {
            f9();
        } else if (exercise == 10) {
            f10();
        } else {
            System.out.println("Invalid exercise number");
        }
    }

    public static void f1() {
        System.out.print("Enter Your first name: ");
        String firstname = scanner.next();

        System.out.print("Enter Your age in years: ");
        int age = scanner.nextInt();

        System.out.print("Enter Your height in meters: ");
        float height = scanner.nextFloat();

        System.out.print("Last name initial: ");
        String ini = scanner.next();

        System.out.println("Name: " + firstname);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Last name initial: " + ini.charAt(0));
        System.out.println("Age in 10 years: " + (age + 10));
    }

    public static void f2() {
        System.out.print("Enter seconds: ");
        int secs = scanner.nextInt();

        int minutes, hours = 0;

        minutes = secs / 60;
        secs = secs % 60;

        hours = minutes / 60;
        minutes = minutes % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + secs);

    }

    public static void f3() {
        System.out.print("Bill: ");
        float bill = scanner.nextFloat();
        System.out.print("Tip percentage: ");
        float tipPer = scanner.nextFloat();
        System.out.print("People: ");
        int ppl = scanner.nextInt();

        float totalTip = bill * (tipPer / 100);
        float totalBill = bill + totalTip;
        float perPerson = totalBill / ppl;

        System.out.printf("Tip: %.1f\n", totalTip);
        System.out.printf("Total: %.1f\n", totalBill);
        System.out.printf("Per person: %.1f\n", perPerson);


    }

    public static void f4() {

        for (int i = 0; i < 3; i++) {
            System.out.print("Price: ");
            float price = scanner.nextFloat();
            System.out.print("Amount bought: ");
            float amount = scanner.nextFloat();
            System.out.print("Discount percentage: ");
            float discount = scanner.nextFloat();

            float fullprice = price + price * (discount / 100);

            System.out.printf("Without discount: %.1f\n", fullprice);
            System.out.printf("Discount reduced: %.1f\n", (price - fullprice));
            System.out.printf("Initial price: %.1f\n", price);


        }


    }

    public static void f5() {
        System.out.print("Distance: ");
        double distance = scanner.nextDouble();
        System.out.print("Time in minutes: ");
        int minutes = scanner.nextInt();

        double hours = minutes / 60.0;
        double speed = distance / hours;

        System.out.println("Time in horus: " + hours);
        System.out.printf("Average speed: %.1f km per hour", speed);
        System.out.printf("Distance in one hour: %.1f km per hour", speed);
    }


    public static void f6() {
        System.out.print("Assignments: ");
        double assignments = scanner.nextDouble();
        System.out.print("Quiz: ");
        double quiz = scanner.nextDouble();
        System.out.print("Final exam: ");
        double exam = scanner.nextDouble();

        double finalGrade = assignments * 0.2 + quiz * 0.3 + exam * 0.5;

        System.out.printf("Final grade: %.1f\n", finalGrade);
        if (finalGrade >= 60) {
            System.out.println("Result: Pass");
        } else System.out.println("No pass :(");

    }
    public static void f7() {
        System.out.print("First number: ");
        int a = scanner.nextInt();
        System.out.print("Second number: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("The first number is greater");
        } else if (b > a) {
            System.out.println("The second number is greater");
        } else {
            System.out.println("The numbers are equal");
        }

        if (a % 2 == 0) {
            System.out.println("The first number is even");
        } else {
            System.out.println("The first number is odd");
        }

        if (b % 5 == 0) {
            System.out.println("The second number is divisible by 5");
        } else {
            System.out.println("The second number is not divisible by 5");
        }

        int sum = a + b;
        if (sum > 0) {
            System.out.println("The sum is positive");
        } else if (sum < 0) {
            System.out.println("The sum is negative");
        } else {
            System.out.println("The sum is zero");
        }
    }

    public static void f8()
    {
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age < 0)
        {
            System.out.println("Invalid age");
        }
        else if (age < 6)
        {
            System.out.println("Ticket price: 0");
        }
        else if (age < 18)
        {
            System.out.println("Ticket price: 30");
        }
        else if (age < 65)
        {
            System.out.println("Ticket price: 45");
        }
        else
        {
            System.out.println("Ticket price: 25");
        }
    }
    public static void f9() {

        System.out.print("Enter word: ");
        String word = scanner.next();


        System.out.println("Length: " + word.length());
        System.out.println("Uppercase: " + word.toUpperCase());

        System.out.println("Lowercase: " + word.toLowerCase());
        System.out.println("First character: " + word.charAt(0));

        System.out.println("Last character: " + word.charAt(word.length() - 1));



    }


    public static void f10() {


        int a1 = 7;
        int b1 = 2;

        System.out.println(a1 / b1);
        System.out.println(a1 / 2.0);

        System.out.println("prediction: 3 and 3.5, first one is obv but in the second print the operand is a double so the result is a fraction");


        int num = 2147483647;
        System.out.println(num);
        System.out.println(num + 1);

        System.out.println("prediction: int overflow, the first print is alright but the second one overflows it");


        double a2 = 0.1;
        double b2 = 0.2;

        System.out.println(a2 + b2);
        System.out.println(a2 + b2 == 0.3);

        System.out.println("Prediction: 0.30000...1 and false.. because fractions cant be stored exactly in binary");



        float smallPrecision = 100000000.0f;
        double highPrecision = 100000000.0;

        System.out.println(smallPrecision + 1);
        System.out.println(highPrecision + 1);

        System.out.println("Prediction was wrong... float has 7 digits of precision so the added 1 was lost. double has 15 digits of precision so it was fine");


        //שאלת סיכום: מדוע חשוב להבין את גודל הטיפוס ואת דרך הייצוג שלו בזיכרון, ולא רק כיצד מכריזים על משתנה?
        // גם בשביל להישתמש בזיכרון באופן יעיל אבל גם במקרה ויש לנו באגים בדיוק כמו שיש פה


    }
}
