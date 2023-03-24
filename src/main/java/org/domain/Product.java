package org.domain;

import java.util.Objects;

public class Product {

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
