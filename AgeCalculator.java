/**
 * Age Calculator 
 *
 * @author John Esteban Alvarez
 */

public class AgeCalculator {

  private int age = 0;

  //BankAccount class constructor
  AgeCalculator(){
  }
  //Method to Calculate the age of a person
  public int ageCalculation(int yearBirth){
   age = (2022 - yearBirth);
    return age;
  }
}
