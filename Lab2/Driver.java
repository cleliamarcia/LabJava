package Lab2;

public class Driver {

    public static void main(String[] args) {
        Canada canada = new Canada();
        canada.displayAllProvinces();
        System.out.println(canada.getNumberOfProvincesBetween(1, 15));
    }

}
