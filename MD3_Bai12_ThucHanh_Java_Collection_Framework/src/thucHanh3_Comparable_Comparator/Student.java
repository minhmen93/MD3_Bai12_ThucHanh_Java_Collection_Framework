package thucHanh3_Comparable_Comparator;

public class Student implements Comparable<Student>{
    private String studentName;
    private Integer age;
    private String address;

    public Student(String studentName, Integer age, String address) {
        this.studentName = studentName;
        this.age = age;
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.getStudentName().compareTo(student.getStudentName());
    }
}
