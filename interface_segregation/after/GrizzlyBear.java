import java.util.ArrayList;

public class GrizzlyBear extends Bear implements Bearable {


  private ArrayList<Edible> belly = new ArrayList<Edible>();



  public String climbRock(){
    return "I'm on a rock, not much to do up here, nice spot for a sleep maybe.";
  }

  public Salmon riverFish(){
    return new Salmon();
  }

  public Honey harvestHoney(){
    return new Honey();
  }

  // public int foodCount(){
  //   return belly.size();
  // }

  // public String sleep(){
  //   return "Zzzzz...";
  // }

  // public boolean isBellyFull(){
  //   return (foodCount() >= 5);
  // }

}