import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test08_RepeateTestMethods {

    @RepeatedTest(5)                // testin verilen parametre kadar çalıştması için kullanılırç. 5 KERE ÇALIŞMIŞ OLUR.
    void testSubstring() {
        assertEquals("ka","Patika".substring(4));
    }
}
