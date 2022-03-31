package com.company;

        public class Student {
            String studName;
            int studAge;

            void initialize()
            {
                studName = "James Anderson";
                studAge = 26;
            }
            void display()
            {
                System.out.println("Student name: " + studName);
                System.out.println("Student Age: " + studAge);
            }
            public static void main(String[] args)
            {
                Student objStudent = new Student();
                objStudent.initialize();
                objStudent.display();
            }
        }



