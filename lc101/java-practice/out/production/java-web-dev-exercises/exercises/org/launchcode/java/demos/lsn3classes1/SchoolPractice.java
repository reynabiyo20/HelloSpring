package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        Student a = new Student();
        a.setName("Reyna Biyo");
        a.setStudentId(12);
        a.setNumberOfCredits(1);
        a.setGpa(4.0);

        System.out.println(a.getName());

    }

    public static class Course {
    private String courseName;
    private int courseCredit;
    private ArrayList<Student> roster;

//
//        public String getCourseName() {
//            return courseName;
//        }
//
//        public void setCourseName(String aCourseName) {
//            this.courseName = aCourseName;
//        }
//
//        public int getCourseCredit() {
//            return courseCredit;
//        }
//
//        public void setCourseCredit(String aCourseCredit) {
//            this.courseName = aCourseCredit;
//        }


    }


    public static class Teacher {
        private String firstName;
        private String lastName;
        public String subject;
        private int yearsTeaching;



        public String getFirstNameName() {
            return firstName;
        }

        public void setCourseName(String aFirstName) {
            this.firstName = aFirstName;
        }

        public String getLastname() {
            return lastName;
        }

        public void setSubject (String aSubject) {
            this.subject = aSubject;
        }

        public int getYearsTeaching () {
            return yearsTeaching;
        }

        public void setYearsTeaching (int aYearsTeaching) {
            this.yearsTeaching = aYearsTeaching;
        }
    }

}



