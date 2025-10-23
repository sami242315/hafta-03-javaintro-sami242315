public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo = 90.0;
        double boy = 1.80;
        
        // VKİ hesaplama
        double vki = kilo / (boy * boy);
        
        System.out.printf("Vücut Kitle İndeksiniz: %.2f%n", vki);
        
        // VKİ durumunu göster
        if (vki < 18.5) {
            System.out.println("Durum: Zayıf");
        } else if (vki < 24.9) {
            System.out.println("Durum: Normal");
        } else if (vki < 29.9) {
            System.out.println("Durum: Fazla kilolu");
        } else {
            System.out.println("Durum: Obez");
        }
    }
}
