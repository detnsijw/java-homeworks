package library_task;

public class Student {
    String studentName;
    String studentLastname;
    int studentId;
    int counter = 0;

    public Student(String studentName, String studentLastname, int studentId) {
        this.studentName = studentName;
        this.studentLastname = studentLastname;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastname() {
        return studentLastname;
    }

    public void setStudentLastname(String studentLastname) {
        this.studentLastname = studentLastname;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void takeBook(String title, String authorDetails){
        if(counter == 0) {
            System.out.println(studentName + " " + studentLastname + " получил книгу: " + title + " " + authorDetails);
            counter++;
        } else{
            System.out.println(studentName + " " + studentLastname + " не может взять книгу" + " " + title);
        }
    }

    public void retakeBook(String title, String authorDetails) {
        counter--;
        System.out.println("Спасибо, вы вернули книгу " + title + "! Приходите еще!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentLastname='" + studentLastname + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
