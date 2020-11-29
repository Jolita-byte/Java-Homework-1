package Cooking;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

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