package MidTermTest;

public class Car extends Vehicle {

    private boolean isLeftHandDriving;


    public Car(String productId, Integer weight, boolean isLeftHandDriving)
    {
        super(productId, weight);
        this.isLeftHandDriving = isLeftHandDriving;
    }



    public boolean getIsLeftHandDriving (){
        return isLeftHandDriving;
    }

    public void setIsLeftHandDriving(boolean isLeftHandDriving){
        this.isLeftHandDriving = isLeftHandDriving;
    }


    @Override
    public String toString() {
        return "Car{" +
                "productId=" + getProductId() +
                ", weight=" + getWeight() +
                ", isLeftHandDriving= true" +
                '}';
    }


    @Override
    public void accelerate() {
        if (getWeight() == null)
            System.out.println("there’s something wrong");
        else
            System.out.println("fire pistons, turn wheels");
    }

    public void steerLeft() {
        System.out.println("turn wheels left");
    }

    public void steerRight() {
        System.out.println("turn wheels right");
    }

}
