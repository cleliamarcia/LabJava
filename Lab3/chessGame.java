package Lab3;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.ArrayList;

public class chessGame {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Piece> chessPiece = new ArrayList<>();

        Bishop bishop = new Bishop(3, true);
        chessPiece.add(bishop);

        Pawn pawn = new Pawn(1, false);
        System.out.println(pawn);
        chessPiece.add(pawn);

        Knight knight = new Knight(2, true);
        chessPiece.add(knight);

        Rook rook = new Rook(5, false);
        chessPiece.add(rook);

        Queen queen = new Queen(9, true);
        chessPiece.add(queen);

        King king = new King(1000, false);
        chessPiece.add(king);

        for (Piece piece : chessPiece) {
            piece.move();
        }

        Pawn p1 = new Pawn(1, true, true, queen);
        Pawn p2 = new Pawn(1, false, false, null);
        Pawn p3 = new Pawn(1, false, true, queen);
        Pawn p4 = new Pawn(1, false, true, queen);
        Pawn p5 = new Pawn(1, true, true, knight);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));

        System.out.println("\n+====== \"Congrats! You can promote your pawn. Choose one of the following: \" =====+");
        System.out.println("| [1] Queen  |");
        System.out.println("| [2] Rook   |");
        System.out.println("| [3] Knight |");
        System.out.println("| [4] Bishop |");
        System.out.println("+=========================+");


        try {
            int userChoice = userInput.nextInt();
            if (userChoice == 1) {
                Queen queenPromote = new Queen(9, false);
                pawn.promote(queenPromote);
            } else if (userChoice == 2) {
                Rook rookPromote = new Rook(5, false);
                pawn.promote(rookPromote);
            } else if (userChoice == 3) {
                Knight knightPromote = new Knight(2, false);
                pawn.promote(knightPromote);
            } else if (userChoice == 4) {
                Bishop bishopPromote = new Bishop(3, false);
                pawn.promote(bishopPromote);
            } else {
                System.out.println("Insert a valid number");
            }
            System.out.println(pawn);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Bye!");
        }


    }

}