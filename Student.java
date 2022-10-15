
public class Student {
  
  int indexNumber;
  String name;
  String surname;

  Speciality speciality;
  
  public Student(int number, String name, String surname) {
    indexNumber = number;
    name = name;
    surname = surname;
  }

  public static void main(String[] args) {
    Speciality informatyka = new Speciality();
    
    Student dorota = new Student(123, "Dorota", "WM");
    
  }

}
