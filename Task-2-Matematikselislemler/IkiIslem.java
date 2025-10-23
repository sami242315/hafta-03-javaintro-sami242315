import java.util.Scanner;

public class IkiIslem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        int toplam = sayi1 + sayi2;
        int fark = sayi1 - sayi2;

        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
    }
}
