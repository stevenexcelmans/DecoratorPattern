import java.time.LocalDate;
import java.time.Period;

/**
 * Created by paulienl on 20/01/2017.
 */
public class Child {
    private int index;
    private LocalDate birthDate;

    public Child(int index, LocalDate birthDate) {
        this.index = index;
        this.birthDate = birthDate;
    }

    public int getAge(LocalDate birthDate) {
        return Period.between(LocalDate.now(), birthDate).getYears();
    }

    public int getIndex()
    {
        return index;
    }
}
