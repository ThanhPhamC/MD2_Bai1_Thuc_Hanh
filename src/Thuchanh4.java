import java.util.Scanner;
public class Thuchanh4 {
    public static void main(String[] args) {
        System.out.println("Giai Phuong trinh bac nhat");
        System.out.println("a*x + b = c.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a :");
        double a = scanner.nextDouble();
        System.out.println("Enter b :");
        double b = scanner.nextDouble();
        System.out.println("Enter c :");
        double c = scanner.nextDouble();
        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("Phuong trinh co nghiem duy nhat x= " + x);
        } else {
            if (b == c) {
                System.out.println("phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }

}
