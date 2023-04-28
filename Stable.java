import java.util.ArrayList;

class Stable {
  private String address;
  public ArrayList<Horse> horses;
  
  public Stable() {
    horses = new ArrayList<Horse>();
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public String getAddress() {
    return address;
  }
  
  public void addHorse(Horse horse) {
    horses.add(horse);
  }
  
  public ArrayList<Horse> getHorses() {
    return horses;
  }
}
//Create the Stable class here.