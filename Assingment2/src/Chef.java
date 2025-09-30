class Chef {
    IPizzaPizza pizzaBuilder;

    Chef(IPizzaPizza pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    void makePizza() {
        pizzaBuilder.makeDough();
        pizzaBuilder.makeSauce();
        pizzaBuilder.makeToppings();
    }

    Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }
}
