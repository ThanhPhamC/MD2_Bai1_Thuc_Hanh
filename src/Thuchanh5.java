import java.util.Scanner;

public class Thuchanh5 {
    public static void main(String[] args) {

        System.out.println("kiem tra so ngay cua 1 thang");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang muon kiem tra: ");
        int a = scanner.nextInt();
        switch (a) {
            case 2:
                System.out.println("Thang " + a + " co 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" Thang " + a + " co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + a + " co 30 ngay");
                break;
            default:
                System.out.println("So ban nhap khong phai la thang");
        }
    }
}