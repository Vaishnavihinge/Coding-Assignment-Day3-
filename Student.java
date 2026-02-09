/*Access Modifiers : Private Modifier
                     Protected Modifier
                     Public Modifier
 */

public class Student {

    private int atmPin = 1234;        // Personal diary
    int classroomNumber = 101;        // Classroom notice
    protected String familyName = "Sharma"; // Family property
    public String collegeName = "ABC College"; // Public park

    // Method inside same class
    public void showStudentDetails() {
        System.out.println("ATM Pin: " + atmPin);
        System.out.println("Classroom No: " + classroomNumber);
        System.out.println("Family Name: " + familyName);
        System.out.println("College Name: " + collegeName);
    }

    public static void main(String[]args){
        Student s = new Student();
        s.showStudentDetails();
    }
}

