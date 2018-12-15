package app.commands;


import app.commands.Command;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PrintDateCommand implements Command {
    private Date date;

    public PrintDateCommand(Date date) {
        this.date=date;
    }

    public void execute() {
        String formattedDate = new SimpleDateFormat("yyyyMMdd_HHmmss").format(this.date);
        System.out.println(formattedDate);
    }
}
