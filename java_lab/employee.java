import java.util.*;

public class employee {
  int eno;
  double salary;
  String ename;
  Scanner sc = new Scanner(System.in);

  void reademp() {
    System.out.println("Enter the emp id : ");
    eno = sc.nextInt();
    System.out.println("Enter emp name : ");
    ename = sc.next();
    System.out.println("Enter emp Slary : ");
    salary = sc.nextDouble();
  }

  void display() {
    System.out.println("ID : " + eno);
    System.out.println("NAME : " + ename);
    System.out.println("SALARY : " + salary);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no of employees : ");
    int n = sc.nextInt();

    employee[] emp = new employee[n];
    for (int i = 0; i < n; i++) {
      emp[i] = new employee();
      emp[i].reademp();
    }
    System.out.println("Enter emp id to be searched : ");
    int no = sc.nextInt();
    int flag = 0;
    for (int i = 0; i < n; i++) {
      if (emp[i].eno == no) {
        emp[i].display();
        flag = 1;
        break;
      }
    }
    if (flag == 0) {
      System.out.println("not found");
    }
  }
}
