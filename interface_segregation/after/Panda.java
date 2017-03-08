import java.util.ArrayList;

public class Panda extends Bear implements Bearable {


  private ArrayList<Edible> belly = new ArrayList<Edible>();




  // public int foodCount(){
  //   return belly.size();
  // }

  // public String sleep(){
  //   return "Zzzzz...";
  // }

  // public boolean isBellyFull(){
  //   return (foodCount() >= 5);
  // }

  public String climbTree(){
    return "I can climb this tree, you can't hide from me!";
  }

  public Bamboo harvestBamboo(){
    return new Bamboo();
  }

}