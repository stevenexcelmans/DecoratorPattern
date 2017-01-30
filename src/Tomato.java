public class Tomato extends ToppingDecorator {
    Burger burger;

    public Tomato(Burger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", Tomato";
    }

    public double cost() {
        return burger.cost() + .20;
    }
}
