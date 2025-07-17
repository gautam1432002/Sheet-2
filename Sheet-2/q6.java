import java.util.Scanner;

 class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter a number: ");
        a = sc.nextInt();

        if(a < 0) {
            a = -a;
        }

        System.out.println("Absolute value: " + a);
    }
}
