package Command;

// 抽象命令
public interface Command {
    void execute();
    void undo();
}
