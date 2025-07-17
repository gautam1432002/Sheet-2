import java.util.Scanner;

class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, breadth;
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();

        if(length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is not a square.");
        }
    }
}
