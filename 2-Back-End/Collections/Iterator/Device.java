import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Device {
    int id;
    String name;
    String brand;

    Device(int id, String name, String brand) {
        this.id = id;
        this.name = name;
        this.brand = brand;
    }

    static void addLaptop(ArrayList<Device> laptop, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter ID:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter brand:");
            String brand = sc.nextLine();
            laptop.add(new Device(id, name, brand));
        }
    }

    static void addMobile(ArrayList<Device> mobile, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter ID:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter brand:");
            String brand = sc.nextLine();
            mobile.add(new Device(id, name, brand));
        }
    }

    static void displayDevice(ArrayList<Device> laptop, ArrayList<Device> mobile) {
        Iterator<Device> it_lap = laptop.iterator();
        while (it_lap.hasNext()) {
            Device lap = it_lap.next();
            Iterator<Device> it_mob = mobile.iterator();
            while (it_mob.hasNext()) {
                Device mob = it_mob.next();
                if (lap.brand.equals(mob.brand)) {
                    System.out.println(lap.name + " - " + mob.name + " - " + lap.brand);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of laptops and mobiles:");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Device> laptop = new ArrayList<>();
        ArrayList<Device> mobile = new ArrayList<>();
        addLaptop(laptop, n, sc);
        addMobile(mobile, n, sc);
        displayDevice(laptop, mobile);
    }
}
