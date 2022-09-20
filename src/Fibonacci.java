public class Fibonacci
{
    public static int fibo(int nb)
    {
        if (nb <= 1)
        {
            return nb;
        }
        return fibo(nb - 1) + fibo(nb - 2);
    }

}
