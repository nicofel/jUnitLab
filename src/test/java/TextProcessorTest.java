import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TextProcessorTest {


@BeforeAll
    public static void BeforeAll(){
    System.out.println("Starting test");
    }

    @AfterEach
    void AfterEach(){
        System.out.println("Test complete");
    }

    @Test
    void upperCase(){
    TextProcessor textProcessor = new TextProcessor();
    assertTrue(textProcessor.upperCase("good evening").equals("GOOD EVENING"));
        System.out.println("String is upper case");

    }

    @Test
    void lowerCase(){
        TextProcessor textProcessor = new TextProcessor();
        assertFalse(textProcessor.lowerCase("good evening").equals("GOOD EVENING"));
        System.out.println("False, string is upper case");

    }

    @Test
    @DisplayName("Reversing the string test")
    void reverse(){
    TextProcessor textProcessor = new TextProcessor();
    }

    @Test
    void lowerCase2(){
    TextProcessor textProcessor = new TextProcessor();
    assertNull(textProcessor.lowerCase("chocolate"));
        System.out.println("String is NULL");
    }
}