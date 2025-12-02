public class Mammals extends Animal{

    //Attributes
    private String  dominantActivity;
    private String gestationPeriod;
    private String modeOfCommunication;


    //Fully-parameterized constructor
    public Mammals(String scientificName, String commonName, String habitat,
                   String conservationStatus, String geographicDistribution,
                   int lifeSpan, String reproductiveStrategy, String feedingHabits,
                   String ecologicalRole,int numOfLegs,String bodyCovering,String colour,String movementType,String  dominantActivity,String gestationPeriod,String modeOfCommunication){
        super(scientificName, commonName, habitat, conservationStatus,
                geographicDistribution, lifeSpan, reproductiveStrategy,
                feedingHabits, ecologicalRole, numOfLegs,bodyCovering,colour,movementType);
        this.dominantActivity = dominantActivity;
        this.gestationPeriod = gestationPeriod;
        this.modeOfCommunication = modeOfCommunication;
    }

    //getters
    //getDominantActivity()
    public String getDominantActivity(){
        return dominantActivity;
    }

    //getGestationPeriod()
    public String getGestationPeriod(){
        return gestationPeriod;
    }

    //getModeOfCommunication()
    public String getModeOfCommunication(){
        return  modeOfCommunication;
    }

    //setters
    //setDominantActivity()
    public void setDominantActivity(String dominantActivity){
        this.dominantActivity = dominantActivity;
    }


    //setGestationPeriod()
    public void setGestationPeriod(String gestationPeriod){
        this.gestationPeriod = gestationPeriod;
    }

    //setModeOfCommunication()
    public void setModeOfCommunication(String modeOfCommunication){
        this.modeOfCommunication = modeOfCommunication;
    }

    //Methods
    //getModeOfCommunication

    //getGestationPeriod

    //defensiveMechanism
    public String defensiveMechanism() {
        return "Mammals commonly use running, biting, hiding, or camouflage as defensive mechanisms.";
    }


    @Override
    public String defenseMechanism() {
        return "";
    }

    //makeSound
    public String makeSound() {
        return "This mammal communicates using: " + modeOfCommunication;
    }

    //displayInfo()**
    //@Override
    public void displayInfo() {
        System.out.println("=== Mammal Information ===");
        //System.out.println(getDetails());
    }

    @Override
    public void move() {

    }


    //move
    //@Override
    public void move(String movementType) {
        System.out.println("This mammal moves by: " + movementType);
    }

    //reproduce
    //@Override
    public void reproduce() {
        System.out.println("Mammals reproduce through internal fertilization and give birth to offsprings.");
    }


    //getScientificName**(omit)


    //getDetails**

    //toString**

}
