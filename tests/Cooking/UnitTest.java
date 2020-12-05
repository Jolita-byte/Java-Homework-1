package Cooking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    @ParameterizedTest
    @CsvSource({
            "CUP, CUP",
            "Cup, CUP",
            "cup, CUP",
    })
    void Unit_contsructor(Unit unit, Unit unitExpected) {
        assertThat(unit).isEqualTo(unitExpected);
    }

    @Test
    void getMl() {
    }

    @Test
    void getDescription() {
    }

    @Test
    void unitExists_given_CUP_returns_true() {
        Unit unit = Unit.CUP;

        boolean exists = unit.unitExists("CUP");

        assertThat(exists).isEqualTo(true);
    }
    @Test
    void unitExists_given_aaa_returns_false() {
        Unit unit = Unit.CUP;

        boolean exists = unit.unitExists("aaa");

        assertThat(exists).isEqualTo(false);
    }

    @Test
    void unitExists_given_Cup_returns_false() {
        Unit unit = Unit.CUP;

        boolean exists = unit.unitExists("Cup");

        assertThat(exists).isEqualTo(true);
    }

    @Test
    void values() {
    }

    @Test
    void valueOf() {
    }
}