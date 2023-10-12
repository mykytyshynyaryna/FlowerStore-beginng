package flower.store;

import lombok.Getter;

@Getter 
public class FlowerPack {
    private Flower flower;
    private int quantity;
    
    public FlowerPack (Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }
    public void setQuantity(int new_quantity) {
        this.quantity = quantity  < 1 ? 1: new_quantity;
    }
    public double getPrice() {
        return this.flower.getPrice() * this.quantity;
    }
}

