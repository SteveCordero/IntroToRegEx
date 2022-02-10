import java.util.Scanner;

public class RegExStudent
{
    Scanner input = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int age;
    private boolean isActive;
    private int stuID;


    public RegExStudent()
    {
        firstName = "";
        lastName = "";
        age = 0;
        isActive = false;
        stuID = 00000;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String validateFirstName(String firstName)
    {
        while(!firstName.matches("[A-Z][a-zA-Z]]*"))
        {
            System.out.println("Format Incorrect");
            firstName = input.nextLine();
        }
        return firstName;
    }

    @Override
    public String toString() {
        return "RegExStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                ", stuID=" + stuID +
                '}';
    }
}
