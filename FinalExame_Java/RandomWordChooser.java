package FinalExame_Java;

public class RandomWordChooser {

    private String listWords[];
    private int wordID;
    private String rListWords;


    public RandomWordChooser (String words[]){
        this.listWords = words;
    }

    public int getWordID(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public String getNext(){

        if (listWords.length == 0){
            return "NONE";
        }
        else {
            wordID = (int) ((Math.random() * (listWords.length - 0)) + 0);

            rListWords = listWords[wordID];

            String[] backup = new String[listWords.length - 1];

            for (int i = 0, j = 0; i < listWords.length; i++) {
                if (i != wordID) {
                    backup[j++] = listWords[i];
                }
            }

            listWords = backup;

            return rListWords;
        }
    }

}

