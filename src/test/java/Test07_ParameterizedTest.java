import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test07_ParameterizedTest {

    @Test
    @DisplayName("testLength() metodu ile string ifadelerin uzunluğu 0'dan büyük mü ? ")
    void testLength() {
        assertTrue("Gonca".length() > 0);
        assertTrue("Ozan".length() > 0);
        assertTrue("Ebru".length() > 0);
        assertTrue("Onur".length() > 0);
        assertTrue("Nilsu".length() > 0);
        assertTrue("Gül".length() > 0);
        assertTrue("Mehmet".length() > 0);
    }

    // tek parametreli versiyon
    @ParameterizedTest  // aynı test metodunu farklı parametrelerle birden çok kez çalıştırabiliriz.
    @ValueSource(strings = {"Gonca","Ozan","Ebru","Onur","Nilsu","Gül","Mehmet"})   // metoda parametre olarak sağlanacak olan string değerleri belirtir.
    void testLength2(String str) {
        assertTrue(str.length() > 0);
    }

    // çift parametreli versiyon
    @ParameterizedTest
    @CsvSource(value = {"MERHABA,Merhaba",
                       "HELLO,Hello",
                       "HOLA,Hola"})
    void testToUpperCase(String string1,String string2) {
        // string 1 : olması gereken string ifade ----> expected !
        // string 2 : olabilmesi için uygulanan işlem
        assertEquals(string1,string2.toUpperCase());
    }

    // 3 parametreli versiyon
    @ParameterizedTest
    @CsvSource(value = {"true,Java,a",
                        "true,Junit,u",
                        "false,hello,a",
                        "false,gonca,i"})
    void testContains(boolean b,String string,String str ) {
        // b : expected (beklenilen değer )
        assertEquals(b,string.contains(str));

    }


}
