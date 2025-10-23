public class Triangle {
    public static void main(String[] args) {
        double a = 3; // kısa kenar
        double b = 4; // uzun kenar (dik kenarlar)
        double c = 5; // hipotenüs

        // Dik üçgen alanı = (kısa kenar * uzun kenar) / 2
        double area = (a * b) / 2;

        System.out.println("Üçgenin kenarları: " + a + ", " + b + ", " + c);
        System.out.println("Üçgenin alanı: " + area);
    }
}
