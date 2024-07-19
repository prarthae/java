import java.util.*;

class employee {
    Scanner sc = new Scanner(System.in);
    int eid;
    String ename;
    String[] ad = new String[3];

    employee(int x) {
        System.out.println("\n\t details of " + x + " Enmloyee");
        System.out.println("Enter employee name : ");
        ename = sc.next();
        System.out.println("Enter emp ID : ");
        eid = sc.nextInt();
        System.out.println("Enter Adress : ");
        for (int i = 0; i < 3; i++) {
            ad[i] = sc.next();
        }
    }
}

class teacher extends employee {
    String dept, sub[];
    int n;

    teacher(int x) {
        super(x);
        System.out.println("Enter details of teacher " + x);
        System.out.println("Enter department : ");
        dept = sc.next();
        System.out.println("Enter number of subject taught by : ");
        n = sc.nextInt();
        System.out.println("Enter " + n + " subjects");
        sub = new String[n];
        for (int i = 0; i < n; i++) {
            sub[i] = sc.next();
        }
    }

    void display(int x) {
        System.out.println("\nDETAILE OF TEACHER " + x);
        System.out.println("ID : " + eid);
        System.out.println("NAME : " + ename);
        System.out.println("ADRESS : ");
        for (int i = 0; i < 3; i++) {
            System.out.println(ad[i]);
        }
        System.out.println("DEPARTMENT : " + dept);
        System.out.println("SUBJECT : ");
        for (int i = 0; i < n; i++) {
            System.out.println(sub[i]);
        }
    }
}

public class empTeacher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees :");
        int size = sc.nextInt();

        teacher[] t = new teacher[size];
        for (int i = 0; i < size; i++) {
            t[i] = new teacher(i + 1);
        }
        System.out.println("\n\n\t LIST OF EMPLOYEES");
        for (int i = 0; i < size; i++) {
            t[i].display(i + 1);
        }
    }

}
