public class Student {

    int number;
    String name;
    String surname;
    Semester currentSemester;

    public Student(int indexNumber, String firstName, String lastName) {
        number = indexNumber;
        name = firstName;
        surname = lastName;
    }

    public Student(String indexNumber, String firstName, String lastName) {
        this(Integer.parseInt(indexNumber), firstName, lastName);
    }

    public Student(int indexNumber, String firstName, String lastName, Semester semester) {
        number = indexNumber;
        name = firstName;
        surname = lastName;
        currentSemester = semester;
    }

    public void enrollToSemester(Semester semester) {
        currentSemester = semester;
    }

}
