package wiese.aj;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void areaCalculatedProperly(){
        Triangle tri = new Triangle();
        int result = (int) tri.area();
        Assert.assertEquals(result, 10);
    }
}
