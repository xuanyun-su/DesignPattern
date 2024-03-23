package Command;

public class TurnOffCommand implements  Command{
    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnoff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
