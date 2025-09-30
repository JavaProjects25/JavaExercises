class PizzaSpanish extends PizzaItalian implements IPizzaPizza {

    private Pizza pizza;
    String SpanishIngredient;

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

    String getHam(){
        return SpanishIngredient;
    }

    void setHam(){
        this.SpanishIngredient = "Olive oil";
    }
}
