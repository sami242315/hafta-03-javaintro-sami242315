import java.util.Scanner;

public class DikdortgenHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan uzun ve kısa kenarları al
        System.out.print("Dikdörtgenin uzun kenarını girin: ");
        double uzun = input.nextDouble();
        System.out.print("Dikdörtgenin kısa kenarını girin: ");
        double kisa = input.nextDouble();

        // Alan ve çevre hesaplama
        double alan = uzun * kisa;
        double cevre = 2 * (uzun + kisa);

        // Sonuçları yazdır
        System.out.println("Dikdörtgenin alanı: " + alan);
        System.out.println("Dikdörtgenin çevresi: " + cevre);

        input.close();
    }
}
