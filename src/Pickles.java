public class Pickles extends ToppingDecorator {
    Burger burger;

    public Pickles(Burger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", Pickles";
    }

    public double cost() {
        return burger.cost() + .20;
    }
}
