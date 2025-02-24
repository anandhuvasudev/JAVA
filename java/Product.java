import java.util.Scanner;

class Product {
    String pcode;
    String pname;
    double price;

    public void setProductDetails(String pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    public void display() {
        System.out.println("Product code : " + pcode);
        System.out.println("Product name : " + pname);
        System.out.println("Price: " + price);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int n = s.nextInt();
        s.nextLine();

        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            products[i] = new Product();
            System.out.println("\nEnter the details for product " + (i + 1) + ":");
            System.out.print("Product code: ");
            String pcode = s.nextLine();
            System.out.print("Product name: ");
            String pname = s.nextLine();
            System.out.print("Price: ");
            double price = s.nextDouble();
            s.nextLine();

            products[i].setProductDetails(pcode, pname, price);
        }

        Product lowestPrice = products[0];
        for (int i = 1; i < n; i++) {
            if (products[i].price < lowestPrice.price) {
                lowestPrice = products[i];
            }
        }

        System.out.println("Product with lowest price:");
        lowestPrice.display();
        s.close();
    }
}
