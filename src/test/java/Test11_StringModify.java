
import com.patika.StringModify;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test11_StringModify {
    StringModify stringModify;

    @BeforeEach
    void start() {
        stringModify = new StringModify();
        System.out.println("Before each çalıştı !");
    }

    @ParameterizedTest
    @CsvSource(value = {"JAVA,Java","PYTHON,Python","SPRING,Sprıng"})     // döngü şeklinde çalışır !
    void testStringModify(String string1,String string2) {
        assertEquals(string1,stringModify.modifyString(string2));
        System.out.println("Test metodu çalıştı !");
    }


    @AfterEach
    void finish() {
        stringModify = null;
        System.out.println("After each çalıştı !");
    }

}
