package Lab2;

import java.util.ArrayList;

public class Province {
    private String province;
    private String capital;
    private long population;
    long DEFAULT_POPULATION = 4648055;
    String DEFAULT_PROVINCE = "British Columbia";
    String DEFAULT_CAPITAL = "Victoria";


    public Province(String province, String capital, long population) {
        if (isValidPopulation(population) && (isValidProvince(province))
                && (isValidCapitalCity(capital))) {

            this.province = province;
            this.capital = capital;
            this.population = population;
        } else {
            this.population = DEFAULT_POPULATION;
            this.province = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
        }
    }

    private static boolean isValidProvince(String province) {
        String[] provincesList = {"Alberta", "British Columbia", "Manitoba", "New Brunswick",
                "Newfoundland and Labrador", "Nova Scotia", "Ontario", "Prince Edward Island",
                "Quebec", "Saskatchewan"};
        for (int i = 0; i < provincesList.length; i++) {
            if (provincesList[i] == province) {
                return true;
            }
        }
        return false;
    }

    private static boolean isValidCapitalCity(String capital) {
        String [] capitalsList = {"Edmonton", "Victoria", "Winnipeg", "Fredericton", "St. John's",
                "Halifax", "Toronto", "Charlottetown", "Quebec City", "Regina"};
        for (int i = 0; i < capitalsList.length; i++) {
            if (capitalsList[i] == capital) {
                return true;
            }
        }
        return false;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        if (isValidProvince(province)) {
            this.province = province;
        } else {
            this.province = getDEFAULT_PROVINCE();
        }

    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        if (isValidCapitalCity(capital)) {
            this.capital = capital;
        } else {
            this.capital = DEFAULT_CAPITAL;
        }
    }


    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        if (population >= 30000 && population <= 15000000) {
            this.population = population;
        } else {
            this.population = DEFAULT_POPULATION;
        }

    }

    public long getDEFAULT_POPULATION() {
        return DEFAULT_POPULATION;
    }

    public void setDEFAULT_POPULATION(long DEFAULT_POPULATION) {
        this.DEFAULT_POPULATION = DEFAULT_POPULATION;
    }

    public String getDEFAULT_PROVINCE() {
        return DEFAULT_PROVINCE;
    }

    public void setDEFAULT_PROVINCE(String DEFAULT_PROVINCE) {
        this.DEFAULT_PROVINCE = DEFAULT_PROVINCE;
    }

    public String getDEFAULT_CAPITAL() {
        return DEFAULT_CAPITAL;
    }

    public void setDEFAULT_CAPITAL(String DEFAULT_CAPITAL) {
        this.DEFAULT_CAPITAL = DEFAULT_CAPITAL;
    }

    private static boolean isValidPopulation(long population) {
        if (population >= 30000 && population <= 15000000) {
            return true;
        }
        return false;

    }

    public String getDetails() {
        String result = String.format("The capital of %s (population. %d) is %s.", getProvince(), getPopulation(), getCapital());
        return result;


    }





}
