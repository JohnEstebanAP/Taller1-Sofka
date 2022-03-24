/**
 * Calculator of index body Mass.
 *
 * @author John Esteban Alvarez
 */
public class CalBodyMass {
  
  private float bodyMass = 0f;
  protected float weight = 0f;
  protected float height = 0f;
  private String status = new String();

  CalBodyMass(float weight, float height){
    this.weight = weight;
    this.height = height;
  }

  //Calculate the body mass index and return whit float
  public float getIndexBodyMass(){
    
    bodyMass = (weight / (height*height));
    return bodyMass;
  }

  //Calculate the body mass status (normal, overweight, obese).
  public String getStatus(){

    if(bodyMass >= 18.5  && bodyMass <= 24.9){
      status = "Nolmal";
    }else if(bodyMass >= 25  && bodyMass <=29.9){
      status = "Overweight";
    }else if(bodyMass >= 30){
      status = "Obese";
    }else{
      status = "Malnutrition";
    }
    return status;
  }
  
}
