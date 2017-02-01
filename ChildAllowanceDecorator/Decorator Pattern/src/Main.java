import java.time.LocalDate;

/**
 * Created by paulienl on 20/01/2017.
 */
public class Main {
    public static void main(String[] args) {

        Child child = new Child(2, LocalDate.of(2000,6,18));
        Calculator allowance = new Allowance(child);
        allowance = new DisabledCalculator(child, allowance);
        allowance = new UnemploymentCalculator(child, allowance);
        System.out.println(allowance.calculate(child));
    }
}
