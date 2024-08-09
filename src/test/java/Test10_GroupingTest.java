import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test10_GroupingTest {

    // tüm test methodlarını aynı anda çalıştırabiliriz!
    // ya da grup grup çalıştırabiliriz !



    @Nested
    class Group1{
        @Test
        void testSummation() {
            int a = 5;
            int b = 12;

            assertEquals(17,a+b);
        }

        @Test
        void testSubtraction() {
            int a = 12;
            int b = 3;

            assertEquals(9,a-b);
        }

    }

    @Nested
    class Group2{
        @Test
        void testDivided() {
            int a = 18;
            int b = 3;
            assertEquals(6,a /b);
        }

        @Test
        void testMultiplication() {
            int a = 10;
            int b = 12;

            assertEquals(120,a*b);
        }
    }

    @Nested
    class Group3 {
        @Test
        void testToLowerCase() {
            String s = "GONCA";
            String string = "gonca";

            assertEquals(string,s.toLowerCase());
        }

        @Test
        void testLength() {
            String text = "HOLA !";
            assertEquals(6,text.length());
        }
    }
}
