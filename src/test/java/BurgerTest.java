import constants.Constants;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;
    Burger burger;

    @Before
    public void setup() {
        burger = new Burger();
    }

    @Test
    public void checkSetBun() {
        burger.setBuns(bun);
        assertEquals(burger.bun, bun);
    }

    @Test
    public void checkAddIngredient(){
        burger.addIngredient(ingredient);
        assertEquals(ingredient, burger.ingredients.get(0));
    }

    @Test
    public void checkRemoveIngredient(){
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.removeIngredient(1);
        int expected = 1;
        assertEquals(expected, burger.ingredients.size());
    }

    @Test
    public void checkMoveIngredient(){
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.moveIngredient(0, 1);
        assertEquals(ingredient, burger.ingredients.get(1));
    }

    @Test
    public void checkGetPrice(){
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.when(bun.getPrice()).thenReturn(Constants.BUN_PRICE);
        Mockito.when(ingredient.getPrice()).thenReturn(Constants.INGREDIENT_CHEESE_PRICE);
        float expected= 670.00F;
        assertEquals(expected, burger.getPrice(),0.01);
    }

    @Test
    public void checkGetReceipt() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.when(bun.getName()).thenReturn(Constants.BUN_NAME);
        Mockito.when(bun.getPrice()).thenReturn(Constants.BUN_PRICE);
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.FILLING);
        Mockito.when(ingredient.getName()).thenReturn(Constants.INGREDIENT_NAME_HOT_SAUCE);
        Mockito.when(ingredient.getPrice()).thenReturn(Constants.INGREDIENT_HOT_SAUCE_PRICE);
        String expected = "(==== Булка ====)\n= filling Жаркий Огонь =\n(==== Булка ====)\n\nPrice: 595,000000\n";
        assertEquals(expected, burger.getReceipt());
    }

}
