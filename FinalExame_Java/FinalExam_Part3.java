package FinalExame_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FinalExam_Part3 {

        /**     * Returns true if the integers in the digits ArrayList are in strictly non-decreasing order.
         * false otherwise.                 * * Examples)
         * isStrictlyNonDecreasing([7]) -> true
         * isStrictlyNonDecreasing([1, 3, 4, 5]) -> true
         * isStrictlyNonDecreasing([1, 2, 2, 5]) -> true
         * isStrictlyNonDecreasing([3, 2, 2, 5, 6]) -> false
         * isStrictlyNonDecreasing([1, 2, 6, 5, 8]) -> false
         *     */

     public static boolean isStrictlyNonDecreasing(ArrayList<Integer> digits) {
        if (digits.size() == 1){
            return true;
        }
        for (int i = 0; i < digits.size() -1; i++){
            if( digits.get(i) > digits.get(i+1)){
                return false;
            }
        }
        return true;
    }


        /**     * Prints the elements in the given country HashMap.
         * (Order does not matter)     *     * Examples)
         * printMapElements({"AB": "Edmonton", "BC": "Victoria"})
         * prints -> "AB: Edmonton, BC: Victoria, "     *
         * printMapElements({"NY": "Albany", "CA": "Sacramento"})
         * prints -> "NY: Albany, CA: Sacramento, "
         * @param country
         */

        public static void printMapElements(HashMap<String, String> country) {
            for ( String key : country.keySet() ) {
                System.out.println( key + ":" + country.get(key));
            }
        }


        /**     * Test cases     */
        public static void main(String[] args) {
            // isStrictlyNonDecreasing
            ArrayList<Integer> input1 = new ArrayList<>(Arrays.asList(7));
            System.out.println(isStrictlyNonDecreasing(input1));
            ArrayList<Integer> input2 = new ArrayList<>(Arrays.asList(1, 3, 4, 5));
            System.out.println(isStrictlyNonDecreasing(input2));
            ArrayList<Integer> input3 = new ArrayList<>(Arrays.asList(1, 2, 2, 5));
            System.out.println(isStrictlyNonDecreasing(input3));
            ArrayList<Integer> input4 = new ArrayList<>(Arrays.asList(3, 2, 2, 5, 6));
            System.out.println(isStrictlyNonDecreasing(input4));
            ArrayList<Integer> input5 = new ArrayList<>(Arrays.asList(1, 2, 6, 5, 8));
            System.out.println(isStrictlyNonDecreasing(input5));
            // printMapElements        HashMap<String, String> canada = new HashMap<>();
            HashMap<String, String> canada = null;
            
            canada.put("AB", "Edmonton");        canada.put("BC", "Victoria");
            printMapElements(canada);        System.out.println();
            HashMap<String, String> usa = new HashMap<>();
            usa.put("NY", "Albany");
            usa.put("CA", "Sacramento");
            printMapElements(usa);    }

}
