import java.util.Scanner;

public class Thuchanh6 {
    public static void main(String[] args) {

        System.out.println("kiem tra nam nhuan");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap nam muon kiem tra ");
        int a=scanner.nextInt();
        if (a%100==0 &&a%400==0){
            System.out.println(a+ " la nam nhuan ");
        } else if (a%100!=0 && a%4==0) {
            System.out.println(a+ " la nam nhuan ");
        } else {
            System.out.println(a+ " khong la nam nhuan ");
        }
    }
}