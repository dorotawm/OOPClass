import java.util.ArrayList;

public final class Shiritori {
    ArrayList<String> words;
    private boolean gameOver;

    public Shiritori() {
        this.words = new ArrayList<>();
        this.gameOver = false;
    }

    public void play(String word) throws GameOverException {
        if (this.gameOver) {
            throw new GameOverException();
        }

        boolean isValid;
        if (this.words.isEmpty()) {
            isValid = true;
        } else {
            String lastWordOnList = this.words.get(this.words.size() - 1);
            String lastLetter = lastWordOnList.substring(lastWordOnList.length() - 1);
            isValid = !this.words.contains(word) && word.startsWith(lastLetter);
        }

        if (isValid) {
            this.words.add(word);
            printWords();
        } else {
            this.gameOver = true;
            throw new GameOverException();
        }
    }

    public void restart() {
        this.words = new ArrayList<>();
        this.gameOver = false;
        System.out.println("Game restarted");
    }

    public void printWords() {
        System.out.println(this.words.toString());
    }
}
