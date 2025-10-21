import java.util.ArrayList; // I need this for the ingredient list

class Pizza {

    String dough;
    String sauce;
    String toppings;
    ArrayList<String> ingredients = new ArrayList<>();
    String pizzaName;

    String getDough() {
        return dough;
    }

    String getSauce() {
        return sauce;
    }

    String getToppings() {
        return toppings;
    }

    ArrayList<String> getIngredients() {
        return ingredients;
    }

    String pizzaName() {
        return pizzaName;
    }

    void setDough(String dough) {
        this.dough = dough;
    }

    void setSauce(String sauce) {
        this.sauce = sauce;
    }

    void setToppings(String toppings) {
        this.toppings = toppings;
    }

    void setIngredients(String ingredient) {
        ingredients.add(ingredient);
    }

    void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }
    void servePizza() {
        System.out.println("Serving Pizza: " + pizzaName);
        System.out.println("Dough: " + dough);
        System.out.println("Sauce: " + sauce);
        System.out.println("Toppings: " + toppings);
        System.out.println("Extra ingredients: " + String.join(", ", ingredients));
        System.out.println("-------------------------------------------");
    }
}
