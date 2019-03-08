package wiese.aj;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void areaCalculatedProperly(){
        Rectangle rec = new Rectangle();
        int result = (int) rec.area();
        Assert.assertEquals(result, 462);
    }
}
