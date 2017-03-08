import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BearTest{

  Bear bear;
  Salmon food;
  PolarBear polarbear;
  GrizzlyBear grizzlybear;
  Panda pandabear;

  @Before
  public void setup(){
    bear = new Bear();
    food = new Salmon();
    polarbear = new PolarBear();
    grizzlybear = new GrizzlyBear();
    pandabear = new Panda();
  }

  @Test
  public void canEatSalmon(){
    grizzlybear.eat(food);
    assertEquals(1, grizzlybear.foodCount());
  }

  @Test
  public void cantEatIfBellyFull(){
    for (int i = 0; i < 7; i++){
      grizzlybear.eat(food);
    }
    assertEquals(5, grizzlybear.foodCount());
  }

  @Test
  public void canFishSalmon(){
    Edible freshSalmon = grizzlybear.riverFish();
    assertEquals(Salmon.class, freshSalmon.getClass());
  }

  @Test
  public void canFishSeal(){
    Edible freshSeal = polarbear.iceFish();
    assertEquals(Seal.class, freshSeal.getClass());
  }

  @Test
  public void canHarvestHoney(){
    Edible freshHoney = grizzlybear.harvestHoney();
    assertEquals(Honey.class, freshHoney.getClass());
  }

  @Test
  public void canHarvestBamboo(){
    Edible freshBamboo = pandabear.harvestBamboo();
    assertEquals(Bamboo.class, freshBamboo.getClass());
  }

}