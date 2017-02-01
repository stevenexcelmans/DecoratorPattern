/**
 * Created by paulienl on 20/01/2017.
 */
public class DisabledCalculator extends CalcDecorators implements Calculator{


    public DisabledCalculator(Child child, Calculator calculator) {
        super(child, calculator);
    }

    public double calculate(Child child) {
       if(child.getIndex() == 0)
       {
           return calculator.calculate(child) + 1.00;
       }
       else if(child.getIndex() == 1)
       {
           return calculator.calculate(child) + 2.00;
       }
       else
       {
           return calculator.calculate(child) + 3.00;
       }
    }


}
