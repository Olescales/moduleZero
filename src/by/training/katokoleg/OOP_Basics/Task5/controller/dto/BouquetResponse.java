package controller.dto;

import model.Bouquet;

public class BouquetResponse extends Response {

    private Bouquet bouquet;

    public Bouquet getBouquet() {
        return bouquet;
    }

    public void setBouquet(Bouquet bouquet) {
        this.bouquet = bouquet;
    }
}
