package week04;

import java.util.HashMap;
import java.util.Map;

public class TicTacToe {
    private Map<Position, Character> board = new HashMap<>();

    public TicTacToe() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Position pos = new Position(row, col);
                board.put(pos, '.');
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Position pos = new Position(row, col);
                char value = board.get(pos);
                result += value;
            }
            result += "\n";
        }
        return result;
    }

    public void play(Position pos, char move) {
        board.put(pos, move);
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play(new Position(1, 1), 'X');
        System.out.println(game);
    }
}
