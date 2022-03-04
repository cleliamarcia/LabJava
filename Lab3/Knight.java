package Lab3;

public class Knight extends Piece {


    public Knight(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Like an L");
    }

    @Override
    public String toString() {
        return "Knight{" +
                "value=" + getValue() +
                ", isWhite=" + isWhite() +
                '}';
    }
}
