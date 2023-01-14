import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shiritori game = new Shiritori();
        String commandsList = """
                'play <WORD>' - insert a new word to the game
                'print' - get a list of words in the current game
                'restart' - start a new game
                'quit' - quit
                'help' - wiev this list""";
        System.out.println("Welcome to the Shiritori game! Please use commands: \n" + commandsList);
        Scanner input = new Scanner(System.in);
        while (true) {
            String line = input.nextLine();
            if ("quit".equals(line)) {
                break;
            } else if ("help".equals(line)) {
                System.out.println(commandsList);
            } else if ("print".equals(line)) {
                game.printWords();
            } else if ("restart".equals(line)) {
                game.restart();
            } else if (line.startsWith("play") && line.length() > 5) {
                try {
                    game.play(line.substring(5));
                } catch (GameOverException ex) {
                    System.out.println("Game over. Please restart to play again.");
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}