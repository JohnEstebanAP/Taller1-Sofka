/**
 * This class represents a person's bank account.
 *
 * @author John Esteban Alvarez
 */
public class BankAccount {  
  
  //Declaration of Variables or properties of the Fruit class
  private int accountNumber = 0;
  protected boolean activated = false;

  //BankAccount class constructor
  BankAccount(){
  }

  //Getters and Setters
  //
  public void setAccountNumber(int accountNumber){
    this.accountNumber = accountNumber;
  }

  public int getAccountNumber(){
    return accountNumber;
  }

  public void setActived(boolean actived){
    this.activated = actived;
  }

  public boolean getActived(){
    return activated;
  }

}
