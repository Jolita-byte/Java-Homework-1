package edu.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static edu.StringSum.add;
import static org.assertj.core.api.Assertions.assertThat;

public class StringSumTest {
        @Test
        public void add_given_empty_returns_0(){
            int sum = add("");

            assertThat(sum).isEqualTo(0);
        }

        @Test
        //another naming possibility
        public void given_empty_when_add_returns_0(){
            int sum = add("");

            assertThat(sum).isEqualTo(0);
        }

        @Test
        public void add_given_null_returns_0(){
            int sum = add(null);

            assertThat(sum).isEqualTo(0);
        }

        @Test
        public void add_given_single_positive_number_returns_10(){
            int sum = add("10");

            assertThat(sum).isEqualTo(10);
        }

        @Test
        public void add_given_single_negative_number_returns_negative_10(){
            int sum = add("-10");

            assertThat(sum).isEqualTo(-10);
        }

        @ParameterizedTest
        @ValueSource(strings = {"10+20+30", "10.20.30", "10:20:30"})
        public void add_given_any_separator_returns_60(String strings){
            int sum = add(strings);

            assertThat(sum).isEqualTo(60);
        }
    }
