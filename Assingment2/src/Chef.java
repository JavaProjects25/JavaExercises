class Chef {
    IPizzaPizza pizzaBuilder;

    Chef(IPizzaPizza pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    void makePizza() {
        pizzaBuilder.pizzaName();
        pizzaBuilder.makeDough();
        pizzaBuilder.makeSauce();
        pizzaBuilder.makeToppings();
        pizzaBuilder.makeIngredients();
    }

    Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }
}
