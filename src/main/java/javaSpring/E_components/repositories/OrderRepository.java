package javaSpring.E_components.repositories;

import javaSpring.E_components.helpers.ShopName;

public class OrderRepository implements ShopName {
    private String name;
    @Override
    public void setName(String name) {
        this.name = name;
    }
}
