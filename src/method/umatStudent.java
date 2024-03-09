import java.util.Random;

public class umatStudent {
    // Default values
    private String name;
    private int yearOfBirth;
    private String hometown;
    private String department;
    private String programme;
    private int yearOfStudy;
    private String hostelHall;
    private double cwa;
    private String gender;
    private String indexNumber;
    private double loan;

    public umatStudent(String string, int i, String string2, String string3, String string4, int j, String string5,
            double d, String string6, String string7, int k) {
        //TODO Auto-generated constructor stub
    }

    // Constructor
    public void UMATStudent(String name, int yearOfBirth, String hometown, String department, String programme, int yearOfStudy, String hostelHall, double cwa, String gender, String indexNumber, double loan) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.hometown = hometown;
        this.department = department;
        this.programme = programme;
        this.yearOfStudy = yearOfStudy;
        this.hostelHall = hostelHall;
        this.cwa = cwa;
        this.gender = gender;
        this.indexNumber = indexNumber;
        this.loan = loan;
    }

    // Method to generate any attribute randomly
    public void generateRandomAttribute() {
        Random rand = new Random();
        int choice = rand.nextInt(10); // There are 11 attributes, so generate a random number from 0 to 10
        
        switch (choice) {
            case 0:
                setName("John Doe");
                break;
            case 1:
                setYearOfBirth(2000 + rand.nextInt(20)); // Random year of birth between 2000 and 2019
                break;
            case 2:
                setHometown("Accra"); // Default hometown
                break;
            case 3:
                setDepartment("Computer Science"); // Default department
                break;
            case 4:
                setProgramme("Bachelor of Science"); // Default programme
                break;
            case 5:
                setYearOfStudy(rand.nextInt(5) + 1); // Random year of study between 1 and 5
                break;
            case 6:
                setHostelHall("Pentagon Hall"); // Default hostel/hall
                break;
            case 7:
                setCwa(3.5 + rand.nextDouble() * 1.5); // Random CWA between 3.5 and 5.0
                break;
            case 8:
                setGender("Male"); // Default gender
                break;
            case 9:
                setIndexNumber("UMAT/123456/20"); // Default index number
                break;
            case 10:
                setLoan(1000 + rand.nextInt(10000)); // Random loan amount between 1000 and 11000
                break;
        }
    }

    // Method to change programme
    public void changeProgramme(String newProgramme) {
        setProgramme(newProgramme);
    }

    // Method to change department
    public void changeDepartment(String newDepartment) {
        setDepartment(newDepartment);
    }

    // Method to change CWA (Cumulative Weighted Average)
    public void changeCwa(double newCwa) {
        setCwa(newCwa);
    }

    // Getter and setter methods for all attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getHostelHall() {
        return hostelHall;
    }

    public void setHostelHall(String hostelHall) {
        this.hostelHall = hostelHall;
    }

    public double getCwa() {
        return cwa;
    }

    public void setCwa(double cwa) {
        this.cwa = cwa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    // Unique method to display student information
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Year of Birth: " + getYearOfBirth());
        System.out.println("Hometown: " + getHometown());
        System.out.println("Department: " + getDepartment());
        System.out.println("Programme: " + getProgramme());
        System.out.println("Year of Study: " + getYearOfStudy());
        System.out.println("Hostel/Hall: " + getHostelHall());
        System.out.println("CWA: " + getCwa());
        System.out.println("Gender: " + getGender());
        System.out.println("Index Number: " + getIndexNumber());
        System.out.println("Loan: " + getLoan());
    }

    public static void main(String[] args) {
        // Example usage
        umatStudent student = new umatStudent("Jane Doe", 2002, "Kumasi", "Electrical Engineering", "Bachelor of Engineering", 2, "Block B", 3.8, "Female", "UMAT/789012/22", 5000);
        student.displayInfo();

        System.out.println("\nChanging Programme...");
        student.changeProgramme("Bachelor of Science in Computer Science");
        student.displayInfo();

        System.out.println("\nGenerating Random Attribute...");
        student.generateRandomAttribute();
        student.displayInfo();

        System.out.println("\nChanging CWA...");
        student.changeCwa(4.2);
        student.displayInfo();
    }
}
