package Command;

public class CommandDemo {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remote = new RemoteControl();

        // Turn on the light
        Command turnOnCommand = new TurnOnCommand(light);
        remote.setCommand(turnOnCommand);
        remote.pressButton();

        // Turn off the light
        Command turnOffCommand = new TurnOffCommand(light);
        remote.setCommand(turnOffCommand);
        remote.pressButton();

        // Undo the last command
        remote.undoCommand();
    }
}
