mport java.util.Scanner;

public class ComplexNumber {
    double real;
    double imaginary;
    ComplexNumber(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }

    public ComplexNumber add(ComplexNumber c2) {
        return new ComplexNumber(this.real + c2.real, this.imaginary + c2.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber c2) {
        double realPart = this.real * c2.real - this.imaginary * c2.imaginary;
        double imaginaryPart = this.real * c2.imaginary + this.imaginary * c2.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the real and imaginary part of the first number:");
        double real1 = s.nextDouble();
        double imaginary1 = s.nextDouble();

        System.out.println("Enter the real and imaginary part of the second number:");
        double real2 = s.nextDouble();
        double imaginary2 = s.nextDouble();

        ComplexNumber c1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber c2 = new ComplexNumber(real2, imaginary2);

        int choice;
        do {
            System.out.println("1. Add");
            System.out.println("2. Multiply");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    ComplexNumber sum = c1.add(c2);
                    System.out.println("Sum:");
                    sum.display();
                    break;

                case 2:
                    ComplexNumber product = c1.multiply(c2);
                    System.out.println("Product:");
                    product.display();
                    break;

                case 3:
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);

        s.close();
    }
}
