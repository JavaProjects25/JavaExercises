class PizzaItalian implements IPizzaPizza {
    protected Pizza pizza; // Protected so that PizzaSpanish (which extends PizzaItalian) can access both PizzaItalian's methods and variables *and* PizzaSpanish can override what it wants to be different.
    String oliveOil;
    String herbs;

    public PizzaItalian() {
        pizza = new Pizza();
    }

    @Override
    public void makeDough() {
        pizza.setDough("Italian Dough");
    }

    @Override
    public void makeSauce() {
        pizza.setSauce("Italian Sauce");
    }

    @Override
    public void makeToppings() {
        pizza.setToppings("Italian Toppings");
    }

    @Override
    public void makeIngredients() {
        makeOliveOil();
        makeHerbs();
    }

    void setOliveOil(String oliveOil) {
        this.oliveOil = oliveOil;
    }

    public void makeOliveOil() {
        this.setOliveOil("Olive oil");
        pizza.setIngredients(oliveOil);
    }

    void setHerbs(String herbs) {
        this.herbs = herbs;
    }

    public void makeHerbs() {
        this.setHerbs("Herbs");
        pizza.setIngredients(herbs);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }

    @Override
    public void pizzaName() {
        pizza.setPizzaName("Italian Pizza");
    }
}
