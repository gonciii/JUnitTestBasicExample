import com.patika.MockIslemler;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/*
Mockito, Java'da birim testleri yazarken yaygın olarak kullanılan bir test kütüphanesidir. Mockito'nun kullanım sebepleri genellikle şunlardır:
1. Bağımlılık İzolasyonu
Mockito, test edilen sınıfın dış bağımlılıklarını izole edebilmenizi sağlar. Böylece, testler sadece test edilen sınıfa odaklanabilir ve diğer bağımlılıkların etkisinden kaçınabilir.

2. Mock Nesneleri Oluşturma
Mockito, testler sırasında gerçek nesneler yerine "mock" nesneleri oluşturmanıza olanak tanır. Bu mock nesneleri, gerçek sınıfların davranışlarını taklit eder ve belirli senaryolar için özel yanıtlar dönebilir.

3. Davranışları Simüle Etme
Mockito, belirli metot çağrılarının nasıl davranacağını belirlemenizi sağlar. Örneğin, bir metot çağrısının belirli bir değeri döndürmesini veya bir istisna fırlatmasını sağlayabilirsiniz.

 */


public class Test12_MockIslemler {
    @Test
    void testIslem() {
        // Mock nesnesi oluşturma --> dummy(sahte) nesne üretildi !
        MockIslemler dummyObj = Mockito.mock(MockIslemler.class);

        // Mock nesnesinin metot çağrısının beklendiği şekilde davranmasını sağlama
        // (örneğin, addUser metodu çağrıldığında herhangi bir şey döndürmüyorsa bu adımı atlayabilirsiniz)
        // when(dummyObj.addUser("Gonci")).thenReturn(someValue);

        // Metot çağrısını gerçekleştirme
        dummyObj.addUser("Gonci");

        // Metot çağrısının yapılıp yapılmadığını doğrulama
        verify(dummyObj).addUser("Gonci");

        // Metodun belirli bir sayıda çağrıldığını doğrulama (isteğe bağlı)
        verify(dummyObj, times(1)).addUser("Gonci");
    }
}
