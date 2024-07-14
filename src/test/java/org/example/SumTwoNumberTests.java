package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTwoNumberTests {

    @Test
    @DisplayName("3+5=8")
    public void addTwoNumber(){

        SumTwoNumber sumTwoNumber = new SumTwoNumber();
assertEquals(2,sumTwoNumber.addNumbers(3,5),"3+5 should equal 8");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,1,1",
            "1,2,3",
            "2,3,5",
            "3,4,7"
    })
    public void add(int first,int second,int expectedResult){
        SumTwoNumber sumTwoNumber = new SumTwoNumber();
        assertEquals(expectedResult,sumTwoNumber.addNumbers(first,second),
                ()->first + " + " + second + "should equal " + " " + expectedResult);

    }


}
