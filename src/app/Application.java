package app;

import app.commands.PrintIntCommand;
import app.commands.PrintDateCommand;
import app.commands.PrintStringCommand;

import java.util.Calendar;

public class Application {
    public static void main(String[] args) {

        CommandExecutor executer = new CommandExecutor("Oleg");

        executer.add(new PrintIntCommand(100));
        executer.add(new PrintStringCommand("Hello!"));
        executer.add(new PrintDateCommand(Calendar.getInstance().getTime()));

        executer.executeAllCommands();

    }
}
