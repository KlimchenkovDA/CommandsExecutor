package app.commands;

import app.commands.Command;

public class PrintIntCommand implements Command {

    private Integer val;

    public PrintIntCommand(Integer value) {
        this.val = value;
    }

    public void execute() {

        System.out.println(this.val);
    }
}
