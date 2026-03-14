package SchoolCodePractise.GuessWords;

import java.util.Scanner;

public class Game {
    private Word secretWord;
    private String secretString;//记录该单词
    private int maxAttempts;
    private int attempts;

    public Game(String secretWord,int maxAttempts){
        this.secretWord=new Word(secretWord);
        this.maxAttempts=maxAttempts;
        this.attempts=0;
        this.secretString=secretWord;
    }
    public void start(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Guess Word Game !😊");
        System.out.println("你有"+maxAttempts+"次机会猜测一个5字母单词，请输入你的猜测：");
        while(attempts<maxAttempts){
            System.out.println("第"+(attempts+1)+"次尝试：");
            String guess=sc.nextLine().trim();

            if(guess.length()!=5){
                System.out.println("输入无效！请输入5个字母的单词。");
                continue;
            }
            if(!guess.matches("[a-zA-Z]+")){
                System.out.println("输入无效！请输入字母！");
                continue;
            }
            FeedBack feedback = this.secretWord.CheckGuess(guess);
            System.out.println("反馈：" + feedback);
            attempts++;

            if(feedback.isAllCorrect()){
                System.out.println("恭喜你，猜对了！🎉");
                System.out.println("答案就是："+guess);
                sc.close();
                return;
            }
        }
        System.out.println("很遗憾，你没猜中。");
        System.out.println("答案是："+secretWord);
        sc.close();
    }

}
