import java.util.Scanner;

public class DaireHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Kullanıcıdan yarıçapı al
        System.out.print("Dairenin yarıçapını girin: ");
        double r = input.nextDouble();
        
        // Alan ve çevre hesaplama
        double alan = Math.PI * r * r;
        double cevre = 2 * Math.PI * r;
        
        // Sonuçları yazdır
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
        
        input.close();
    }
}
