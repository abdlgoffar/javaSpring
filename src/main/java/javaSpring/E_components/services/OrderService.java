package javaSpring.E_components.services;

import javaSpring.E_components.helpers.IdUnique;
import org.springframework.stereotype.Component;

@Component
public class OrderService implements IdUnique {
    private String id;
    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
