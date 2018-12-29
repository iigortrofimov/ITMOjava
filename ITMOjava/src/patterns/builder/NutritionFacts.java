package patterns.builder;

public class NutritionFacts {

    private final int servings;
    private final int calories;
    private final int fat;

    public static class Builder {
        private final int servings;
        private int calories = 0;
        private int fat = 0;

        public Builder(int servings) {
            this.servings = servings;
        }

        public Builder setCalories(int calories) {
            this.calories = calories;

            return this;
        }

        public Builder setFat(int fat) {
            this.fat = fat;

            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
    }

    public static void main(String[] args) {
        NutritionFacts beaf = new Builder(10).setCalories(456).setFat(10).build();
        NutritionFacts milk = new Builder(5).setCalories(122).build();

    }

}
