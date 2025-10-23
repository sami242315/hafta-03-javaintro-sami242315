public class ShoppingList {
    public static void main(String[] args) {
        // Ürün bilgileri
        String[] products = {"Elma", "Ekmek", "Süt", "Peynir"};
        int[] quantities = {3, 2, 1, 1};
        double[] prices = {2.5, 5.0, 4.0, 12.0};

        double total = 0;

        System.out.println("**************** ALIŞVERİŞ LİSTESİ ****************");
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Ürün", "Miktar", "Birim Fiyat", "Tutar");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < products.length; i++) {
            double subtotal = quantities[i] * prices[i];
            total += subtotal;
            System.out.printf("%-10s %-10d %-10.2f %-10.2f%n", products[i], quantities[i], prices[i], subtotal);
        }

        System.out.println("-----------------------------------------------------");
        System.out.printf("%-32s %-10.2f%n", "Genel Toplam:", total);
        System.out.println("*****************************************************");
    }
}
