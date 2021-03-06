package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private BigDecimal peopleQuantity;

    private String countryName;

    public Country(final String countryName,final BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}

