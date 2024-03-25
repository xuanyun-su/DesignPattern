package Template;

public class TemplateDemo {
    public static void main(String[] args) {
        AbstractGame chessGame = new ChessGame();
        chessGame.play();

        System.out.println();

        AbstractGame footballGame = new FootballGame();
        footballGame.play();
    }
}
