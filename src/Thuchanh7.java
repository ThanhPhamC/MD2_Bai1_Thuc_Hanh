import java.util.Scanner;

public class Thuchanh7 {
    public static void main(String[] args) {
        System.out.println("kiem tra chi so co the");
        Scanner scanner=new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("nhap can nang cua ban weight= ");
        weight=scanner.nextDouble();
        System.out.println("nhap chieu cao cua ban height= ");
        height=scanner.nextDouble();
        bmi=weight/Math.pow(height,2);
        if (bmi<18.5){
            System.out.println(" Underweight");
        } else if (bmi<25) {
            System.out.println(" Normal");
        } else if (bmi<30) {
            System.out.println(" overweight");
        } else  {
            System.out.println(" obese");
        }
    }
}