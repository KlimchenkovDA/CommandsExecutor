package app;

import app.commands.Print100Command;
import app.commands.PrintDateCommand;
import app.commands.PrintHelloCommand;

public class Application {
    public static void main(String[] args) {

        CommandExecutor executer = new CommandExecutor("Oleg");

        executer.add(new Print100Command());
        executer.add(new PrintHelloCommand());
        executer.add(new PrintDateCommand());

        executer.executeAllCommands();

    }
}
