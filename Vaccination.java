// Abstract class Vaccine
abstract class Vaccine {
    int age;
    String nationality;

    // Constructor
    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Concrete method for first dose
    void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("You are eligible for the first dose.");
            System.out.println("Please pay Rs. 250 for vaccination.");
            System.out.println("First dose completed successfully!");
        } else {
            System.out.println("You are not eligible for vaccination.");
        }
    }

    // Concrete method for second dose
    void secondDose(boolean firstDoseCompleted) {
        if (firstDoseCompleted) {
            System.out.println("You are eligible for the second dose.");
            System.out.println("Second dose completed successfully!");
        } else {
            System.out.println("You need to complete the first dose before taking the second dose.");
        }
    }

    // Abstract method for booster dose
    abstract void boosterDose();
}

// Implementation class
class VaccinationSuccessful extends Vaccine {

    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    // Implement abstract method
    void boosterDose() {
        System.out.println("You are eligible for the booster dose.");
        System.out.println("Booster dose completed successfully!");
    }
}

// Main class
public class Vaccination {
    public static void main(String[] args) {
        // Sample Input
        String nationality = "Indian";
        int age = 18;

        // Create object
        VaccinationSuccessful person = new VaccinationSuccessful(age, nationality);

        // Scenario 1
        person.firstDose();

        // Scenario 2
        boolean firstDoseCompleted = true; // assuming first dose is done
        person.secondDose(firstDoseCompleted);

        // Scenario 3
        person.boosterDose();
    }
}
