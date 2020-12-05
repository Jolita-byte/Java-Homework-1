package Cooking;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static Cooking.CookingMeasurementConverter.convert;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CookingMeasurementConverterTest {

    @ParameterizedTest
    @CsvSource({
            "1, CUP, 237, ML",
            "1, CUP, 15.8, TBSP",
            "1, cup, 15.8, TBSP",
            "2, PINT, 0.249472574, GALLON"
    })
    void convert_result(float amountFrom, Unit unitFrom, float amountTo, Unit unitTo) {
        CookingMeasurement original = new CookingMeasurement(amountFrom, unitFrom);

        CookingMeasurement converted = convert(original, unitTo);

        assertThat(converted.getAmount()).isEqualTo(amountTo);
        assertThat(converted.getUnit()).isEqualTo(unitTo);
    }
}