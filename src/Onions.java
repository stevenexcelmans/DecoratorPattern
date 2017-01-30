public class Onions extends ToppingDecorator {
    Burger burger;

    public Onions(Burger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", Onions";
    }

    public double cost() {
        return burger.cost() + .30;
    }
}
