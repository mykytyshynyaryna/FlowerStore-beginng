package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;



@Getter @AllArgsConstructor @ToString @NoArgsConstructor @Setter
public class Flower extends Item {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
    }

    // public void setPrice(int price2) {
    //     this.price = price2;
    // }

    // public void setColor(FlowerColor color2) {
    //     this.color = color2;
    // }

    public String getColor() {
        return color.toString();
    }
}
