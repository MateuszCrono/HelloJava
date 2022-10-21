package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private Rolltype roll;

    private int burgers;

    private SauceType sauce;

    private List<IngredientsType> ingredients;

    public static class BigmacBuilder {
        private Rolltype roll ;
        private int burgers;
        private SauceType sauce;
        private List<IngredientsType> ingredients = new ArrayList<>();

        public BigmacBuilder bun(Rolltype roll) {
            this.roll = roll;
            return this;
        }

        public BigmacBuilder sauce(SauceType sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder ingredient(IngredientsType ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }

    public Bigmac(final Rolltype roll, final int burgers, final SauceType sauce, List<IngredientsType> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public Rolltype getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public SauceType getSauce() {
        return sauce;
    }

    public List<IngredientsType> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
