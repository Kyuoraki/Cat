
public class Loader {
    public static void main(String[] args) {
        Cat Vasya = new Cat("Vasya");
        Cat Musya = new Cat("Musya");
        Cat Kot = new Cat("Kot");
        Cat Pidor = new Cat("Pidor");
        Cat Makimus = new Cat("Makimus");
        Cat Oleg = new Cat("Oleg");

        System.out.println("Vasya: " + Vasya.getWeight());
        System.out.println("Musya: " + Musya.getWeight());
        System.out.println("Kot: " + Kot.getWeight());
        System.out.println("Pidor: " + Pidor.getWeight());
        System.out.println("Makimus: " + Makimus.getWeight());
        System.out.println("Oleg: " + Oleg.getWeight());

        Vasya.setCatColor(Color.GREY);

        Musya.setCatColor(Color.TRIPLE_COLOR);
        Vasya.feed((double) 10000);

        Vasya.getEatable();
//        System.out.println("sfdgdfg" + Vasya.getEatable());
//        Vasya.getEatable();

    }
}