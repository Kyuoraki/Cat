
public class Loader {
    public static void main(String[] args) {
        Cat Oleg = new Cat(0.0);
        Cat Kurlik = new Cat(0.0);
        Cat Vadik = new Cat(0.0);

        Oleg.setColor(Color.BLACK);
        Kurlik.setColor(Color.GREY);
        Vadik.setColor(Color.TRIPLE_COLOR);

        System.out.println("Oleg: " + Oleg.getColor());
        System.out.println("Kurlik: " + Kurlik.getColor());
        System.out.println("Vadik: " + Vadik.getColor());
    }
}