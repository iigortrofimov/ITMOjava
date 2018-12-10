package patterns.comand;

import java.util.Scanner;

public class TextProcessor {
    private CommandsHistory history = new CommandsHistory();

    public void executeCommand(Command command){
        if(command.execute()){
            history.add(command);
        }

    }

    public void start(){
        Scanner in =new Scanner(System.in);
        while (true){
            if(in.nextLine().equals("process"));
        }
    }
}
