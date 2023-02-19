import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    PhoneBook sut = new PhoneBook();

    @Test
    public void addTest() {
        //arrange
        String name1 = "Petr";
        String number1 = "89112222222";
        String name2 = "Andrew";
        String number2 = "89113333333";
        int expected = 2;
        //act
        sut.add(name1, number1);
        int result = sut.add(name2, number2);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void findByNumber() {
        //arrange
        String expectedName = "Petr";
        String number = "89112222222";
        sut.add(expectedName, number);
        //act
        String resultName = sut.findByNumber(number);
        //assert
        assertEquals(expectedName, resultName);
    }

    @Test
    public void findByName() {
        //arrange
        String name = "Artem";
        String expectedNumber = "89113334455";
        sut.add(name, expectedNumber);
        //act
        String resultNumber = sut.findByName(name);
        //assert
        assertEquals(expectedNumber, resultNumber);
    }

    @Test
    public void printAllNames() {
        //arrange
        sut.contactList.clear();
        String name1 = "Petr";
        String number1 = "89112222222";
        String name2 = "Andrew";
        String number2 = "89113333333";
        sut.add(name1, number1);
        sut.add(name2, number2);
        //act
        String resultName = sut.contactList.firstKey();
        //assert
        assertEquals(name2, resultName);
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Test started");
    }

    @AfterEach
    public void finishTest() {
        System.out.println("Test finished");
    }

    @BeforeAll
    public static void startedTests() {
        System.out.println("Tests started");
    }

    @AfterAll
    public static void finishedTests() {
        System.out.println("Tests finished");
    }
}