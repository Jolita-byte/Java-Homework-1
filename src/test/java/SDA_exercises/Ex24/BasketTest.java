package SDA_exercises.Ex24;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    void addToBasket_GivenBasketIsEmpty_Adds1(){
        Basket basket = new Basket();

        basket.addToBasket();

        assertThat(basket.getItemsCount()).isEqualTo(1);
    }

    @Test
    void addToBasket_GivenBasketIsFull_ThrowsException() {
        Basket basket = new Basket();
        for (int i = 1; i <= basket.MaxCapacity; i++) {
            basket.addToBasket();
        }

        assertThatThrownBy(basket::addToBasket).isInstanceOf(BasketFullException.class);
    }

    @Test
    void newBasket_isEmpty(){
        Basket basket = new Basket();
        assertThat(basket.getItemsCount()).isEqualTo(0);
    }

    @Test
    void removeFromBasket_GivenBasketIsFull_Removes1(){
        Basket basket = new Basket();
        for (int i = 1; i <= basket.MaxCapacity; i++) {
            basket.addToBasket();
        }

        basket.removeFromBasket();

        assertThat(basket.getItemsCount()).isEqualTo(9);
    }

    @Test
    void removeFromBasket_GivenBasketIsEmpty_ThrowsException() {
        Basket basket = new Basket();

        assertThatThrownBy(basket::removeFromBasket).isInstanceOf(BasketEmptyException.class);
    }

}