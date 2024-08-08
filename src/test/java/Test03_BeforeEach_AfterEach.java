import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_BeforeEach_AfterEach {

    String str;
    @BeforeEach
    // her bir test metodundan önce beforeEach() çalışır.
    void beforeEach() {
        str = "Junit ile test";
        System.out.println("beforeEach() çalıştı !");
    }
    @AfterEach
    // daha sonra da afterEach() metodu çalışıır.
    void afterEach() {
        str = "";
        System.out.println("afterEach() çalıştı !");
    }

    @Test
    void testArrays(TestInfo info) {
        String[] actualArray = str.split(" ");
        String[] expectedArray = {"Junit","ile","test"};

        System.out.println(info.getDisplayName() + " çalıştı !");

        assertTrue(Arrays.equals(actualArray,expectedArray));
    }
    /*
    beforeEach() çalıştı !
    testArrays(TestInfo) çalıştı !
    afterEach() çalıştı !
     */

    @Test
    void testLength(TestInfo info) {
        String str = "Hello World!";
        int actual = str.length();
        int expected = 12;
        System.out.println(info.getDisplayName() + " çalıştı !");
        assertEquals(actual,expected);

    }

    /*
    beforeEach() çalıştı !
    testLength(TestInfo) çalıştı !
    afterEach() çalıştı !
     */


}
