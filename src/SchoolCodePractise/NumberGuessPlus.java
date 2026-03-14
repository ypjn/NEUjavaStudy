package SchoolCodePractise;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessPlus {
    /*public static class GameConfig{
        int number;
        int cycleNumber;
        int endingNumber;
        int difficult;
    }*/
    
    public static void clearScreen(){
        for(int i=0;i<25;i++){
            System.out.println();
        }
    }
    
    public static int compare(int a,int b){
        if(a>b){
            return 1;
        }else if(a<b){
            return -1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args){
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Welcome to the Number Guess Game !😊");
        System.out.println("Input a number between 100 and 999");
        
        int targetNumber = r.nextInt(100, 1000);
        int[] target = new int[3];
        for(int i=0;i<3;i++){
            target[2-i]=targetNumber%10;
            targetNumber/=10;
        }
        
        int cycleNumber=5;
        boolean gameWin = false;
        
        for(int i=0;i<cycleNumber;i++) {
            System.out.print("\n第 " + (i+1) + " 次猜测，请输入你的猜测：");
            String num = sc.next();
            
            if(num.length() != 3 || !num.matches("\\d{3}")) {
                System.out.println("输入无效！请输入 3 位数字。");
                i--;
                continue;
            }
            
            int flag=0;
            for (int j = 0; j < 3; j++) {
                int compareResult = compare(target[j], num.charAt(j) - '0');
                if (compareResult == 1) {
                    System.out.print("L");
                } else if (compareResult == -1) {
                    System.out.print("H");
                } else {
                    System.out.print("✅");
                    flag++;
                }
            }
            
            if (flag == 3) {
                System.out.println("\n恭喜你，猜对了！🎉");
                gameWin = true;
                break;
            }
            
            System.out.println("\n继续猜测...");
        }
        
        if (!gameWin) {
            System.out.println("\n游戏结束！正确答案是：" + 
                (target[0] * 100 + target[1] * 10 + target[2]));
        }
        
        sc.close();
    }
}
