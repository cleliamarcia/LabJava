package FinalExame_Java;

public class RandomCharChooser extends RandomWordChooser {

    /** Constructs a random char chooser using the given string str.
     * Precondition: str contains only letters.
     */

    public RandomCharChooser(String words) {
        super(getSingleChars(words));
    }


    /** Returns an array of single-char strings.
     * Each of these strings consists of a single letter from str.
     * Element k of the returned array contains the single letter at
     * position k of str.
     * For example, getSingleChars("cat") returns the
     * array { "c", "a", "t" }.
     */

    public static String[] getSingleChars(String string){
        String[] chars = new String[string.length()];
        for (int i = 0; i < string.length(); i++){
            chars[i] = string.substring(i, i+1);
        }
        return chars;

    }

}

