package testproject;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    
    @Test
    public void testSubtract() {
        assertThat(Calculator.subtract(3,2)).isEqualTo(1);
    }

}
