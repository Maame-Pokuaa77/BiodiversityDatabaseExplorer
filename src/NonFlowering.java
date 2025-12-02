public class NonFlowering extends Plant {   // ADDED FOR INHERITANCE

    private String sporeType;
    private String gametophytePresence;
    private String rhizoidPresence;
    private String vascularSystemType;

    public NonFlowering(
            String scientificName, String commonName, String habitat,     // ADDED
            String conservationStatus, String geographicDistribution,  // ADDED
            int lifeSpan, String reproductiveStrategy, String feedingHabits,       // ADDED
            String ecologicalRole, String rootType, String leafType, String plantHeight, // ADDED
            String veinType, String plantType, String stemType,                     // ADDED
            String sporeType, String gametophytePresence, String rhizoidPresence,
            String vascularSystemType) {

        super(scientificName, commonName, habitat, conservationStatus, geographicDistribution,
                lifeSpan, reproductiveStrategy, feedingHabits, ecologicalRole,
                rootType, leafType, plantHeight, veinType, plantType, stemType);   // ADDED FOR INHERITANCE

        this.sporeType = sporeType;
        this.gametophytePresence = gametophytePresence;
        this.rhizoidPresence = rhizoidPresence;
        this.vascularSystemType = vascularSystemType;
    }

    // ADDED ONLY BECAUSE Plant is abstract
    @Override
    public void photosynthesize() {    // ADDED FOR INHERITANCE
        System.out.println(getCommonName() + " is photosynthesizing.");
    }

    @Override
    public void grow() {    // ADDED FOR INHERITANCE
        System.out.println(getCommonName() + " is growing.");
    }

    // ---- YOUR ORIGINAL CODE BELOW ----

    public int getSporeCount(int sporeCount) {
        return sporeCount;
    }

    public String getSporeDispersalMethod() {
        if (sporeType == null || sporeType.isEmpty()) {
            return "Unknown";
        }

        String type = sporeType.toLowerCase();

        if (type.contains("light") || type.contains("powdery")) {
            return "Wind Dispersal";
        }

        if (type.contains("heavy") || type.contains("sticky")) {
            return "Water Dispersal";
        }

        if (type.contains("capsule") || type.contains("burst")) {
            return "Mechanical Dispersal";
        }

        return "Unknown";
    }

    @Override
    public String toString() {
        return "Non-Flowering Plant:\n" +
                "Spore Type: " + sporeType + "\n" +
                "Gametophyte Presence: " + gametophytePresence + "\n" +
                "Rhizoid Presence: " + rhizoidPresence + "\n" +
                "Vascular System: " + vascularSystemType + "\n" +
                "Spore Dispersal Method: " + getSporeDispersalMethod();
    }
}
