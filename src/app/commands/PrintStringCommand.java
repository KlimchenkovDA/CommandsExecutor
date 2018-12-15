package app.commands;

import app.commands.Command;


public class PrintStringCommand implements Command {

    private String str;

    public PrintStringCommand(String s) {
        this.str = s;
    }

    public void execute() {

        System.out.println(this.str);
    }
}
