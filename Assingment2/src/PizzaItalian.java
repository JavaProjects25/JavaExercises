class PizzaItalian implements IPizzaPizza {
    private Pizza pizza;
    String italianIngredients = "Olive Oil, Herbs";
    public PizzaItalian() {
        pizza = new Pizza();
    }
    @Override
    public void makeDough() {
        pizza.setDough("Italian Dough");
        System.out.println("Making " + pizza.dough);
    }
    @Override
    public void makeSauce() {
        pizza.setSauce("Italian Sauce");
        System.out.println("Making " + pizza.sauce);
    }
    @Override
    public void makeToppings() {
        pizza.setToppings("Italian Toppings");
        System.out.println("Making " + pizza.toppings);
    }
    public void ingredients() {
        System.out.println("Ingredients: " + italianIngredients);
    }
    public Pizza getPizza() { return pizza; }

}
