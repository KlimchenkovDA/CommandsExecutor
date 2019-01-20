package app;

import app.commands.Command;
import app.commands.PrintDateCommand;
import app.commands.PrintIntCommand;
import app.commands.PrintStringCommand;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Application2 {
    public static void main(String[] args) {
        try {
            FileInputStream fstream = new FileInputStream("D:/1/file.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            strLine = br.readLine();
            while (strLine != null) {
                String[] SplitedString = strLine.split(" ");
                String commandName = SplitedString[0];
                String commandParam = SplitedString[1];

                Command cmd;
                switch (commandName) {
                    case "PrintInt":
                        int commandParamInt = Integer.parseInt(commandParam);
                        cmd = new PrintIntCommand(commandParamInt);
                        break;
                    case "PrintString":
                        cmd = new PrintStringCommand(commandParam);
                        break;
                    case "PrintDate":
                        if (commandParam.equals("now")) {
                    cmd = new PrintDateCommand(Calendar.getInstance().getTime());
                    }
                        else {
                            DateFormat format = new SimpleDateFormat("yyyyMMdd_hhmmss", Locale.ENGLISH);
                            Date date = format.parse(commandParam);
                            cmd = new PrintDateCommand(date);
                        }
                        break;
                    default:
                        throw new RuntimeException();
                }
                cmd.execute();
                strLine = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
