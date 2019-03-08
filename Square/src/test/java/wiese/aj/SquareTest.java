package wiese.aj;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void areaCalculatedProperly(){
        Square sq = new Square();
        int result = (int) sq.area();
        Assert.assertEquals(result, 25);
    }
}
