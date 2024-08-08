import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test05_TryTestingExceptions {
    @Test
    void testExceptions() {
        int a = 2;
        int b = 0;


        // assertThrows metodu belirtilen istisnayı fırlatıp fırlatmadığını kontrol eder ve doğru türdeki istisnayı fırlatıyorsa testi geçer.

        // assertThrows ( beklenen hata çeşiti,tetikleyici bir işlemi lamda ile kullanabiliriz.)
        assertThrows(ArithmeticException.class,() -> System.out.println(a / b));  // TEST BAŞARILI !

        // exception çeşiti yerine Parent exception kullanırsak eğer başarılı olur mu ?
        assertThrows(RuntimeException.class,() -> System.out.println(a / b));    // TEST BAŞARILI !
    }
}
