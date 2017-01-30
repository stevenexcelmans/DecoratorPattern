
public class Bacon extends ToppingDecorator {
    Burger burger;

    public Bacon(Burger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", Bacon";
    }

    public double cost() {
        return burger.cost() + .50;
    }
}
