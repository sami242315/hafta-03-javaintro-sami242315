import java.util.Scanner;

public class UcgenHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan taban ve yükseklik al
        System.out.print("Üçgenin tabanını girin: ");
        double taban = input.nextDouble();
        System.out.print("Üçgenin yüksekliğini girin: ");
        double yukseklik = input.nextDouble();

        // Alan hesaplama
        double alan = (taban * yukseklik) / 2;

        System.out.println("Üçgenin alanı: " + alan);

        input.close();
    }
}
