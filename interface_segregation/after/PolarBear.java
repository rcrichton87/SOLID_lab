import java.util.ArrayList;

public class PolarBear extends Bear implements Bearable {


  private ArrayList<Edible> belly = new ArrayList<Edible>();


  public Seal iceFish(){
    return new Seal();
  }

  public String climbIceberg(){
    return null;
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