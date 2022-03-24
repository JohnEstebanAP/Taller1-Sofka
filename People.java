/**
 * It represents a person and various properties such as name, age or weight.
 *
 * @author John Esteban Alvarez
 */
public class People extends BankAccount{
  
  //Declaration of Variables or properties of the Person class 
  public String name = new String();
  public String lastName1 = new String();
  public String lastName2 = new String();
  public int dateBirth = 0;
  public float height = 0.0f;
  public float weight = 0.0f;
  
  //Fruit class constructor
  People(){
    super();
  }

  //******************* Setters and Getters *******************
  
  //Name
  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  //LastName1
  public void setLastName1(String lastName1){
    this.lastName1 = lastName1;
  }

  public String getLastName1(){
    return this.lastName1;
  }

  //lastName2
  public void setLastName2(String lastName2){
    this.lastName2 = lastName2;
  }
    
  public String getLastName2(){
    return this.lastName2;
  }
 
  //Age
  public boolean setYearBirth(int age){
    if(age > 1800  &&  age < 3000){
      this.dateBirth = age;
      return true;
    }
    return false;
  }
 
  public int getYearBirth(){
    return this.dateBirth;
  }

  //height  
  public boolean setHeight(float height){
    if((height > 0) && (height < 3)){
      this.height = height;
      return true;
    }
    return false;
  }

  public float getHeight(){
    return this.height;
  }
  
  //weight
  public boolean setWeight(float weight){
    if((weight > 0) && (weight <200)){
      this.weight = weight;
      return true;
    }
    return false;
  }

  public float getWeight(){
    return this.weight;
  }
}
