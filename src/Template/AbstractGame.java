package Template;

public abstract class AbstractGame {
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    abstract  void initialize();

    abstract void startPlay();

    abstract void endPlay();

}
