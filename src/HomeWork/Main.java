package HomeWork;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        try {
            Student student1 = new Student("Tima", 21);
            Student student2 = new Student("Zuh", -3);
            Student student3 = new Student("Zarip", 2);

            //
            ArrayList<Student> students = new ArrayList<>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            System.out.println(students);
            method();
        } catch (NullException a){
            System.out.println(a.getMessage());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Буттту");
        }
    }

    public static void method () {
        int age =1;
        if (age < 0){
            System.out.println();
        }
    }


}