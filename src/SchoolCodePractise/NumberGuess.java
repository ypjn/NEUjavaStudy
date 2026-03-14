package SchoolCodePractise;
import java.util.Random;
import java.util.Scanner;
/**
 * 猜数字             实现
 * 猜数字范围         实现
 * 猜数字次数(难度)   实现
 * 排行榜              拉倒
 * 多人模式（接力，比赛）    拉倒
 * 加情景，猜中数字获得机会pve   拉倒
 *每次游戏结束循环
 * 显示最高分
 * 😊(●'◡'●)✅
 */
public class NumberGuess {
    public static class GameConfig {
        int number;
        int cycleNumber;
        int endingNumber;
        int difficulty;
    }
    
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    public static GameConfig selectDifficulty(Scanner sc) {
        Random r = new Random();
        System.out.println("Welcome to the Number Guess Game !\uD83D\uDE0A");
        System.out.println("Choose a difficulty level:");
        System.out.println("1. Easy");
        System.out.println("2. Normal");
        System.out.println("3. Medium");
        System.out.println("4. Hard");
        System.out.println("5. Nightmare");
        System.out.println("Please enter a number to select difficulty");
        int difficulty = sc.nextInt();
        int number = 0;
        Boolean isValidInput = false;
        while (!isValidInput) {
            switch (difficulty) {
                case 1:
                    number = r.nextInt(1, 30);
                    isValidInput = true;
                    break;
                case 2:
                    number = r.nextInt(1, 50);
                    isValidInput = true;
                    break;
                case 3:
                    number = r.nextInt(1, 100);
                    isValidInput = true;
                    break;
                case 4:
                    number = r.nextInt(1, 200);
                    isValidInput = true;
                    break;
                case 5:
                    number = r.nextInt(1, 500);
                    isValidInput = true;
                    break;
                default:
                    System.out.println("Invalid input.");
                    System.out.println("Please enter a number between 1 and 5 to select difficulty");
                    difficulty = sc.nextInt();
            }
        }
        
        int cycleNumber = 0;
        int endingNumber = 0;
        if (difficulty == 1) {
            cycleNumber = 5;
            endingNumber = 30;
        } else if (difficulty == 2) {
            cycleNumber = 5;
            endingNumber = 50;
        } else if (difficulty == 3) {
            cycleNumber = 5;
            endingNumber = 100;
        } else if (difficulty == 4) {
            cycleNumber = 7;
            endingNumber = 200;
        } else if(difficulty == 5){
            cycleNumber = 9;
            endingNumber = 500;
        }
        
        GameConfig config = new GameConfig();
        config.number = number;
        config.cycleNumber = cycleNumber;
        config.endingNumber = endingNumber;
        config.difficulty = difficulty;
        return config;
    }
    
    public static int playGame(Scanner sc, int number, int cycleNumber, int endingNumber, int difficulty) {
        int finalScore = 0;
        for (int i = 0; i < cycleNumber; i++) {
            System.out.println("Guess a number between 1 to " + endingNumber);
            int guess = sc.nextInt();
            if (guess == number) {
                System.out.println("Congratulations! You guessed the number.");
                int scores = cycleNumber - i;
                finalScore = difficulty * scores;
                break;
            } else if (guess < number) {
                System.out.println("Your guess is too low.");
            } else if (guess > number) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Invalid input.");
                i--;
            }
            if(i == cycleNumber-1){
                System.out.println("Sorry, you ran out of attempts.");
                System.out.println("You can't get a score this round");
                System.out.println("The target number is"+ number);
                break;
            }
        }
        return finalScore;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;
        int highestScore = 0;
        int gameRound = 0;
        
        while (playAgain) {
            gameRound++;
            GameConfig config = selectDifficulty(sc);
            
            int finalScore = playGame(sc, config.number, config.cycleNumber, config.endingNumber, config.difficulty);

            System.out.println("Game Over!");
            System.out.println("Your final score is " + finalScore);
            
            if (finalScore > highestScore) {
                highestScore = finalScore;
                System.out.println("New Highest Score!");
            }
            
            if (gameRound > 1) {
                System.out.println();
                System.out.println("=== Highest Score: " + highestScore + " ===");
            }
            
            System.out.println("Do you want to play again?");
            System.out.println("Enter 1 to start a new game, or any other key to exit:");
            int choice = sc.nextInt();
            
            if (choice == 1) {
                clearScreen();
                playAgain = true;
            } else {
                playAgain = false;
                System.out.println("Thanks for playing! Goodbye.");
            }
        }
        sc.close();
    }
}
//额，平衡性调整没做好，简单，一般，中等难度其实没差太多
//后面两个几乎纯看命
//不太想去调了

