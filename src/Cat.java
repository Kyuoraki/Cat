
public class Cat {
    private static int count;
    private static String status;

    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double eatable;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;

    }
    public void meow() {
        if (weight > maxWeight || weight < minWeight) {
            System.out.println("i can't meow");
        } else {
            weight = weight - 1;
            System.out.println("Meow");
        }
    }
    public void feed(Double amount) {
        if (weight > maxWeight || weight < minWeight) {
            System.out.println("i can't eat");
        } else {
            weight = weight + amount;
        }
    }
    public void drink(Double amount) {
        if (weight > maxWeight || weight < minWeight) {
            System.out.println("i can't drink");
        } else {
            weight = weight + amount;
        }
    }
    public void pee(Double amount) {
        if (weight > maxWeight || weight < minWeight) {
            System.out.println("i can't pee-pee");
        } else {
            weight = weight - amount;
            System.out.println("пись-пись");
        }
    }
    public Double getWeight() {
        return weight;
    }
    public String getStatus() {
        if (weight < minWeight) {
            count--;
            return "Dead";
        } else if (weight > maxWeight) {
            count--;
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
    public static int getCount() {
        return count;
    }
    public Double getEatable() {
        if (weight > maxWeight || weight < minWeight) {
            System.out.println(" don't matter at all!");
        } else {
            eatable = weight - originWeight;
//            System.out.println(eatable);
        }
        return eatable;
    }
}