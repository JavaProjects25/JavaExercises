class PizzaItalian implements IPizzaPizza {
    private Pizza pizza;
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

    void setOliveOil(String oliveOil) {
        this.oliveOil = oliveOil;
    }
    public void makeOliveOil() {
        this.oliveOil = "Olive Oil";
    }

    void setHerbs(String herbs) {
        this.herbs = herbs;
    }
    public void makeHerbs() {
        this.herbs = "Herbs";
    }

    public Pizza getPizza() { return pizza; }

}
