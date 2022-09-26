package exception;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void checkAge(int age) throws TooYoungAgeException, TooOldAgeException {
        if (age < 20 ) {
            throw new TooYoungAgeException("Too young, can't work!");
        } else if (age > 45 ) {
            throw new TooOldAgeException("Too old, can't work! ");
        }
        System.out.println("Age is ok");
    }


    public static void main(String[] args) throws AgeException {
        Student s1 = new Student("A1", 19);
        Student s2 = new Student("A2", 30);
        Student s3 = new Student("A3", 15);

//        try {
//            checkAge(s1.getAge());
//            System.out.println("Pass");
//        } catch (AgeException e){
//            e.getMessage();
//        }

        try {
            checkAge(s1.getAge());
            System.out.println("Age is oke");
            System.out.println("Pass");
        } catch (AgeException e) {
            System.out.println(e.getMess());
        }



    }
}