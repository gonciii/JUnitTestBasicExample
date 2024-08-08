import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Test01_Assertions {
    // her test metotu öncesi @Test anatasyonu kullanılır.
    // JUnit içerisinde gömülü bir main metodu vardır.Bu sayede her birim için run işlemi gerçekleşir.

    @Test
    public void test() {

    }

    @Test
    // method bir string ifadesinin uzunluğunu hesaplama methodu olsun.
    void testLength() {
        String str = "Merhaba Dünya";
        int actual =str.length();  // strintg'in uzunluğunu actual içerisine attık.
        int expected = 13;         // beklenen değeri atadık.

        assertEquals(actual,expected);  // parametre olarak methodun bulmuş olduğu değerle beklenilen değeri karşılaştır.Eğer eşitse testten geçer !
    }

    @Test
    void testUpperCase() {
        String actual ="Hello".toUpperCase();    // method string'i upper case yaptı.
        String expected = "HELLO";               // beklenilen

        assertEquals(actual,expected,"Testten geçemedi !");   // Testten geçememe durumunda hata mesajı gibi bir parametre girilebilir.
    }

    @Test
    void testSum() {
        int a = 15;
        int b = 23;
        int actual = Math.addExact(a,b);
        int expected = 38;

        assertEquals(actual,expected);
    }

    @Test
    void testContains() {
        assertEquals(false,"Gonca".contains("e"));   // gonca e harfi içermiyor ! beklentim : false test : çalışır !
    }

    @Test
    void testLowerCase() {
        String s = "TEST DENEME".toLowerCase();
        assertEquals("test deneme",s);
    }

    @Test
    void testSquareRoot() {
        double a = Math.sqrt(16);
        assertEquals(4.0,a);
    }

    @Test
    void testPow() {
        assertEquals(25,Math.pow(5,2));
    }

    @Test
    @Disabled // -----------> disabled ile test blocklanır ve es geçilir !
    void testMax() {
        assertEquals(10,Math.max(10,50),"Test başarısız !");
    }


}
