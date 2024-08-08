import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

    /*
    @DisplayName anotasyonunu kullanarak, testlerinizi daha anlamlı bir şekilde adlandırabilirsiniz
    Bu, testlerinizin amacını daha iyi anlamanıza ve test çıktılarında testlerinizi daha anlamlı bir şekilde görmenize yardımcı olabilir.
     */

public class Test06_DisplayName {
    @Test
    @DisplayName("parsInt() metodun'a numeric olmayan bir argüman gönderildiğinde NumberFormatException hatası fırlatır !")
    void test_string_to_int() {
        String text = "Gonciiii";
        assertThrows(NumberFormatException.class, () -> Integer.parseInt(text));
    }
}
