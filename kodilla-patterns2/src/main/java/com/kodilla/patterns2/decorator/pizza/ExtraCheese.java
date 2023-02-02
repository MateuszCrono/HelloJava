package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheese extends AbstractPizzaOrderDecorator{

    public ExtraCheese(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        // hardcoded stub cost = 30
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + extra cheese";
    }
}
