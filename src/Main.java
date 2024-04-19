import gameLogic.Game;
import gameLogic.Player;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        Player player1 = new Player('x');
        Player player2 = new Player('o');
        System.out.println("Привет, давай сыграем в крестики нолики!\n");
        Game.showGameField();
        while (Game.getStatusGame()){
            System.out.println(player1.getPlayerChar() + " твой ход\n(Укажи 2 числа. 1 - число номер линии, 2 - число номер колонки)");
            while (!player1.drow((byte) userInput.nextByte() - 1, userInput.nextByte() - 1)){
                System.out.println("Вы введил некоректные данные\nПовторите ввод");
            }
            Game.showGameField();
            if (!Game.getStatusGame()){
                break;
            }
            System.out.println(player2.getPlayerChar() + " твой ход\n(Укажи 2 числа. 1 - число номер линии, 2 - число номер колонки)");
            while (!player2.drow(userInput.nextInt() -1, userInput.nextInt() -1)){
                System.out.println("Вы введил некоректные данные\nПовторите ввод");
            }
            Game.showGameField();
        }
    }
}