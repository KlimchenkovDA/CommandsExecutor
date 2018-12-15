package app.commands;

import app.commands.Command;

public class Print100Command implements Command {
    public void execute() {
        System.out.println("100");
    }
}
