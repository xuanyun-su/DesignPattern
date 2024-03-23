package Command;


//调用者
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }

    public void undoCommand(){
        command.undo();
    }

}
