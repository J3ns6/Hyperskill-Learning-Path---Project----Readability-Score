import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double  b = sc.nextDouble();
        double res = Math.pow(a, b);

        System.out.println(res);
    }
}