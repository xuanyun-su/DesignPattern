package Template;

public class ChessGame extends AbstractGame{
    @Override
    void initialize() {
        System.out.println("Chess Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Chess Game Started. Make your move.");
    }

    @Override
    void endPlay() {
        System.out.println("Chess Game Finished!");
    }
}
