public class MilToKilometre {
    public static void main(String[] args) {
        double[] mil = {1, 5, 10, 20, 50};
        double cevirimKatsayisi = 1.60934;

        System.out.println("Mil\tKilometre");
        System.out.println("----------------");

        for (double m : mil) {
            double km = m * cevirimKatsayisi;
            System.out.printf("%.0f\t%.3f\n", m, km);
        }
    }
}
