package thucHanh3_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien",20,"HN");
        Student student1 = new Student("Nam",32,"BN");
        Student student2 = new Student("Nhan",22,"HN");
        Student student3 = new Student("Men",24,"HN");
        Student student4 = new Student("Ngan",21,"HN");
        Student student5 = new Student("Minh",19,"HN");
        Student student6 = new Student("Nhi",16,"HN");


        List<Student> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        lists.add(student5);
        lists.add(student6);
        Collections.sort(lists);
        for (Student studentList: lists) {
            System.out.println(studentList.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sánh theo tuổi: ");
        for (Student st :lists) {
            System.out.println(st.toString());
        }
    }
}
