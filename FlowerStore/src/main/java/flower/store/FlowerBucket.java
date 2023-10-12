package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();
    @Override
    public double getPrice(){
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
    public void add(FlowerPack pack) {
        flowerPacks.add(pack);}
       
    }
