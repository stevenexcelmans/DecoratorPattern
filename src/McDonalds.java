import java.text.NumberFormat;

public class McDonalds {

    public static void main(String[] args) {

        NumberFormat eur = NumberFormat.getCurrencyInstance();

        //normal CheeseBurger - no toppings €1.95
        Burger burger1 = new CheeseBurger();
        System.out.println(burger1.getDescription() + "\t" + eur.format(burger1.cost()));

        //normal RoyalCheese - no toppings €3.75
        Burger burger2 = new RoyalCheese();
        System.out.println(burger2.getDescription() + "\t" + eur.format(burger2.cost()));

        //hungry: RoyalCrispyBurger with Onions, Pickles, Tomato & Bacon
        //price: burger €4.25 + €0.30 + €0.20 + €0.20 + €0.50
        Burger burger3 = new RoyalCrispyBurger();
        burger3 = new Onions(burger3);
        burger3 = new Pickles(burger3);
        burger3 = new Tomato(burger3);
        burger3 = new Bacon(burger3);
        System.out.println(burger3.getDescription() + "\t" + eur.format(burger3.cost()));

        //normal Hamburger - no topping €1.75
        Burger burger4 = new Hamburger();
        System.out.println(burger4.getDescription() + "\t" + eur.format(burger4.cost()));

        //hungry with a Pickles fetish:
        //price: burger €4.25 + (€0.20 *10)
        Burger burger5 = new RoyalCrispyBurger();
        burger5 = new Pickles(burger5);
        burger5 = new Pickles(burger5);
        burger5 = new Pickles(burger5);
        burger5 = new Pickles(burger5);
        burger5 = new Pickles(burger5);
        burger5 = new Pickles(burger5);
        //seriously?!
        burger5 = new Pickles(burger5);
        burger5 = new Pickles(burger5);
        burger5 = new Pickles(burger5);
        burger5 = new Pickles(burger5);

        System.out.println(burger5.getDescription() + "\t" + eur.format(burger5.cost()));
    }
}
