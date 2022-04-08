package FinalExame_Java;

public class Driver_SecondPart_A {

   public static void main (String[] args){

       String[] wordArray = {"wheels", "on", "the", "bus"};
       RandomWordChooser sChooser = new RandomWordChooser(wordArray);
       for (int k = 0; k < 6; k++) {
           System.out.print(sChooser.getNext() + " ");
       }


   }



}
