import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;
import constants.Constants;

public class BunTest {
    Bun bun;
    @Before
    public void setup() {
        bun = new Bun(Constants.BUN_NAME, Constants.BUN_PRICE);
    }

    @Test
    public  void bunTestGetName (){
        Assert.assertEquals("Ошибка в названии булочки",Constants.BUN_NAME, bun.getName());
    }
    @Test
    public  void bunTestGetPrice (){
        Assert.assertEquals("Ошибка в цене булочки",Constants.BUN_PRICE, bun.getPrice(), Constants.DELTA);
    }
}
