public class NonFlowering {
    private String sporeType;
    private String gametophytePresence;
    private String rhizoidPresence;
    private String vascularSystemType;

    public NonFlowering() {
        this.sporeType = "";
        this.gametophytePresence = "";
        this.rhizoidPresence = "";
        this.vascularSystemType = "";
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

    public int getSporeCount(int getSporeCount) {
        if (getSporeCount == 0) {
            return 0;
        } else if (getSporeCount == 1) {
            return 1;
        } else if (getSporeCount == 2) {
            return 2;
        }
        return 0;

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



}
