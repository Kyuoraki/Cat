
public class Loader {
    public static void main(String[] args) {
        Cat murka = new Cat("Murka", 3000.00);
        System.out.println(murka.getWeight());
        System.out.println(murka.getStatus());
        Cat vasya = new Cat(murka) ;
        System.out.println(vasya.getWeight());
        System.out.println(vasya.getStatus());

    }
}