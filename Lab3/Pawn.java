package Lab3;
import java.util.Objects;

public class Pawn extends Piece {
    private boolean promoted;
    private Piece newPiece;

    public Pawn(int value, boolean isWhite, boolean promoted, Piece newPiece) {
        super(value, isWhite);
        this.promoted = promoted;
        this.newPiece = newPiece;
    }

    public Pawn(int value, boolean isWhite) {
        super(value, isWhite);
    }

    public void promote(Piece newPiece){
        this.newPiece = newPiece;

    }

    @Override
    public void move() {
        System.out.println("Forward 1");

    }

    @Override
    public String toString() {
        if (newPiece == null) {
            return "Pawn{" +
                    "promoted=" + promoted +
                    ", value=" + getValue() +
                    ", isWhite=" + isWhite() +
                    '}';
        } else {
            return "Pawn{" +
                    "promoted=" + promoted +
                    ", newPiece=" + newPiece +
                    ", value=" + getValue() +
                    ", isWhite=" + isWhite() +
                    '}';
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pawn pawn = (Pawn) o;
        return promoted == pawn.promoted && Objects.equals(newPiece, pawn.newPiece);
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public Piece getNewPiece() {
        return newPiece;
    }

    public void setNewPiece(Piece newPiece) {
        this.newPiece = newPiece;
    }
}
