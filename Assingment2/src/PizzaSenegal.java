class PizzaSenegal implements IPizzaPizza {

    private Pizza pizza;
    String senegalese;

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

    void SetSenegalese(String senegalese){
        this.senegalese = senegalese;
    }
    void makeSenegalese(){
        this.SetSenegalese("Senegalese");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
