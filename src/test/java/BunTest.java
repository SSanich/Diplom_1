import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Constants;

@RunWith(MockitoJUnitRunner.class)
public class BunTest {
    @Mock
    Bun bun;
    @Before
    public void setup() {
        bun = new Bun(Constants.BUN_NAME, Constants.BUN_PRICE);
    }

    @Test
    public  void bunTestGetName (){
        Assert.assertEquals(Constants.BUN_NAME, bun.getName());
    }
    @Test
    public  void bunTestGetPrice (){
        Assert.assertEquals(Constants.BUN_PRICE, bun.getPrice(), 0.01);
    }
}
