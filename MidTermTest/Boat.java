package MidTermTest;

public class Boat extends Vehicle {

    public Boat(String productId, Integer weight) {
        super(productId, weight);
    }


    @Override
    public String toString() {
        return "Boat{" +
                "productId=" + getProductId() +
                ", weight=" + getWeight() +
                '}';
    }


    @Override
    public void accelerate() {
        System.out.println("jet water");
    }

    public void steerLeft() {
        System.out.println("turn tiller left");
    }

    public void steerRight() {
        System.out.println("turn tiller right");
    }

}

