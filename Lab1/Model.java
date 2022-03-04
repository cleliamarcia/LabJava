package Lab1;

/**
 * @author Clelia Marcia Miguel
 */

public class Model {
    private String firstname;
    private String lastname;
    private int height;
    private double weight;
    private boolean traveler;
    private boolean smoker;

    private String heightFeet;
    private long weightKg;

    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;



    /**
     * constructor 1   - default
     * does nothing
     */

    public Model() {    }

    /**
     * constructor 2
     * @param firstname First Name of the model
     * @param lastname Last Name of the model
     * @param height   Height of the model in inches (int)
     * @param weight   Weight of the model in pounds (double)
     * @param traveler Show if the model can travel (true or false)
     * @param smoker Show if the model smokes (true or false)
     */

    public Model(String firstname, String lastname, int height, double weight, boolean traveler, boolean smoker )
    {
        setFirstName(firstname);
        setLastName(lastname);
        setHeight(height);
        setWeight(weight);
        this.traveler = traveler;
        this.smoker = smoker;
    }

    /**
     * constructor 3
     * @param firstname First Name of the model
     * @param lastname Last Name of the model
     * @param height   Height of the model in inches (int)
     * @param weight   Weight of the model in pounds (double)
     * @param traveler Set model can travel = true
     * @param smoker Set model smokes = false
     */
    public Model(String firstname, String lastname, int height, double weight) {
        this(firstname, lastname, height, weight, true, false);
    }


    public void setFirstName(String firstname) {
        if (firstname.length() > 2 && firstname.length() <= 20) {
            this.firstname = firstname;
        }
        else
        {
            System.out.println("First name is not valid, type again");
        }
    }

    public String getFirstName() {
        return firstname;
    }


    public void setLastName(String lastname) {
        if (lastname.length() > 2 && lastname.length() <= 20) {
            this.lastname = lastname;
        }
        else
        {
            System.out.println("Last name is not valid, type again");
        }
    }
    public String getLastName() {
        return lastname;
    }



    public void setHeight (int height) {
        if (height > 23 && height <= 84) {
            this.height = height;
        }
        else
        {
            System.out.println("Height is not valid, type again");
        }
    }
    public int getHeight() { return height;  }

    public void setWeight(double weight) {
        if (weight > 79 && weight <= 280) {
            this.weight = weight;
        }
        else
        {
            System.out.println("Weight is not valid, type again");
        }
    }

    public double getWeight() {

        return Math.round(weight);
    }


    public String getHeightInFeet()  {
        int feet = height / INCHES_PER_FOOT;
        int inches = height % INCHES_PER_FOOT;

        if (inches == 0) {
            heightFeet = String.format("%d feet", feet);
        } else if (inches == 1) {
            heightFeet = String.format("%d feet and %d inch", feet, inches);
        } else {
            heightFeet = String.format("%d feet and %d inches", feet, inches);
        }
        return heightFeet;
    }


    public long getWeightKg( ) {
        weightKg = (long) (POUNDS_PER_KG * weight);
        return Math.round(weightKg);
    };


    public void toPrint() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + getWeight() + " pounds");

        if (traveler == true) {
            System.out.println("Does travel ");
        } else {
            System.out.println("Does not travel ");
        }
        if (smoker == true) {
            System.out.println("Does smoke");
        } else {
            System.out.println("Does not smoke ");
        }
    }


    /**
     * Calculate Pay Dollar per Hour for model,according follow rules:
     * Tall,thin models receive an hourly bonus = 5
     * Traveler models receive extra value = 4
     * Smoker models deducted value = 10
     * @return HourRate
     */
    public int calculatePayDollarsPerHour(){

        int HourRate;
        HourRate = BASE_RATE_DOLLARS_PER_HOUR;

        if (height >= TALL_INCHES && weight < THIN_POUNDS) {
            HourRate = HourRate + TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }

        if (traveler == true) {
            HourRate = HourRate + TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }

        if (smoker == true) {
            HourRate = HourRate - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }

        return HourRate;
    }


    public void displayModelDetails()
    {
        /**
        Name: Susan Smith
        Height: 5 feet 10 inches
        Weight: 120.0 pounds
        Travels: yep
        Smokes: nope
        Hourly rate: $69
        */

        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeet() );
        System.out.println("Weight: " + getWeight() + " pounds");
        if (traveler == true){
        System.out.println("Travels: yep ");
        } else {
        System.out.println("Travels: nope ");
        }
        if (smoker == true){
        System.out.println("Smokes: yep ");
        } else {
        System.out.println("Smokes: nope ");
        }
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());

    }

}
