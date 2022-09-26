package ThucHanh3;

import java.util.Scanner;

public class Thuchanh3 {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width=scanner.nextFloat();
        System.out.println("Enter height :");
        height=scanner.nextFloat();
        float DT=width*height;
        System.out.println("DT la :"+DT);
    }
}
