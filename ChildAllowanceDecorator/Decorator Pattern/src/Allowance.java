/**
 * Created by paulienl on 20/01/2017.
 */
public class Allowance implements Calculator {
    private Child child;

    public Allowance(Child child) {
        this.child=child;
    }

    @Override
    public double calculate(Child child) {
        return 0.00;
    }
}
