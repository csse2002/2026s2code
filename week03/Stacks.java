package week03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Stacks {
    public Stack<String> reverse(Stack<String> pile) {
        Stack<String> result = new Stack<>();
        while (!pile.empty()) {
            String thing = pile.pop();
            result.push(thing);
        }
        return result;
    }

    public int sum(Stack<Integer> pile) {
        int total = 0;
        while (!pile.empty()) {
            int value = pile.pop();
            total += value;
        }
        return total;
    }

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("James");
    }
}
