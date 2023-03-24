package thucHanh2_HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nguyen Van A" ,20,"HN");
        Student student2 = new Student("Nguyen Van Nam" ,22,"HN");
        Student student3 = new Student("Nguyen Van Thang" ,23,"HN");
        Map<Integer, Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        for (Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student);
        }
        System.out.println("*******SET******");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for (Student student : students) {
            System.out.println("In ra danh sach sinh vien : "+student);
        }

    }
}
