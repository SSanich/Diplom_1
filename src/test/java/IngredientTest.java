import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import praktikum.Ingredient;
import constants.Constants;
import praktikum.IngredientType;

public class IngredientTest {
    Ingredient ingredient;
    @Before
    public void setup() {
        ingredient = new Ingredient(IngredientType.FILLING,Constants.INGREDIENT_NAME_CHEESE,Constants.INGREDIENT_CHEESE_PRICE);
    }

    @Test
    public  void ingredientTestGetName (){
        Assert.assertEquals("Ошибка в имени добавки",Constants.INGREDIENT_NAME_CHEESE, ingredient.getName());
    }
    @Test
    public  void ingredientTestGetPrice (){
        Assert.assertEquals("Ошибка в цене",Constants.INGREDIENT_CHEESE_PRICE, ingredient.getPrice(), Constants.DELTA);
    }

    @Test
    public void ingredientTestGetType(){
        Assert.assertEquals("Ошибка в типе добавки",IngredientType.FILLING,ingredient.getType());

    }
}
