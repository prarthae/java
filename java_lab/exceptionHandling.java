import java.util.*;

class nameException extends RuntimeException {
    nameException(String s) {
        super(s);
    }
}

class passException extends RuntimeException {
    passException(String s) {
        super(s);
    }
}

class user {
    String name, pass;

    user(String n, String p) {
        name = n;
        pass = p;
    }

    void login(String n, String p) {
        try {
            if (name.equals(n) && pass.equals(p)) {
                System.out.println("login successfull.....");
            } else {
                throw new passException("Invalid username or password");
            }
        } catch (passException e) {
            System.out.println("\n" + e.getMessage());
            System.exit(0);
        }
    }

}

public class exceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name : ");
        String us = sc.next();
        try {
            for (int i = 0; i < us.length(); i++) {

                if ((us.charAt(i) >= 65 && us.charAt(i) <= 90) || (us.charAt(i) >= 97 && us.charAt(i) <= 122)) {
                    continue;
                } else {
                    throw new nameException("Invalid username : ");
                }
            }
        } catch (nameException e) {
            System.out.println("\n" + e.getMessage());
            System.exit(0);
        }

        System.out.println("Enter password : ");
        String pswd = sc.next();
        try {
            int flag = 0;
            if (pswd.length() < 8) {
                throw new nameException("password should contain minimum 8 characters........ ");
            }
            for (int i = 0; i < pswd.length(); i++) {
                char ch = pswd.charAt(i);
                if ((ch >= 48 && ch <= 57)) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                throw new passException("password contain minimum one number.......");
            }

        } catch (passException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (nameException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        user u1 = new user(us, pswd);
        System.out.println("\tlogined...");
        System.out.println("enter username : ");
        String n1 = sc.next();
        System.out.println("Enter passsword : ");
        String p1 = sc.next();
        u1.login(n1, p1);
    }

}
