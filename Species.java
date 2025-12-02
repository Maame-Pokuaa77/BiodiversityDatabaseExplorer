public abstract class Species {

    //Attributes
    protected String scientificName;
    protected String commonName;
    protected String habitat;
    protected String conservationStatus;
    protected String geoDistribution;
    protected int lifeSpan;
    protected String reproductiveStrategy;
    protected String feedingHabits;
    protected String ecologicalRole;


    //No-arg constructor
    public Species(){


    }

    //Fully-parameterised constructor
    public Species(String scientificName, String commonName, String habitat, String conservationStatus, String geoDistribution, int lifeSpan, String reproductiveStrategy, String feedingHabits, String ecologicalRole){
        this.scientificName = scientificName;
        this.commonName = commonName;
        this.habitat = habitat;
        this.conservationStatus = conservationStatus;
        this.geoDistribution = geoDistribution;
        this.lifeSpan = lifeSpan;
        this.reproductiveStrategy = reproductiveStrategy;
        this.feedingHabits = feedingHabits;
        this.ecologicalRole = ecologicalRole;
    }

    //Getters
    //getScientificName()
    public String getScientificName(){
        return scientificName;
    }

    //getCommonName()
    public String getCommonName(){
        return commonName;
    }

    //getHabitat()
    public String getHabitat(){
        return habitat;
    }

    //getConservationStatus()
    public String getConservationStatus(){
        return conservationStatus;
    }

    //getGeoDistribution()
    public String getGeoDistribution(){
        return geoDistribution;
    }

    //getLifeSpan()
    public int getLifeSpan(){
        return lifeSpan;
    }

    //getReproductiveStrategy()
    public String getReproductiveStrategy(){
        return reproductiveStrategy;
    }

    //getFeedingHabits()
    public String getFeedingHabits(){
        return feedingHabits;
    }

    //getEcologicalRole()
    public String getEcologicalRole(){
        return ecologicalRole;
    }


    //Setters
    //setScientificName()
    public void setScientificName(String scientificName){
        this.scientificName = scientificName;
    }

    //setCommonName()

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }


    //setHabitat()

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }


    //setConservationStatus()

    public void setConservationStatus(String conservationStatus) {
        this.conservationStatus = conservationStatus;
    }


    //setGeoDistribution()

    public void setGeoDistribution(String geoDistribution) {
        this.geoDistribution = geoDistribution;
    }


    //setLifeSpan()

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }


    //setReproductiveStrategy()

    public void setReproductiveStrategy(String reproductiveStrategy) {
        this.reproductiveStrategy = reproductiveStrategy;
    }


    //setFeedingHabits()

    public void setFeedingHabits(String feedingHabits) {
        this.feedingHabits = feedingHabits;
    }


    //setEcologicalRole()

    public void setEcologicalRole(String ecologicalRole) {
        this.ecologicalRole = ecologicalRole;
    }


    //Methods
    //displayInfo()
    public void displayInfo() {
        System.out.println("Organism Information");
        System.out.println("-----------------------------------");
        System.out.println("Scientific Name: " + scientificName);
        System.out.println("Common Name: " + commonName);
        System.out.println("Habitat: " + habitat);
        System.out.println("Conservation Status: " + conservationStatus);
        System.out.println("Geographical Distribution: " + geoDistribution);
        System.out.println("Lifespan: " + lifeSpan + " years");
        System.out.println("Reproductive Strategy: " + reproductiveStrategy);
        System.out.println("Feeding Habits: " + feedingHabits);
        System.out.println("Ecological Role: " + ecologicalRole);
    }

    //move()
    public abstract void move();



    //reproduce()
    public abstract void reproduce();

    //getScientificName()**Omit

    //getDetails()** Which details?


    //toString()**
    @Override
    public String toString() {
        return scientificName + " (" + commonName + ") resides in the " + habitat;
    }


}
