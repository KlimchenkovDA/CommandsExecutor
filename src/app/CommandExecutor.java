package app;

import app.commands.Command;

import java.util.ArrayList;

public class CommandExecutor {
    private ArrayList<Command> list = new ArrayList<Command>();
    private String name;

    public CommandExecutor(String _name) {
        this.name = _name;
    }

    public void executeAllCommands() {
        System.out.println(this.name + ": executing all commands...");
        for (int i = 0; i < this.list.size(); i++) {
            this.list.get(i).execute();
        }
        System.out.println(this.name + ": commands have been executed...");
    }

    public void add(Command s) {
        System.out.println(this.name + ": add new command");
        this.list.add(s);
    }
}
