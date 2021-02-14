
public class Loader {
    public static void main(String[] args) {
        Cat Vasya = new Cat();
        Cat Musya = new Cat();
        Cat Kot = new Cat();
        Cat Pidor = new Cat();
        Cat Makimus = new Cat();
        Cat Oleg = new Cat();

        System.out.println("Vasya: " + Vasya.getWeight());
        System.out.println("Кол-во котов: " + Cat.getCount());

        System.out.println("Musya: " + Musya.getWeight());
        System.out.println("Kot: " + Kot.getWeight());
        System.out.println("Pidor: " + Pidor.getWeight());
        System.out.println("Makimus: " + Makimus.getWeight());
        Oleg.pee((double) 10000);
        System.out.println("Oleg: " + Oleg.getStatus());
        Pidor.feed((double) 10000);
        System.out.println("Pidor: " + Pidor.getStatus());
        Oleg.pee((double) 1);
        Pidor.feed((double) 1);
        Oleg.meow();
        Pidor.drink((double) 1);
        System.out.println("Сколько съел%: " + Oleg.getEatable());
        Oleg.getEatable();
        System.out.println("Кол-во котов: " + Cat.getCount());



//        while (Makimus.getWeight() >= 1000) {
//            Makimus.meow();
//        }
//        System.out.println("Makimus: " + Makimus.getStatus());
//        System.out.println("Makimus: " + Makimus.getWeight());
//
//        while (Makimus.getWeight() <= 9000) {
//            Makimus.feed((double) 1);
//        }
//        System.out.println(Makimus.getStatus());

    }
}