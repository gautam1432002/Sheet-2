import java.util.Scanner;

 class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a <= b && a <= c)
            System.out.println("Smallest is: " + a);
        else if(b <= a && b <= c)
            System.out.println("Smallest is: " + b);
        else
            System.out.println("Smallest is: " + c);
    }
}
