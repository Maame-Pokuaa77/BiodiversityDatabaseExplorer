public abstract class Animal extends Species {
    
    // Animal-specific attributes
    private int numOfLegs;              
    private String bodyCovering;        
    private String colour;              
    private String movementType;        
    
  
    public Animal(String scientificName, String commonName, String habitat,
                  String conservationStatus, String geographicDistribution,
                  int lifeSpan, String reproductiveStrategy, String feedingHabits,
                  String ecologicalRole, int numOfLegs, 
                  String bodyCovering, String colour, String movementType) {
        
        
        super(scientificName, commonName, habitat, conservationStatus, 
              geographicDistribution, lifeSpan, reproductiveStrategy, 
              feedingHabits, ecologicalRole);
        
        this. numOfLegs = numOfLegs;
        this.bodyCovering = bodyCovering;
        this.colour = colour;
        this.movementType = movementType;
    }
    
   
    public int getNumOfLegs() {
        return numOfLegs;
    }
    
    public String getBodyCovering() {
        return bodyCovering;
    }
    
    public String getColour() {
        return colour;
    }
    
    public String getMovementType() {
        return movementType;
    }
       
    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
    
    public void setBodyCovering(String bodyCovering) {
        this.bodyCovering = bodyCovering;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }
        
    public abstract String defenseMechanism();
    
   
    public abstract String makeSound();
    
}