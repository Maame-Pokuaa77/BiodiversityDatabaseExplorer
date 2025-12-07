public class Fish extends Animal {

    // Fish attributes
    private String finType;
    private String scaleType;
    private boolean swimBladderPresence;

    public Fish(String scientificName, String commonName, String habitat,
                String conservationStatus, String geographicDistribution,
                int lifeSpan, String reproductiveStrategy, String feedingHabits,
                String ecologicalRole, int numOfLegs, String bodyCovering,
                String colour, String movementType,
                String finType, String scaleType, boolean swimBladderPresence) {

        super(scientificName, commonName, habitat, conservationStatus,
                geographicDistribution, lifeSpan, reproductiveStrategy,
                feedingHabits, ecologicalRole, numOfLegs, bodyCovering,
                colour, movementType);

        this.finType = finType;
        this.scaleType = scaleType;
        this.swimBladderPresence = swimBladderPresence;
    }

    // Extra behaviour

    public boolean evadePredator() {
        return true;
    }

    public boolean breatheUnderWater() {
        return true;
    }

    // Getters & setters

    public String getFinType() {
        return finType;
    }

    public void setFinType(String finType) {
        this.finType = finType;
    }

    public String getScaleType() {
        return scaleType;
    }

    public void setScaleType(String scaleType) {
        this.scaleType = scaleType;
    }

    public boolean hasSwimBladderPresence() {
        return swimBladderPresence;
    }

    public void setSwimBladderPresence(boolean swimBladderPresence) {
        this.swimBladderPresence = swimBladderPresence;
    }

    // Implement abstract methods from Animal

    @Override
    public String defenseMechanism() {
        return "Uses fast swimming and schooling to evade predators.";
    }

    @Override
    public String makeSound() {
        return "     ";
    }

    @Override
    public void move() {

    }

    @Override
    public void reproduce() {

    }
}
