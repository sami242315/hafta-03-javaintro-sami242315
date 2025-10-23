public class CarpimTablosu {
    public static void main(String[] args) {
        int sayi = 2;
        System.out.println("=== " + sayi + " Çarpım Tablosu ===");
        System.out.printf("%-5s %-5s %-5s%n", "Sayı", "Çarpan", "Sonuç"); // Başlık
        System.out.println("--------------------");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-5d %-5d %-5d%n", sayi, i, sayi * i);
        }
    }
}
