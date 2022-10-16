class Main {
    public static void main(String[] args) {

        Course[] firstSemesterCourses = new Course[3];

        firstSemesterCourses[0] = new Course("Basics of programming in Python");
        firstSemesterCourses[1] = new Course("Introduction to computer science");
        firstSemesterCourses[2] = new Course("Mathematics");

        Semester semester1 = new Semester(1, firstSemesterCourses);

        Student dorota = new Student(12345, "Dorota", "WM");
        dorota.enrollToSemester(semester1);
        Student ania = new Student("23445", "Anna", "Kowalska");
        ania.enrollToSemester(semester1);
        Student kamil = new Student(56778, "Kamil", "Nowak", semester1);
    }
}