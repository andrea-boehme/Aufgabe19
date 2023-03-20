import java.util.Comparator;
public class PersonHeightComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getHeight().compareTo(p2.getHeight());
    }
}