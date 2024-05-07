package Tugas;

public class Main {
    public static void main(String[] args) {
        // Create a waiter
        Waiter waiter = new Waiter();

        // Create a meal builder
        MealBuilder orderedMealBuilder = new OrderedMealBuilder();

        // Set the meal builder to the waiter
        waiter.setMealBuilder(orderedMealBuilder);

        // Construct a meal
        Meal meal = waiter.constructMeal();

        // Show the items of the meal
        meal.showItems();
    }
}
