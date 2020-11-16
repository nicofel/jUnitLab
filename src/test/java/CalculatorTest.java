import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    public static void BeforeAll() {
        System.out.println("Before test");
    }

    @BeforeEach
    void BeforeEach(){
        System.out.println("Starting test");
    }

    @Test
    void subtractInt() {
        Calculator calculator = new Calculator();
        assertNotEquals(9, calculator.subtractInt(10,2));
        System.out.println("10-2 should not equal 9");;

    }

    @RepeatedTest(2)
    void addInt() {
        Calculator calculator = new Calculator();
        assertEquals(5,calculator.addInt(3,2));
        System.out.println("3+2 should equal 5");
    }

    @Test
    void multiplyInt(){
        Calculator calculator = new Calculator();
        assertEquals(20, calculator.multiplyInt(4,5));
        System.out.println("4*5 should equal 20");
    }

    @Disabled("Disabled until further notice")
    @Test
    void multiplyInt2(){
        Calculator calculator = new Calculator();
        assertEquals(55, calculator.multiplyInt(11,5));
        System.out.println("11*5 should equal 55");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After test");
    }

}