import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "n"; 

        try {
            do {
                System.out.print("Enter first number: ");
                double n1 = sc.nextInt();

                System.out.print("Enter second number: ");
                double n2 = sc.nextInt();

                System.out.println("\n***** Calculator ******");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                

                System.out.print("What operation do you want to perform?(1,2,3,4): ");
                int choose = sc.nextInt();

                switch (choose) {
                    case 1:
                        System.out.println("Result: " + (n1 + n2));
                        break;
                    case 2:
                        System.out.println("Result: " + (n1 - n2));
                        break;
                    case 3:
                        System.out.println("Result: " + (n1 * n2));
                        break;
                    case 4:
     
                        if (n2 == 0) {
                            System.out.println("Error: Cannot divide by zero!");
                        } else {
                            System.out.println("Result: " + (n1 / n2));
                        }
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }

                System.out.print("Do you want to continue? (y/n): ");
                ans = sc.next();

            } while (ans.equalsIgnoreCase("y"));

        } catch (Exception e) {
          
            System.out.println("Invalid Input! Please use numbers.");
        }

        System.out.println("Thank you for using calculator");
        sc.close();
    }
}