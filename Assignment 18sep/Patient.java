public class Patient {
    // Static variable shared among all patients
    private static String hospitalName = "City Care Hospital";

    // Static variable to count total patients admitted
    private static int totalPatients = 0;

    // Instance variables
    private String name;
    private int age;
    private String ailment;
    private final String patientID;  // final variable to uniquely identify each patient

    // Constructor using 'this' to initialize variables
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;  // Increment count when a new patient is created
    }

    // Static method to get total patients admitted
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details with instanceof check
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Object is not an instance of Patient.");
        }
    }

    // Optional getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAilment() {
        return ailment;
    }

    public String getPatientID() {
        return patientID;
    }
}

