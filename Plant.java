
public abstract class Plant extends Species {
    
    // Plant-specific attributes
    private  String rootType;
    private String leafType;
    private String plantHeight;
    private String veinType;
    private String plantType;
    private String stemType;

    public Plant(String scientificName, String commonName, String habitat,
        String conservationStatus, String geographicDistribution,
        int lifeSpan, String reproductiveStrategy, String feedingHabits,
        String ecologicalRole, String rootType, String leafType, 
        String plantHeight, String veinType, String plantType, String stemType) {

        super(scientificName, commonName, habitat, conservationStatus,
            geographicDistribution, lifeSpan, reproductiveStrategy,
            feedingHabits, ecologicalRole);

        this.rootType = rootType;
        this.leafType = leafType;
        this.plantHeight = plantHeight;
        this.veinType = veinType;
        this.plantType = plantType;
        this.stemType = stemType;
    }

    // Getters
    public String getRootType() {
return rootType;
}

    public String getLeafType() {
    return leafType;
    }

    public String getPlantHeight() {
return plantHeight;
}

    public String getVeinType() {
return veinType;
}

    public String getPlantType() {
return plantType;
}

    public String getStemType() {
return stemType;
}

    // Setters
    public void setRootType(String rootType) {
this.rootType = rootType;
}

    public void setLeafType(String leafType) {
this.leafType = leafType;
}

    public void setPlantHeight(String plantHeight) {
this.plantHeight = plantHeight;
}

    public void setVeinType(String veinType) {
this.veinType = veinType;
}

    public void setPlantType(String plantType) {
this.plantType = plantType;
}

    public void setStemType(String stemType) {
this.stemType = stemType;
}


    public abstract void photosynthesize();
    
    public abstract void grow();
}
    
  