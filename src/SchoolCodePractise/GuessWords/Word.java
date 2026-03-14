package SchoolCodePractise.GuessWords;

import java.util.ArrayList;
import java.util.List;

public class Word {
    private String secretWord;

    //大写单词
    public Word(String secretWord){
        this.secretWord=secretWord.toUpperCase();
    }
    public FeedBack CheckGuess(String guess){
        guess=guess.toUpperCase();
        List<LetterStatus> statuses =new ArrayList<>();
        for(int i=0;i<guess.length();i++){
            statuses.add(LetterStatus.Gray);
        }
        boolean[] secretUsed=new boolean[5];
        boolean[] guessUsed=new boolean[5];
        for(int i=0;i<5;i++){
            if(guess.charAt(i)==secretWord.charAt(i)){
                statuses.set(i,LetterStatus.Green);
                secretUsed[i]=true;
                guessUsed[i]=true;
            }
        }

        for(int i=0;i<5;i++){
            if(guessUsed[i])
                continue;
            char c=guess.charAt(i);
            for(int j=0;j<5;j++){
                if(!secretUsed[j]&&c==secretWord.charAt(j)){
                    statuses.set(i,LetterStatus.Yellow);
                    secretUsed[j]=true;
                    guessUsed[i]=true;
                    break;
                }
            }
        }
        return new FeedBack(statuses);
    }
}
