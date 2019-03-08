package wiese.aj;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircleTest {

    @Test
    public void areaCalculatedProperly(){
        Circle circ = new Circle();
        int result = (int) circ.area();
        Assert.assertEquals(result, 113);
    }

}
