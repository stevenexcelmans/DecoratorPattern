/**
 * Created by paulienl on 31/01/2017.
 */
public abstract class CalcDecorators {
    Child child;
    Calculator calculator;

    public CalcDecorators(Child child, Calculator calculator) {
        this.child = child;
        this.calculator = calculator;
    }
}
