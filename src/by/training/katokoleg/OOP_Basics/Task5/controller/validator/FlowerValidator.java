package controller.validator;

import controller.dto.FlowerValidatorResponse;

import java.util.Map;

public class FlowerValidator {

    private FlowerValidatorResponse flowerValidatorResponse;

    public FlowerValidatorResponse validate (Map<String,Object> userData) {

        String flower = (String) userData.get("flowerName");
        Integer quantity = (Integer) userData.get("quantity");

        flowerValidatorResponse = new FlowerValidatorResponse();
        if (flower == null) {
            throw new IllegalArgumentException("empty field flower");
        }
        if (!flower.matches("\\D")) {
            flowerValidatorResponse.setFlowerName(flower);
            flowerValidatorResponse.setEmpty(false);
        }
        if (quantity == null) {
            throw new IllegalArgumentException("empty field quantity");
        }
        return flowerValidatorResponse;
    }
}
