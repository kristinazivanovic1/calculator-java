import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCalculate() {

        Calculator calculator = new Calculator();

        float result = calculator.Calculate("10+5*4+3");

        assertEquals(33, result, 0.001);

    }
}
