import java.util.Scanner;

public class Launcher
{
    public static void main(String[] args)
    {
        System.out.println("Bienvenue !");
        var scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(!"quit".equalsIgnoreCase(input))
        {
            if("fibo".equalsIgnoreCase(input))
            {
                System.out.println("Tapez un nombre");
                int nb = scanner.nextInt();
                int fibonacci = Fibonacci.fibo(nb);
                System.out.println("F("+nb+") = " + fibonacci);
                input = scanner.nextLine();
            }
            else
            {
                System.out.println("Unknown Command");
            }
            input = scanner.nextLine();

        }
        scanner.close();
    }
}
