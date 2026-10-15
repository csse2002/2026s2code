import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class RedRoom {
    private Set<Patron> patrons = new HashSet<>();

    public void enter(List<Patron> prospectivePatrons, Predicate<Patron> bouncer) {
        prospectivePatrons.stream()
                .filter(bouncer)
                .forEach(patron -> patrons.add(patron));
    }

    public static void main(String[] args) {
        System.out.println((Squared) x -> x * x);
        RedRoom bar = new RedRoom();
        bar.enter(List.of(new Patron("Ian")),
                patron -> patron.getAge() >= 18);
        System.out.println(bar.patrons);
    }
}
