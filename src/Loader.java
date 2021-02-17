
public class Loader {
    private static Cat getKitten(Double weight)
    {
        Cat x = new Cat(1100.00);
        return x;
    }
    public static void main(String[] args) {
        Cat Oleg = getKitten(0.00);
        Cat Kurlik = getKitten(0.00);
        Cat Vadik = getKitten(0.00);

        System.out.println("Oleg " + Oleg.getWeight());
        System.out.println("Kurlik " + Kurlik.getWeight());
        System.out.println("Vadik " + Vadik.getWeight());
    }
}