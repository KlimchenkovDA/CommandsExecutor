package app.commands;

import app.commands.Command;

public class PrintHelloCommand implements Command {
    public void execute() {
        System.out.println("Hello");
    }
}
