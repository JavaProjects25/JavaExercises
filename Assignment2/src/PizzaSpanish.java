class PizzaSpanish extends PizzaItalian implements IPizzaPizza {

    String ham;

    public PizzaSpanish() {
        pizza = new Pizza();
    }

    @Override
    public void makeDough() {
        pizza.setDough("Spanish dough");
    }

    @Override
    public void makeSauce() {
        pizza.setSauce("Spanish sauce");
    }

    @Override
    public void makeToppings() {
        pizza.setToppings("Spanish Toppings");
    }

    @Override
    public void makeIngredients() {
        super.makeIngredients(); // Calls makeOliveOil() and makeHerbs() from PizzaItalian
        makeHam();
    }

    void setHam(String ham) {
        this.ham = ham;
    }

    void makeHam() {
        this.setHam("Ham");
        pizza.setIngredients(ham);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }

    @Override
    public void pizzaName() {
        pizza.setPizzaName("Spanish Pizza");
    }
}
