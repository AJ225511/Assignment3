package wiese.aj;

import org.junit.*;

public class StudentTest {

    private Student student;

    @Before
    public void setUp() throws Exception{
        student = new Student();
    }

    @After
    public void tearDown() throws Exception{
    }

    @Test
    // EQUALITY AND IDENTITY TEST -- TEST IF STUDENT NAME MATCHES
    public void testStudentName(){
        String studentName = student.studentName("AJ", "Wiese");
        Assert.assertEquals("AJWiese", studentName);
    }

    @Test
    // FAILED TEST -- EXPECTED NAME AND GIVEN NAME NOT A MATCH
    public void testStudentNameTwo(){
        String studentName = student.studentName("AJ", "Wiese");
        Assert.assertSame("AJWieese", studentName);
    }

    @Test(expected = Exception.class)
    // EXCEPTION TEST
    public void testStudentAge(){
        int value = student.studentAge("Eighteen");
        Assert.assertEquals(18,value);
    }

    @Test(timeout = 1)
    //TIMEOUT TEST -- TIMES OUT AFTER 1 SECOND
    public void testStudentThree(){
        String studentName = student.studentName("AJ", "Wiese");
        Assert.assertEquals("AJWiese", studentName);
    }

    @Ignore
    @Test
    //DISABLE TEST -- THIS TEST WONT EXECUTE
    public void testStudentFour(){
        String studentName = student.studentName("AJ", "Wiese");
        Assert.assertEquals("AJWiese", studentName);
    }


}
