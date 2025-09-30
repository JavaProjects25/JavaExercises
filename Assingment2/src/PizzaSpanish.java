class PizzaSpanish extends PizzaItalian implements IPizzaPizza {

    private Pizza pizza;
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

    void setHam(String ham) {
        this.ham = ham;
    }
    void makeHam() {
        this.setHam("Ham");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
