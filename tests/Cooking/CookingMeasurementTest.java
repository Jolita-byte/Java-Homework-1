package Cooking;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static Cooking.CookingMeasurementConverter.convert;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CookingMeasurementTest {

    @ParameterizedTest
    @CsvSource({
            "1, CUP, 1, CUP",
            "1, Cup, 1, CUP",
            "1, cup, 1, CUP",
    })
    void CookingMeasurement_contructor(float amount, Unit unit, float amountExpected, Unit unitExpected) {
        CookingMeasurement cm = new CookingMeasurement(amount, unit);

        assertThat(cm.getAmount()).isEqualTo(amountExpected);
        assertThat(cm.getUnit()).isEqualTo(unitExpected);
    }

}