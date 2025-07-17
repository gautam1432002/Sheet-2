import java.util.Scanner;

class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity, cost;
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        cost = quantity * 100;

        if(cost > 1000) {
            cost = cost - (cost * 10 / 100);
        }

        System.out.println("Total cost: " + cost);
    }
}
