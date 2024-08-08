import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class Test02_Assertions {
    @Test
    void testMin() {
        assertEquals(3,Math.min(14,3));
    }

    @Test
    void testArrays() {
        String str = "Junit Test with Java";
        String[] actualArray = str.split(" ");
        String[] expectedArray = {"Junit","Test","with","Java"};

        // assertTrue :True ise testten geçer.
        //assertTrue(Arrays.equals(actualArray,expectedArray));

        // assertFalse : beklenen false olması lazım testten geçmesi için !
        // assertFalse(Arrays.equals(actualArray,expectedArray));

        // assertArrayEquals : array karşılaştırması yapar !
        assertArrayEquals(actualArray, expectedArray);


    }
}
