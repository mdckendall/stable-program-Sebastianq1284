import java.util.ArrayList;
class Horse {
  private String name;
  private double weight;
  private boolean isTamed;
  
  public Horse(String name, double weight, boolean isTamed) {
    this.name = name;
    this.weight = weight;
    this.isTamed = isTamed;
  }
  
  public String getName() {
    return name;
  }
  
  public double getWeight() {
    return weight;
  }
  
  public boolean isTamed() {
    return isTamed;
  }
}
//Create the Horse class here.