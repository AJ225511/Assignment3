package wiese.aj;

public class Student implements StudentInterface {


    public String studentName(String fName, String lName)
    {
        return fName + lName;
    }

    public int studentAge(String value)
    {
        return Integer.parseInt(value);
    }

}
