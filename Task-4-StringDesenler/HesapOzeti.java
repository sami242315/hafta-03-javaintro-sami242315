public class AlisverisListesiOrnek {
    public static void main(String[] args) {
        // Önceden tanımlı ürünler, miktar ve birim fiyatlar
        String[] urunAdlari = {"Elma", "Ekmek", "Süt", "Peynir", "Çikolata"};
        int[] urunMiktari = {3, 2, 1, 1, 5}; // adet veya paket
        double[] urunFiyati = {5.0, 7.5, 8.0, 15.0, 3.5}; // TL cinsinden

        double toplamTutar = 0;

        // Özet yazdır
        System.out.println("================= ALIŞVERİŞ ÖZETİ =================");
        System.out.printf("%-15s %-10s %-12s %-10s\n", "Ürün", "Miktar", "Birim Fiyat", "Tutar");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < urunAdlari.length; i++) {
            double tutar = urunMiktari[i] * urunFiyati[i];
            toplamTutar += tutar;
            System.out.printf("%-15s %-10d %-12.2f %-10.2f\n", urunAdlari[i], urunMiktari[i], urunFiyati[i], tutar);
        }

        System.out.println("--------------------------------------------------");
        System.out.printf("TOPLAM TUTAR: %.2f TL\n", toplamTutar);
        System.out.println("==================================================");
    }
}
