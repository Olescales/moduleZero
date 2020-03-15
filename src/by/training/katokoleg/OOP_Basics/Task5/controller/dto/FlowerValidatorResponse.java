package controller.dto;

public class FlowerValidatorResponse extends Response{

    private String flowerName;
    private Integer quantity;
    private boolean isEmpty = true;

    public String getFlowerName() {
        return flowerName;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
