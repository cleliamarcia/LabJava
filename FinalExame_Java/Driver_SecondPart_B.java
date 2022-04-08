package FinalExame_Java;

public class Driver_SecondPart_B {

        public static void main (String[] args){

            RandomCharChooser lChooser = new RandomCharChooser("cat");
            for (int k = 0; k < 4; k++) {
                System.out.print(lChooser.getNext());
            }

        }

}
