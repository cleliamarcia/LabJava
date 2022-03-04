package Lab3;

public class Queen extends Piece {
    public Queen(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Like bishop and rook");

    }

    @Override
    public String toString() {
        return "Queen{" +
                "value=" + getValue() +
                ", isWhite=" + isWhite() +
                '}';
    }
}