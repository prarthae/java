import java.util.*;

public class cpu {
    double price;

    class processor {
        int noC;
        String manf;

        processor(int n, String m) {
            noC = n;
            manf = m;
        }

        void display() {
            System.out.println("\n\t PROCESSOR DETAILS\n");
            System.out.println("No of Cores : " + noC);
            System.out.println("Manifacturer : " + manf);
        }
    }

    static class ram {
        int mem;
        String manf;

        ram(int m, String man) {
            mem = m;
            manf = man;
        }

        void display() {
            System.out.println("\n\t RAM DETAILS\n");
            System.out.println("Memmory : " + mem + "GB");
            System.out.println("MAnifacturer : " + manf);
        }
    }

    public static void main(String[] args) {
        cpu cpu1 = new cpu();
        cpu.processor p = cpu1.new processor(8, "intel");
        cpu.ram r = new cpu.ram(128, "sandisk");
        p.display();
        r.display();
    }

}
