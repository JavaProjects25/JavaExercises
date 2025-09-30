public class Main {
    public static void main(String[] args) {
        PizzaItalian pizzaItalian = new PizzaItalian();
        Chef chefItalian = new Chef(pizzaItalian);
        chefItalian.makePizza();
        chefItalian.getPizza().servePizza();

        PizzaSpanish pizzaSpanish = new PizzaSpanish();
        Chef chefSpanish = new Chef(pizzaSpanish);
        chefSpanish.makePizza();
        chefSpanish.getPizza().servePizza();

        PizzaSenegal pizzaSenegal = new PizzaSenegal();
        Chef chefSenegal = new Chef(pizzaSenegal);
        chefSenegal.makePizza();
        chefSenegal.getPizza().servePizza();
    }
}