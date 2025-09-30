class PizzaSenegal implements IPizzaPizza {

    private Pizza pizza;
    String SenegaleseIngredient = "Senegaliano";

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

    void MakeIngredientSenegalese(){
        System.out.println("Add Ingredient: " + SenegaleseIngredient);
    }

}
