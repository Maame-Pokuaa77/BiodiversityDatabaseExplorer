public class Flowering extends Plant {   // ADDED FOR INHERITANCE

    private String flowerSize;
    private String flowerShape;
    private int petalCount;
    private String flowerColor;

    // FULL constructor including Plant fields
    public Flowering(
            String scientificName, String commonName, String habitat,   // ADDED FOR INHERITANCE
            String conservationStatus, String geographicDistribution,  // ADDED
            int lifeSpan, String reproductiveStrategy, String feedingHabits,      // ADDED
            String ecologicalRole, String rootType, String leafType, String plantHeight, // ADDED
            String veinType, String plantType, String stemType,                     // ADDED
            String flowerSize, String flowerShape, int petalCount, String flowerColor) {

        super(scientificName, commonName, habitat, conservationStatus, geographicDistribution,
                lifeSpan, reproductiveStrategy, feedingHabits, ecologicalRole,
                rootType, leafType, plantHeight, veinType, plantType, stemType);   // ADDED FOR INHERITANCE

        this.flowerSize = flowerSize;
        this.flowerShape = flowerShape;
        this.petalCount = petalCount;
        this.flowerColor = flowerColor;
    }

    // ADDED ONLY BECAUSE Plant is abstract
    @Override
    public void photosynthesize() {   // ADDED FOR INHERITANCE
        System.out.println(getCommonName() + " is performing photosynthesis.");
    }

    @Override
    public void grow() {   // ADDED FOR INHERITANCE
        System.out.println(getCommonName() + " is growing.");
    }

    // --- YOUR ORIGINAL METHODS BELOW ---

    public String getPollinationMethod() {
        if (flowerColor.equalsIgnoreCase("yellow") ||
                flowerColor.equalsIgnoreCase("purple") ||
                flowerColor.equalsIgnoreCase("blue") ||
                petalCount >= 5) {
            return "Insect Pollination";
        }

        if ((flowerColor.equalsIgnoreCase("red") || flowerColor.equalsIgnoreCase("orange")) &&
                (flowerShape.equalsIgnoreCase("tubular") || flowerShape.equalsIgnoreCase("funnel"))) {
            return "Bird Pollination";
        }

        if (flowerColor.equalsIgnoreCase("white") &&
                flowerSize.equalsIgnoreCase("large")) {
            return "Bat Pollination";
        }

        if ((flowerColor.equalsIgnoreCase("green") || flowerColor.equalsIgnoreCase("brown")) &&
                petalCount <= 3) {
            return "Wind Pollination";
        }

        if (flowerShape.equalsIgnoreCase("streamlined") &&
                petalCount <= 3) {
            return "Water Pollination";
        }

        return "Unknown Pollination Method";
    }

    public boolean hasColourfulFoliage() {
        String[] colourfulColours = {"red", "pink", "purple", "yellow", "orange", "blue"};
        for (String c : colourfulColours) {
            if (flowerColor.equalsIgnoreCase(c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Flowering Plant Details:\n" +
                "Flower Size: " + flowerSize + "\n" +
                "Flower Shape: " + flowerShape + "\n" +
                "Petal Count: " + petalCount + "\n" +
                "Flower Color: " + flowerColor + "\n" +
                "Pollination Method: " + getPollinationMethod() + "\n" +
                "Has Colourful Foliage: " + hasColourfulFoliage();
    }
}





