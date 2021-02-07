package Calculations;

import Amounts.*;
import Time.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import static Calculations.Average.calculateAverage;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class AverageTest {
    private List<Amount> amountList = new ArrayList<>();
    private List<Time> timeList = new ArrayList<>();

    @BeforeEach
    void init() {
        amountList.add( new Amount(LocalDate.of(2021, 01, 31),
                        new AmountCode("ATL DD", AmountCode.Type.EARNING),
                        200));

        amountList.add( new Amount(LocalDate.of(2021, 02, 28),
                new AmountCode("ATL DD", AmountCode.Type.EARNING),
                600));

        timeList.add(new Time(LocalDate.of(2021, 01, 01),
                        new TimeCode("DD",true), 40));

    }

    @Test
    void average_WhenAmount800andDivider40_Return50(){
        Average a = new Average(amountList,timeList);
        float result = a.calculateAverage();

        assertThat(result).isEqualTo(20);
    }

    @Test
    void getAmountForAverage_ReturnAmount800(){
        Average a = new Average(amountList,timeList);
        float result = a.getAmountForAverage();

        assertThat(result).isEqualTo(800);
    }

    @Test
    void getTimeForAverage_ReturnAmount40(){
        Average a = new Average(amountList,timeList);
        float result = a.getTimeForAverage();

        assertThat(result).isEqualTo(40);
    }




/*    @Test
    void average_WhenAmount100andDivider0_ThrowsException(){
        Average a = new Average(100,2);
        float result = a.calculateAverage();

        //assertEquals(true, Float.isInfinite(result), "Divide by zero gives infinity as result");

        //assertThat(result).isEqualTo(Float.isInfinite());
        //assertThatThrownBy(basket::addToBasket).isInstanceOf(BasketFullException.class);
        //assertThatThrownBy();
    }*/

    //@Test
    //void AmountForAverage_





}