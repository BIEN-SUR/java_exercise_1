import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Launcher
{
    public static void main(String[] args)
    {
        List <Command> commands = new ArrayList <>();
        Scanner scanner = new Scanner(System.in);
        commands.add(new Quit());
        commands.add(new Fibo());
        commands.add(new Freq());
        commands.add(new Preditct());
        System.out.println("Bienvenue !");
        
        
        while(true)
        {
            String input = scanner.nextLine();
            boolean result = false, check = true;
            for(Command command : commands)
            {
                if(command.name().equalsIgnoreCase(input))
                {
                    result = command.run(scanner);
                    check = false;
                    break;
                }
            }

            if(result)
            {
                break;
            }

            if(check)
            {
                System.out.println("Unknown command");
            }
        }
        

    }
}
