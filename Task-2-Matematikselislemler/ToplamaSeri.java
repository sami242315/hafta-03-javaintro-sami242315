import java.util.Scanner;

public class ToplamaSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        int toplam = 0;
        for (int i = 1; i <= n; i++) {
            toplam += i;
        }

        System.out.println("1'den " + n + "'ye kadar olan sayıların toplamı: " + toplam);
    }
}
