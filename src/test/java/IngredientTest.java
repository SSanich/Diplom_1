import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Ingredient;
import praktikum.Constants;
import praktikum.IngredientType;

@RunWith(MockitoJUnitRunner.class)

public class IngredientTest {
    @Mock
    Ingredient ingredient;
    @Before
    public void setup() {
        ingredient = new Ingredient(IngredientType.FILLING,Constants.INGREDIENT_NAME_CHEESE,Constants.INGREDIENT_CHEESE_PRICE);
    }

    @Test
    public  void ingredientTestGetName (){
        Assert.assertEquals(Constants.INGREDIENT_NAME_CHEESE, ingredient.getName());
    }
    @Test
    public  void ingredientTestGetPrice (){
        Assert.assertEquals(Constants.INGREDIENT_CHEESE_PRICE, ingredient.getPrice(), 0.01);
    }

    @Test
    public void ingredientTestGetType(){
        Assert.assertEquals(IngredientType.FILLING,ingredient.getType());

    }
}
