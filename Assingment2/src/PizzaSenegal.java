class PizzaSenegal implements IPizzaPizza {

    private Pizza pizza;
    String SenegaleseIngredient;

    public PizzaSenegal() {
        pizza = new Pizza();
    }

    @Override
    public void makeDough() {
        pizza.setDough("Senegalese dough");
    }
    @Override
    public void makeSauce() {
        pizza.setSauce("Senegalese sauce");
    }

    @Override
    public void makeToppings() {
        pizza.setToppings("Senegalese Toppings");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }

    String getSenegalese(){
        return SenegaleseIngredient;
    }
    void SetSenegalese(){
        SenegaleseIngredient = "Senegalese";
    }

}
