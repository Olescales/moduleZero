package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Flower implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private BigDecimal price;
    private String color;
    private int size;
    private Aroma degreeOfAroma;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Aroma getDegreeOfAroma() {
        return degreeOfAroma;
    }

    public void setDegreeOfAroma(Aroma degreeOfAroma) {
        this.degreeOfAroma = degreeOfAroma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return size == flower.size &&
                Objects.equals(name, flower.name) &&
                Objects.equals(price, flower.price) &&
                Objects.equals(color, flower.color) &&
                degreeOfAroma == flower.degreeOfAroma;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, color, size, degreeOfAroma);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", degreeOfAroma=" + degreeOfAroma +
                '}';
    }
}
