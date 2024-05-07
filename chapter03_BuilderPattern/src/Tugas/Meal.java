package Tugas;

import java.util.ArrayList;
import java.util.List;

// Class representing the Meal
class Meal {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void showItems() {
        System.out.println("Meal items:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}

// Builder interface
interface MealBuilder {
    void buildMainCourse();
    void buildSideDish();
    void buildDrink();
    void buildDessert();
    Meal getMeal();
}

// Concrete builder implementing the MealBuilder interface
class OrderedMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildMainCourse() {
        meal.addItem("Grilled Chicken");
    }

    @Override
    public void buildSideDish() {
        meal.addItem("French Fries");
    }

    @Override
    public void buildDrink() {
        meal.addItem("Cola");
    }

    @Override
    public void buildDessert() {
        meal.addItem("Ice Cream");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}

// Director class responsible for constructing meals using the builder
class Waiter {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal constructMeal() {
        mealBuilder.buildMainCourse();
        mealBuilder.buildSideDish();
        mealBuilder.buildDrink();
        mealBuilder.buildDessert();
        return mealBuilder.getMeal();
    }
}

