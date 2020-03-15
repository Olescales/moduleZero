package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Wrapper implements Serializable {

    private static final long serialVersionUID = 2L;

    private String name;
    private BigDecimal price;
    private String material;

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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wrapper wrapper = (Wrapper) o;
        return Objects.equals(getName(), wrapper.getName()) &&
                Objects.equals(getPrice(), wrapper.getPrice()) &&
                Objects.equals(getMaterial(), wrapper.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getMaterial());
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
}
