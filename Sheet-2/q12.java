import java.util.Scanner;

 class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a >= b && a >= c)
            System.out.println("Largest is: " + a);
        else if(b >= a && b >= c)
            System.out.println("Largest is: " + b);
        else
            System.out.println("Largest is: " + c);
    }
}
