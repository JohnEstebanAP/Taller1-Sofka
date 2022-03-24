import java.util.ArrayList;
import java.util.Scanner;

/**
 * It represents a person and various properties such as name, age or weight.
 *
 * @author John Esteban Alvarez
 */
public class Gym {
 
  
  public static void main(String[] args) {
 
    //variable to set the keypad data and to know if the user's answer is yes or no.
    String validate = new String();

    System.out.println("  ******************** ¡Hello welcome! ********************\n");
    System.out.println("  Start a new adventure looking for a healthier life,\n  eating healthy and doing sports in the gym.");
    
     
    System.out.println("\n  The time has come to start the adventure");
    System.out.println("  Please enter your details to sign up and keep track of your progress.");

    Scanner lScanner = new Scanner(System.in);
    //An object of class person is created
    People people = new People(); 

    System.out.println("  Please enter your name: ");
    people.setName(lScanner.next());

    System.out.println("  Please enter your first last name: ");
    people.setLastName1(lScanner.next());

    System.out.println("  Please enter your second last name: ");
    people.setLastName2(lScanner.next());

    //it is stated that the year written if it is of numerical type.
    while (true){
      try {
        
        System.out.println("  please enter the year of your birth in numbers (1999): ");
        
        String year = lScanner.next();  
        int yearInt = Integer.parseInt(year);
        
        if( people.setYearBirth(yearInt)){
          break;
        }
      } catch (Exception e) {   
      }
    }
   //it is stated that the height written if it is of numerical type.
    while (true){
      try {
        
        System.out.println("  please enter your height(1.7): ");
        
        String height = lScanner.next();  
        float heightFloat = Float.parseFloat(height);
      
        if( people.setHeight(heightFloat) ){
          break;
        }
      } catch (Exception e) {   
      }
    }
    
    //it is stated that the height written if it is of numerical type.
    while (true){
      try {
        
        System.out.println("  please enter your weight(70.0): ");
        
        String weight = lScanner.next();  
        float weightFloat = Float.parseFloat(weight);
      
        if( people.setWeight(weightFloat) ){
          break;
        }
      } catch (Exception e) {   
      }
    }
  
      
    //it is stated that the back account number written if it is of numerical type.
    while (true){
      try {
        
        System.out.println("  please enter your bank account number: ");
        
        String account = lScanner.next();  
        int accountInt = Integer.parseInt(account);
      
        people.setAccountNumber(accountInt);  
        break;
      } catch (Exception e) {   
      }
    }

    //Method to calculate a person's age. 
    AgeCalculator ageCalculator = new AgeCalculator();
    int agePerson = ageCalculator.ageCalculation(people.getYearBirth()); 
    //Method to calculate a person's index body Mass.
    CalBodyMass calBodyMass = new CalBodyMass(people.getWeight(),people.getHeight());

  
  
    System.out.println("  ***********************************************************************************");
    System.out.println("  ***********************    Hello "+ people.getName()+" "+people.getLastName1()+" "+people.getLastName2()+"    ***********************");
    System.out.println("  \tHis approximate age is: "+ agePerson);
    System.out.println("  \n\tThe calculated body mass index is: "+ calBodyMass.getIndexBodyMass()+" ( "+calBodyMass.getStatus()+" ). ");

    System.out.println("  \nThe most recommended for good health is to eat fruits,eat a healthy diet and exercise.");
    System.out.println("  At the Gym we will help you with all this, and we will keep track of your progress."); 
    System.out.println("  ***********************************************************************************");
 
    //Create objet of Fruits
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("Red");
    colors.add("Green");
    Fruit apple = new Fruit("apple", 0.8f, colors);

    System.out.println("  Remember to eat one fruit a day,\n"
      +"  The fruit of the day is the: " + apple.getName() + " weight of: "+ apple.getAverageWeight() + " color: "+ apple.getColors().get(0).toString());

    System.out.println("\n  If you wish to activate your subscription to the gym \n with the account number " + people.getAccountNumber()+ " please enter (Y/N)");



    //The keypad data is checked to validate if it was typed (Yes or No)
    validate = lScanner.next().toString();
    //the text is converted to lowercase
    validate = validate.toLowerCase(); 
    //close of method Scanner
    lScanner.close();

    //validate the answer to activate or not to activate the subscription to the bank account number
    if(validate.equals("yes") || validate.equals("y")){
      people.setActived(true);
      
    }else if(validate.equals("no") || validate.equals("n")){
      people.setActived(false);
    } 

    //the account statement is printed, which in this case is the one that you have to pay at the gym.
    System.out.println("  ******* ¡your subscription with account number " +people.getAccountNumber() + " is in state: "+ people.getActived() +"¡ *******" );
  }
}
