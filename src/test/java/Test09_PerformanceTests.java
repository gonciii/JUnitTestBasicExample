import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test09_PerformanceTests {

    // NORMAL ŞARTLARDA LAMBDA KULLANIMINDA ARRAY VE COLLECTIONLAR GEREKLİDİR.Akış olması için !
    // Fakat burda lambda kullanımındada akış varmış gibi kullanabilmek için Instream sınfının range methodundan yardım alırız.

    @Test
    void testPrintPerformance() {
        // performans testi yapmak için JUnit 'in assertTimeout kullanılır.

        assertTimeout(Duration.ofSeconds(1),
                () -> IntStream.range(1,10000).forEach(System.out :: print)      // 1 den 1000 e kadar olan sayıları teker teker bizlere döker.Amacı: bunları 1 saniye de yapabiliyor mu ?
                );   // 79 ms içinde başarılı bir şekilde test geçti !

    }
}
