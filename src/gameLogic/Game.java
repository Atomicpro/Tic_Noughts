package gameLogic;

public class Game {
    private static boolean statusGame = true;
    private static char[][] gameField = {
            {'-','-','-'},
            {'-','-','-'},
            {'-','-','-'}
    };
    private static int count = 0;

    public static boolean getStatusGame(){
        return statusGame;
    }
    public static void resetGame(){
        char[][] gameField = {
                {'-','-','-'},
                {'-','-','-'},
                {'-','-','-'}
        };
        statusGame = true;
    }
    public static void showGameField(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(gameField[i][j]);
            }
            System.out.println();
        }
    }
    protected static boolean addChar(int line, int column,char playerChar){
        count++;
        if(gameField[line][column] == '-'){
            gameField[line][column] = playerChar;
        }
        else {
            return false;
        }
        if (count >= 5){
            checkWin(playerChar);
        }
        return true;
    }
    private static void checkWin(char playerChar){
        for (int i = 0; i < 3; i++){
            if (gameField[i][0] == playerChar && gameField[i][1] == playerChar && gameField[i][2] == playerChar){
                System.out.println(playerChar + " выйграл");
                statusGame = false;
                break;
            }
            else if (gameField[0][i] == playerChar && gameField[1][i] == playerChar && gameField[2][i] == playerChar){
                System.out.println(playerChar + " выйграл");
                statusGame = false;
                break;
            }
        }
        if (gameField[0][0] == playerChar && gameField[1][1] == playerChar && gameField[2][2] == playerChar){
            System.out.println(playerChar + " выйграл");
            statusGame = false;
        }
        else if (gameField[0][2] == playerChar && gameField[1][1] == playerChar && gameField[2][0] == playerChar){
            System.out.println(playerChar + " выйграл");
            statusGame = false;
        }
        else if (count > 9){
            System.out.println("Ничья");
            statusGame = false;
        }
    }
}
