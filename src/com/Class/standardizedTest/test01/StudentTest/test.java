package com.Class.standardizedTest.test01.StudentTest;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Student student = new Student();
        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student("xs001","张三",18,"2013-11-11"));
        for (int i = 0; i < st.size(); i++) {
            System.out.println("我是"+st.get(i).getID()+"号"+st.get(i).getName()+" ，年龄"+st.get(i).getAge()+" ，生日"+st.get(i).getBirth());
            student.study();
            student.examination();
            student.swim();
        }
        System.out.println();
        Teacher teacher = new Teacher();
        ArrayList<Teacher> te = new ArrayList<>();
        te.add(new Teacher("js001","王五",30,"1999-12-12"));
        for (int i = 0; i < te.size(); i++) {
            System.out.println("我是"+te.get(i).getID()+"号"+te.get(i).getName()+" ，年龄"+te.get(i).getAge()+" ，生日"+te.get(i).getBirth());
            teacher.teach();
            teacher.research();
            teacher.swim();
        }


    }
}
