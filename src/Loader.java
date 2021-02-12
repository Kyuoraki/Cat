
public class Loader {
    public static void main(String[] args) {
        Cat Vasya = new Cat();
        Cat Musya = new Cat();
        Cat Kot = new Cat();
        Cat Pidor = new Cat();
        Cat Makimus = new Cat();
        Cat Oleg = new Cat();

        System.out.println("Vasya: " + Vasya.getWeight());
        Vasya.feed((double) 10);
        System.out.println(Vasya.getEatable());
        System.out.println("Vasya: " + Vasya.getWeight());
        Vasya.pee((double) 10);
        System.out.println("Vasya: " + Vasya.getWeight());

//        System.out.println("Musya: " + Musya.getWeight());
//        System.out.println("Kot: " + Kot.getWeight());
//        System.out.println("Pidor: " + Pidor.getWeight());
//        System.out.println("Makimus: " + Makimus.getWeight());
//        System.out.println("Oleg: " + Oleg.getWeight());

//        while (Makimus.getWeight() >= 1000) {
//            Makimus.meow();
//        }
//        System.out.println("Makimus: " + Makimus.getStatus());
//        System.out.println("Makimus: " + Makimus.getWeight());

//        while (Makimus.getWeight() <= 9000) {
//            Makimus.feed((double) 1);
//        }
//        System.out.println(Makimus.getStatus());

    }
}