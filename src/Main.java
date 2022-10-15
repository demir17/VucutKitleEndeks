import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double boy, kilo, endeks;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = sc.nextDouble();
        System.out.println();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo =sc.nextDouble();
        endeks = kilo / (boy * boy);
        System.out.println();
        System.out.println("Vücut kitle indeksiniz : " + endeks);
    }
}
