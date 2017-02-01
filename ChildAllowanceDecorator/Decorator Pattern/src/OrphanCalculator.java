/**
 * Created by paulienl on 20/01/2017.
 */
public class OrphanCalculator extends CalcDecorators implements Calculator{
    private Child child;
    private Calculator calculator;


    public OrphanCalculator(Child child, Calculator calculator) {
        super(child, calculator);
    }

    public double calculate(Child child) {
        return calculator.calculate(child) + 5.00;

            }
}
