package week04;

/**
 * @invariant row >= 0 && column >=0
 */
public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Position other) {
            return row == other.row && column == other.column;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return row + (column * 17);
    }
}
