public class Flowering {
    private String flowerSize;
    private String flowerShape;
    private int petalCount;
    private String flowerColor;

    public Flowering() {
        this.flowerSize = "flower";
        this.flowerShape = "flower";
        this.petalCount = 1;
        this.flowerColor = "red";
    }

    public Flowering(String flowerSize, String flowerShape, int petalCount, String flowerColor) {
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




