public class NonFlowering extends Plant {
    private String sporeType;
    private String gametophytePresence;
    private String rhizoidPresence;
    private String vascularSystemType;
    private int sporeCount;

    public NonFlowering(String sporeType, String gametophytePresence, String rhizoidPresence, String vascularSystemType, int sporeCount, String commonName, String habitat,
                        String conservationStatus, String geographicDistribution,
                        int lifeSpan, String reproductiveStrategy, String feedingHabits,
                        String ecologicalRole, String rootType, String leafType,
                        String plantHeight, String veinType, String plantType, String stemType) {

        super(commonName, commonName, habitat, conservationStatus, geographicDistribution, lifeSpan, reproductiveStrategy, feedingHabits, ecologicalRole, rootType, leafType, plantHeight, veinType, plantType, stemType);
        this.sporeType = sporeType;
        this.gametophytePresence = gametophytePresence;
        this.rhizoidPresence = rhizoidPresence;
        this.vascularSystemType = vascularSystemType;
        this.sporeCount = sporeCount;

    }

    public String getSporeType() {
        return sporeType;
    }

    public void setSporeType(String sporeType) {
        this.sporeType = sporeType;
    }

    public String getGametophytePresence() {
        return gametophytePresence;
    }

    public void setGametophytePresence(String gametophytePresence) {
        this.gametophytePresence = gametophytePresence;
    }

    public String getRhizoidPresence() {
        return rhizoidPresence;
    }

    public void setRhizoidPresence(String rhizoidPresence) {
        this.rhizoidPresence = rhizoidPresence;
    }

    public String getVascularSystemType() {
        return vascularSystemType;
    }

    public void setVascularSystemType(String vascularSystemType) {
        this.vascularSystemType = vascularSystemType;
    }

    public int getSporeCount() {
        return sporeCount;
    }

    @Override
    public void grow() {
        System.out.println("Non-flowering plant growing via spores (" + sporeType + ")");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Photosynthesizing with " + vascularSystemType + " vascular system");
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
    public void move() {
        
    }

    @Override
    public void reproduce() {

    }
}
