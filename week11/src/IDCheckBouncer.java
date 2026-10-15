import java.util.function.Predicate;

public class IDCheckBouncer implements Predicate<Patron> {
    @Override
    public boolean test(Patron patron) {
        return patron.hasValidId();
    }
}
