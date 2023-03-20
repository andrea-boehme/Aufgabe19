import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonAgeComparatorTest {

    @Test
    void shouldComparePersonByAge() {

        PersonAgeComparator personAgeComparator = new PersonAgeComparator();

        Person p1 = new Person(39, "Anna", "Klein", 185, 82);
        Person p2 = new Person(20, "Berta", "Schmidt", 155, 48);
        Person p3 = new Person(20, "Carlo", "Neumann", 165, 45);

        int actualBigger = personAgeComparator.compare(p1,p2);
        int expectedBigger = 1;

        assertEquals(expectedBigger, actualBigger);

        int actualSmaller = personAgeComparator.compare(p2,p1);
        int expectedSmaller = -1;

        assertEquals(expectedSmaller, actualSmaller);

        int actualSame = personAgeComparator.compare(p2,p3);
        int expectedSame = 0;

        assertEquals(expectedSame, actualSame);
    }

}