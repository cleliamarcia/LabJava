package Lab3;

public class Bishop extends Piece {
    public Bishop(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Diagonally");

    }

    @Override
    public String toString() {
        return "Bishop{" +
                "value=" + getValue() +
                ", isWhite=" + isWhite() +
                '}';
    }
}
