package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private List<Continent> continents = new ArrayList<>();

    private BigDecimal peopleQuantity;

    public boolean addContinent(Continent continent){
        return continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleWorldQuantity = continents.stream()
                .flatMap(continents -> continents.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
                return peopleWorldQuantity;
    }

}
