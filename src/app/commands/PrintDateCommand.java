package app.commands;


import app.commands.Command;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PrintDateCommand implements Command {
    public void execute() {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);
    }
}
