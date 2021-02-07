package Calculations;

import Amounts.Amount;
import Amounts.AmountCode;
import Time.Time;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AmountFilterTest {
    private List<Amount> amountList = new ArrayList<>();


    @BeforeEach
    void init() {
        AmountCode ATL_DD = new AmountCode("ATL DD", AmountCode.Type.EARNING);
        amountList.add(new Amount(LocalDate.of(2020, 11, 30), ATL_DD, 1000));
        amountList.add(new Amount(LocalDate.of(2020, 12, 31), ATL_DD, 900));
        amountList.add(new Amount(LocalDate.of(2021, 01, 31), ATL_DD, 200));
        amountList.add(new Amount(LocalDate.of(2021, 02, 28), ATL_DD, 600));
        amountList.add(new Amount(LocalDate.of(2021, 03, 31), ATL_DD, 500));
        amountList.add(new Amount(LocalDate.of(2021, 04, 30), ATL_DD, 600));

    }

    @Test
    void getAmountsForPeriod_WhenPeriodFrom20210101To20210331(){
        List<Amount> resultAmountList = new ArrayList<>();
        resultAmountList.add( new Amount(LocalDate.of(2021, 01, 31),
                new AmountCode("ATL DD", AmountCode.Type.EARNING),
                200));

        resultAmountList.add( new Amount(LocalDate.of(2021, 02, 28),
                new AmountCode("ATL DD", AmountCode.Type.EARNING),
                600));

        resultAmountList.add( new Amount(LocalDate.of(2021, 03, 31),
                new AmountCode("ATL DD", AmountCode.Type.EARNING),
                500));


        AmountFilter f = new AmountFilter(amountList);
        List<Amount> result = f.getAmountsForPeriod(LocalDate.of(2021, 01, 01), LocalDate.of(2021, 04, 01));

        assertThat(result).isEqualTo(resultAmountList);
    }

}