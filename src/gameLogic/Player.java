package gameLogic;

public class Player {
    protected char playerChar;

    public char getPlayerChar(){
        return playerChar;
    }
    public Player(char playerChar){
        this.playerChar = playerChar;
    }
    public boolean drow(int line, int column){
        return Game.addChar(line, column, playerChar);
    }
}
