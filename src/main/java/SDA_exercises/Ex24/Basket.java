package SDA_exercises.Ex24;

import java.io.IOException;

public class Basket {
    public final int MaxCapacity = 10;
    private int itemsCount;


    public void addToBasket() {

        if (itemsCount >= MaxCapacity) {
            throw new BasketFullException();
        }
        itemsCount += 1;
    }

    public void removeFromBasket() {
        if (itemsCount == 0) {
            throw new BasketEmptyException();
        }
        itemsCount -= 1;
    }

    public int getItemsCount() {
        return itemsCount;
    }


}
