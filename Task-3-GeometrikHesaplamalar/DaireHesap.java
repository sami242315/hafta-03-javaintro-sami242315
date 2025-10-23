public class Circle {
    public static void main(String[] args) {
        double radius = 5.5;
        double area = Math.PI * radius * radius;       // Alan = π * r^2
        double circumference = 2 * Math.PI * radius;  // Çevre = 2 * π * r

        System.out.println("Dairenin yarıçapı: " + radius);
        System.out.println("Dairenin alanı: " + area);
        System.out.println("Dairenin çevresi: " + circumference);
    }
}
