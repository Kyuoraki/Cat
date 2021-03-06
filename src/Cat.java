
public class Cat {
    private static int count;
    public static final int EYE_COUNT = 2;
    public static final double MIN_WEIGHT = 1000;
    public static final double MAX_WEIGHT = 9000;

    private double originWeight;
    private double weight;
    private double minWeight;
    private double maxWeight;
    private double eatable;
    private String name;
    public String color;


    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;

    }

    public Cat(Cat cat) {
        this(cat.name, cat.weight);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(Color color) {
        this.color = String.valueOf(color);
    }

    public String getColor() {
        return color;
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

    public void  setCatColor(Color catColor) {
        System.out.println(catColor.toString());
    }

    public Double getEatable() {
        if (weight > maxWeight || weight < minWeight) {
            System.out.println(name + " don't matter at all!");
            return null;
        } else {
            eatable = weight - originWeight;
            return eatable;
        }
    }
}