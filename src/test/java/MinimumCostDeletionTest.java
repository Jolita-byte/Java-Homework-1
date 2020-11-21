import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static edu.MinimumCostDeletion.cost;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MinimumCostDeletionTest {
    //private static final String strings = {null, ""};

    //@ParameterizedTest
    //@ValueSource(strings = {null, ""},  )
    @Test
    public void cost_given_null_string_returns_0(){
        int result = cost(null, new int[]{1, 2, 3, 4, 5});

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void cost_given_empty_string_returns_0(){
        int result = cost("", new int[]{1, 2, 3, 4, 5});

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void cost_given_null_array_returns_0(){
        int result = cost("aaa", null);

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void cost_given_empty_array_returns_0(){
        int result = cost("aaa", new int [] {});

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void cost_given_unequal_length_arguments_returns_0(){
        int result = cost("aaa", new int [] {1,2,3,4,5});

        assertThat(result).isEqualTo(0);
    }

/*    @Test
    public void cost_given_unequal_length_arguments_returns_0(){
        //1 <= s.length, cost.length <= 10^5
        int [] array = new int [Math.pow(10,5)+1];
        for (int i = 0)
        int result = cost("aaa", new int [] {1,2,3,4,5});

        assertThat(result).isEqualTo(0);
    }*/




    /*
            - 1 <= cost[i] <= 10^4
            - s contains only lowercase English letters.*/

    @Test
    public void cost_given_string_contains_capital_letters_returns_0(){
        int result = cost("abAaa", new int [] {1,2,3,4,5});

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void cost_given_values_abaac_12345_returns_3(){
        int result = cost("abaac", new int [] {1,2,3,4,5});

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void cost_given_values_abc_123_returns_0(){
        int result = cost("abc", new int [] {1,2,3});

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void cost_given_values_aabaa_12341_returns_2(){
        int result = cost("aabaa", new int [] {1,2,3,4,1});

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void cost_given_values_aaaaa_12345_returns_10(){
        int result = cost("aaaaa", new int [] {1,2,3,4,5});

        assertThat(result).isEqualTo(10);
    }

    public void cost_given_values_aaaaa_54321_returns_2(){
        int result = cost("aaaaa", new int [] {5,4,3,2,1});

        assertThat(result).isEqualTo(10);
    }
}
