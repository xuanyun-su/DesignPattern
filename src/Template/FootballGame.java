package Template;

public class FootballGame extends AbstractGame{
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Get ready to play.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the match!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
