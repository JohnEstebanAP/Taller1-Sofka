import java.util.ArrayList;

/**
 * It represents a person and various properties such as name, age or weight.
 *
 * @author John Esteban Alvarez
 */
public class Fruit {
  
  //Declaration of Variables or properties of the Fruit class
  public String name = new String();
  private float averageWeight = 0.0f;
  public ArrayList<String> colors = new ArrayList<String>();

  //Fruit class constructor
  Fruit(String name, float averageWeight, ArrayList<String> colors){
    this.name = name;
    this.averageWeight = averageWeight;
    this.colors = colors;
  }

  //Getters and Setters
  //name
  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  //averageWeight
  public void setAverageWeight(float averageWeight){
    this.averageWeight = averageWeight;
  }

  public float getAverageWeight(){
    return this.averageWeight;
  }

  //colors
  public void setColor(String name){
    this.colors.add(name);
  }

  public ArrayList<String> getColors(){
    return this.colors;
  }
}
