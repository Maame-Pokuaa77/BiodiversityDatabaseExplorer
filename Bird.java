public class Bird extends Animal {

    // Bird attributes
    private String beakType;
    private boolean canFly;
    private String nestType;

    public Bird(String scientificName, String commonName, String habitat,
                String conservationStatus, String geographicDistribution,
                int lifeSpan, String reproductiveStrategy, String feedingHabits,
                String ecologicalRole, int numOfLegs, String bodyCovering,
                String colour, String movementType,
                String beakType, boolean canFly, String nestType) {

        super(scientificName, commonName, habitat, conservationStatus,
                geographicDistribution, lifeSpan, reproductiveStrategy,
                feedingHabits, ecologicalRole, numOfLegs, bodyCovering,
                colour, movementType);

        this.beakType = beakType;
        this.canFly = canFly;
        this.nestType = nestType;
    }

    // Extra behaviour
    public boolean layEggs() {
        return true;
    }

    public boolean canFly() {
        return canFly;
    }

    public String nestType() {
        return nestType;
    }

    // Getters & setters

    public String getBeakType() {
        return beakType;
    }

    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String getNestType() {
        return nestType;
    }

    public void setNestType(String nestType) {
        this.nestType = nestType;
    }

    // Implement abstract methods from Animal class

    @Override
    public String defenseMechanism() {
        // Simple example – you can change this logic
        if (canFly) {
            return "Flies away to escape predators.";
        } else {
            return "Uses camouflage or sharp beak to defend itself.";
        }
    }

    @Override
    public String makeSound() {
        return "Chirp chirp";
    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }
}
