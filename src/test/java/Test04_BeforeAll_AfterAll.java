import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

// Bu anotasyonlar, testlerin çalıştırılmasından önce ve sonra bir kez çalıştırılması gereken yöntemleri belirtir.
// @BeforeAll ve @AfterAll genellikle, testlerin başlamasından önce ve testlerin tamamlanmasından sonra bir kez yapılması gereken başlangıç ve temizleme işlemleri için kullanılır.
// Örneğin, veritabanı bağlantılarını başlatmak veya testlerden sonra kapatmak için kullanılabilirler.


// @BeforeAll ve @AfterAll yöntemlerinin statik olması,
// JAVA STATIK OLMASINI ZORUNLU KILIYOR.
// JUnit'in testlerin çalıştırılması ve yönetilmesi sırasında bu yöntemlerin sınıfın örneğine bağlı olmadan çağrılmasını ve yönetilmesini sağlar.


public class Test04_BeforeAll_AfterAll {

    @BeforeAll
    static void setup() {
        // bu yöntem tüm testlerden önce bir kez çalıştırılır.
        System.out.println("Before All Tests");
    }

    @Test
    void test1() {
        // birinci test yöntemi
        System.out.println("Running Test 1 ");
    }

    @Test
    void test2() {
        // ikinci test yöntemi
        System.out.println("Running Test 2");
    }

    @AfterAll
    static void tearDown() {
        // bu yöntem tüm testlerden sonra bir kez çalıştırılır.
        System.out.println("After All Tests");
    }

     // NOTES :
    // @BeforeEach ve @AfterEach metodları her testten önce ve sonra çalışır.
    // @BeforeAll ve @AfterAll metodları sınıftaki tüm testlerden önce ve sonra bir kez çalışır.


}
