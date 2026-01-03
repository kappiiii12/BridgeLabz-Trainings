interface MealPlan { String getMenu(); }
class VeganMeal implements MealPlan { public String getMenu() { return "Plant-based Salad"; } }
class KetoMeal implements MealPlan { public String getMenu() { return "Steak and Avocado"; } }

class Meal<T extends MealPlan> {
    private T plan;
    Meal(T plan) { this.plan = plan; }

    // UC: Generic method to validate and generate
    public static <M extends MealPlan> void generatePlan(M mealPlan) {
        System.out.println("Generating Personalized Plan: " + mealPlan.getMenu());
    }
}