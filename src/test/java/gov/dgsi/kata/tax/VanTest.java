package gov.dgsi.kata.tax;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class VanTest {

    Van van;

    @Before
    public void setup() {
        van = new Van();
    }

    @Test 
    public void shouldReturn165GB_When_WeightLessThan3500kg() {

            van.setWeight(3499);

            int result = van.computeTax();

            assertTrue( result == 165);
    }

    @Test
    public void shouldReturn190GB_When_WeightEquals3500Kg() {
        van.setWeight(3500);

        int result = van.computeTax();

        assertTrue( result == 190);


    }

    @Test
    public void shouldReturn190GB_When_WeightGreatherThan3500Kg() {
        van.setWeight(3600);

        int result = van.computeTax();

        assertTrue( result == 190);


    }

}
