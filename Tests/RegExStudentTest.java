import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegExStudentTest {


    @Test
    void getFirstName() {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("A");
        assertTrue(tester1.getFirstName().matches("[A-Z]"));
    }

    @Test
    void FirstNameLetterBCapTrue()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("B");
        assertTrue(tester1.getFirstName().matches("[A-Z]"));
    }

    @Test
    void FNLetterBMoreFalse()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("Bob");
        assertFalse(tester1.getFirstName().matches("[A-Z]"));
    }

    @Test
    void FNLetterbFalse()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("b");
        assertFalse(tester1.getFirstName().matches("[A-Z]"));
    }

    @Test
    void FNLetterBTrue()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("B");
        assertFalse(tester1.getFirstName().matches("[A-Z][a-z]]"));
    }

    @Test
    void FNLetterBLengthTrue()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("Bhajndjkfnankjnauiuanjk");
        assertTrue(tester1.getFirstName().matches("[A-Z][a-z]*"));
    }

    @Test
    void FNWithHyphenTrue()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("Jon-Bob");
        assertTrue(tester1.getFirstName().matches("[a-z]+ ([-][A-Za-z])*"));
    }


    @Test
    void setFirstName() {
    }

    @Test
    void testToString() {
    }
}