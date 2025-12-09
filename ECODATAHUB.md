                   Biodiversity Database Explorer
A Java-based Object-Oriented Programming application for managing biodiversity data across mammals, birds, fish, flowering plants, and non-flowering plants.

Overview
Demonstrates core OOP principles: Inheritance, Polymorphism, Encapsulation, and Abstraction.

Features:
Pre-loaded species (5 mammals, 5 birds, 5 fish, 5 flowering plants, 5 non-flowering plants)
Command-line and GUI interfaces
Search/filter options
JUnit 5 test(s)

                         
                         PROJECT STRUCTURE
Species. java                 - Abstract base class
Animal.java                  - Abstract animal class
Plant.java                   - Abstract plant class
Mammals.java                 - Concrete mammal class
Bird.java                    - Concrete bird class
Fish.java                    - Concrete fish class
Flowering. java               - Flowering plant class
NonFlowering. java            - Non-flowering plant class
BiodiversityDatabase.java   - Database with search/filter methods
BiodiversityGUI. java         - GUI interface
SpeciesTableModel.java       - Table model for GUI
tests (Fish,Bird,FLowering,NonFLowering test)          - JUnit tests

                    Species (abstract)
                        │
        ┌───────────────┴───────────────┐
        │                               │
    Animal (abstract)               Plant (abstract)
        │                               │
  ┌─────┼─────┐              ┌──────────┴──────────┐
  │     │     │              │                     │
Mammals Bird Fish        Flowering            NonFlowering

            HOW TO COMPILE THE PROJECT FROM COMMAND LINE

Step 1: Open Terminal/Command Prompt
  - Windows: Press Win+R, type "cmd", press Enter
  - macOS:  Press Cmd+Space, type "Terminal", press Enter
  - Linux: Press Ctrl+Alt+T

Step 2: Navigate to Project Directory
  cd path/to/BiodiversityDatabaseExplorer

Step 3: Compile All Java Files
Windows: 
    javac *.java
macOS/Linux:
    javac *.java

Step 4: Verify Compilation
  You should see . class files created for each . java file
 Windows:
    dir *.class
   macOS/Linux: 
    ls *.class

                          HOW TO RUN THE PROGRAM
OPTION 1: Run Command-Line Version

STEP 1: Ensure you are in the project directory (from compilation steps above)
STEP 2: Type the following command and press Enter:

    java BiodiversityDatabase
OPTION 2: Run Graphical User Interface (GUI)

STEP 1: Ensure you are in the project directory (from compilation steps above)
STEP 2: Type the following command and press Enter:
java BiodiversityGUI
STEP 3: Use the GUI window

  A window will appear with:
    - Table showing the common names of the species
    - Search bar at the top
    - Details panel on the right
    - Add/Delete buttons at the bottom

  GUI Usage:
    1. Click the specific species to view species details
    2. Type a name in the search box and click "Search"
    3. Fill in the form at bottom and click "Add Species" to add new species
    4. Select a row and click "Delete Selected" to remove a species

                            PREREQUISITES
Required Software:
- Java Development Kit (JDK) version 8 or higher
  Download:  https://www.oracle.com/java/technologies/downloads/
  
Verify installation:
  java -version
  javac -version

                            DEPENDENCIES
Core Application:
  - Java Standard Library (JDK 8+)
    * java.util.ArrayList
    * java.util.List
    * java.util.HashMap
    * java.util.function. Predicate
    * java.util.stream. Collectors

GUI Application:
  - Java Swing (included in JDK)
    * javax.swing.*
    * java.awt.*

Testing (Optional):
  - JUnit 5 (Jupiter) version 5.9.3 or higher
    * org.junit.jupiter.api.Test
    * org.junit.jupiter.api.Assertions

No external libraries required for core functionality.

  
