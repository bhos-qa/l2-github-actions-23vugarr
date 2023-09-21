import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class simpleCalculatorTest {
    @Test
    void simpleTestCase(){
        test calculator = new test();

        assertEquals(4, calculator.add(2, 2));
    }
}