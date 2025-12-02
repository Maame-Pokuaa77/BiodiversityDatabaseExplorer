public class Flowering extends Plant{
    private String flowerSize;
    private String flowerShape;
    private int petalCount;
    private String flowerColor;

    
    public Flowering(String flowerSize, String flowerShape, int petalCount, String flowerColor, String scientificName, String commonName, String habitat,
        String conservationStatus, String geographicDistribution,
        int lifeSpan, String reproductiveStrategy, String feedingHabits,
        String ecologicalRole, String rootType, String leafType, 
        String plantHeight, String veinType, String plantType, String stemType) {

        super(scientificName, commonName, habitat, conservationStatus,
                geographicDistribution, lifeSpan, reproductiveStrategy,
                feedingHabits, ecologicalRole,rootType,leafType,plantHeight,veinType,plantType,stemType);
       
        this.flowerSize = flowerSize;
        this.flowerShape = flowerShape;
        this.petalCount = petalCount;
        this.flowerColor = flowerColor;
    }

    public String getFlowerSize() {
        return flowerSize;
    }

    public void setFlowerSize(String flowerSize) {
        this.flowerSize = flowerSize;
    }

    public String getFlowerShape() {
        return flowerShape;
    }

    public void setFlowerShape(String flowerShape) {
        this.flowerShape = flowerShape;
    }

    public int getPetalCount() {
        return petalCount;
    }

    public void setPetalCount(int petalCount) {
        this.petalCount = petalCount;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getPollinationMethod() {
        // Insect pollination
        if (flowerColor.equalsIgnoreCase("yellow") ||
                flowerColor.equalsIgnoreCase("purple") ||
                flowerColor.equalsIgnoreCase("blue") ||
                petalCount >= 5) {
            return "Insect Pollination";
        }
        // Bird pollination
        if ((flowerColor.equalsIgnoreCase("red") || flowerColor.equalsIgnoreCase("orange")) &&
                (flowerShape.equalsIgnoreCase("tubular") || flowerShape.equalsIgnoreCase("funnel"))) {
            return "Bird Pollination";
        }
        // Bat pollination
        if (flowerColor.equalsIgnoreCase("white") &&
                flowerSize.equalsIgnoreCase("large")) {
            return "Bat Pollination";
        }
        // Wind pollination
        if ((flowerColor.equalsIgnoreCase("green") || flowerColor.equalsIgnoreCase("brown")) &&
                petalCount <= 3) {
            return "Wind Pollination";
        }

        // Water pollination
        if (flowerShape.equalsIgnoreCase("streamlined") &&
                petalCount <= 3) {
            return "Water Pollination";
        }
        return "Unknown Pollination Method";


    }

    public boolean hasColourfulFoliage() {
        // List of vibrant / colourful flower colours
        String[] colourfulColours = {"red", "pink", "purple", "yellow", "orange", "blue"};

        for (String c : colourfulColours) {
            if (flowerColor.equalsIgnoreCase(c)) {
                return true;   // If flower colour is vibrant, we assume colourful foliage
            }
        }

        return false;

    }
    @Override
    public String toString() {
        return """
                Flowering Plant Details:
                Flower Size: %s
                Flower Shape: %s
                Petal Count: %d
                Flower Color: %s
                Pollination Method: %s
                Has Colourful Foliage: %b
                """.formatted(flowerSize, flowerShape, petalCount, 
                              flowerColor, getPollinationMethod(), 
                              hasColourfulFoliage());
    }

     // Implement abstract methods
     @Override
     public void grow() {
         System.out.println("Flowering plant is growing with flowers of size: " + flowerSize);
     }
     @Override
     public void photosynthesize() {
         System.out.println("Flowering plant is photosynthesizing through its leaves");
     }


}
