import java.util.*;

class person {
    String name, gender;
    String[] ad = new String[3];
    int age;
    Scanner sc = new Scanner(System.in);

    person(int x) {
        System.out.println("Enter name : ");
        name = sc.next();
        System.out.println("Enter gender : ");
        gender = sc.next();
        System.out.println("Enter age : ");
        age = sc.nextInt();
        System.out.println("Enter adress : ");
        for (int i = 0; i < 3; i++) {
            ad[i] = sc.next();
        }
    }
}

class employee extends person {
    int empid;
    String c_name, ql;
    double salary;

    employee(int x) {
        super(x);
        System.out.println("Enter empid : ");
        empid = sc.nextInt();
        System.out.println("company name : ");
        c_name = sc.next();
        System.out.println("qualification : ");
        ql = sc.next();
        System.out.println("Salary : ");
        salary = sc.nextDouble();
    }
}

class Teacher extends employee {
    String sub[];
    int n, id;
    String dept;

    Teacher(int x) {
        super(x);
        System.out.println("Enter id : ");
        id = sc.nextInt();
        System.out.println("Enter department : ");
        dept = sc.next();
        System.out.println("Enter number of subject : ");
        n = sc.nextInt();
        sub = new String[n];
        System.out.println("Enter subjects : ");
        for (int i = 0; i < n; i++) {
            sub[i] = sc.next();
        }
    }

    void disply(int y) {
        System.out.println("\n\n\t DETAILS OF TEACHER : " + y);
        System.out.println("NAME : " + name);
        System.out.println("GENDER : " + gender);
        System.out.println("AGE : " + age);
        System.out.println("ADRESS : ");
        for (int i = 0; i < 3; i++) {
            System.out.println("\t" + ad[i]);
        }
        System.out.println("EMPLOYEE ID : " + empid);
        System.out.println("COMPANY : " + c_name);
        System.out.println("QUALIFICATION : " + ql);
        System.out.println("SALARY : " + salary);
        System.out.println("TEACHER ID : " + id);
        System.out.println("DEPARTMENT : " + dept);
        System.out.println("SUBJECTS : ");
        for (int i = 0; i < n; i++) {
            System.out.println("\t" + sub[i]);
        }

    }
}

public class personInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons : ");
        int no = sc.nextInt();

        Teacher t1[] = new Teacher[no];
        for (int i = 0; i < no; i++) {
            t1[i] = new Teacher(i + 1);
        }
        for (int i = 0; i < no; i++) {
            t1[i].disply(i + 1);
        }
    }

}
