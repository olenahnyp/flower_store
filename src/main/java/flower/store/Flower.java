package flower.store;

import lombok.*;


@Setter @Getter @AllArgsConstructor @NoArgsConstructor @ToString
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;
    public Flower(Flower flower) {
        this.color = flower.color;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.flowerType = flower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }
}
