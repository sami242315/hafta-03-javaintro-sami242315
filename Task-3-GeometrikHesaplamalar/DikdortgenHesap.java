public class Rectangle {
    public static void main(String[] args) {
        double width = 4.5;   // En
        double height = 7.9;  // Boy

        double area = width * height;              // Alan = en * boy
        double perimeter = 2 * (width + height);  // Çevre = 2 * (en + boy)

        System.out.println("Dikdörtgenin eni: " + width);
        System.out.println("Dikdörtgenin boyu: " + height);
        System.out.println("Dikdörtgenin alanı: " + area);
        System.out.println("Dikdörtgenin çevresi: " + perimeter);
    }
}
