import java.util.Scanner;

 class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter age of first person: ");
        a = sc.nextInt();
        System.out.print("Enter age of second person: ");
        b = sc.nextInt();
        System.out.print("Enter age of third person: ");
        c = sc.nextInt();

        // Oldest
        if(a > b && a > c) {
            System.out.println("Oldest: Person 1");
        } else if(b > c) {
            System.out.println("Oldest: Person 2");
        } else {
            System.out.println("Oldest: Person 3");
        }

        // Youngest
        if(a < b && a < c) {
            System.out.println("Youngest: Person 1");
        } else if(b < c) {
            System.out.println("Youngest: Person 2");
        } else {
            System.out.println("Youngest: Person 3");
        }
    }
}
