import java.util.Scanner;

public class SaniyeDonustur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saniye girin: ");
        int toplamSaniye = scanner.nextInt();
        
        int saat = toplamSaniye / 3600;          // 1 saat = 3600 saniye
        int kalanSaniye = toplamSaniye % 3600;  
        int dakika = kalanSaniye / 60;           // 1 dakika = 60 saniye
        int saniye = kalanSaniye % 60;           // Kalan saniye
        
        System.out.printf("%d saniye = %02d:%02d:%02d%n", toplamSaniye, saat, dakika, saniye);
        
        scanner.close();
    }
}
