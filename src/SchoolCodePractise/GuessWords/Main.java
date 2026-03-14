package SchoolCodePractise.GuessWords;
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args){
        List<String> words=loadWordsFromFile("words.txt");
        if(words.isEmpty()){
            System.out.println("没有单词！请检查words.txt文件是否正确！");
            System.out.println("即将使用默认列表");
            words=Arrays.asList("APPLE", "BRAIN", "HOUSE", "MOUSE", "PLANE");
        }
        Random r=new Random();
        String secretWord=words.get(r.nextInt(words.size()));
        int maxAttempts=6;
        Game game=new Game(secretWord,maxAttempts);
        game.start();
    }
    private static List<String> loadWordsFromFile(String fileName){
        List<String> words=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader(fileName))){
            String line;
            while((line=br.readLine())!=null){
                line=line.trim().toUpperCase();
                if(line.length()==5&&line.matches("[A-Z]+")){
                    words.add(line);
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("错误：文件"+fileName+"未找到");

        }catch(IOException e){
            System.out.println("错误：读取文件"+fileName+"时出错");
            e.printStackTrace();

            }
        return words;

    }
}
