package SchoolCodePractise.GuessWords;

import java.util.List;

public class FeedBack {
    private List<LetterStatus> statuses;
    public FeedBack(List<LetterStatus> statuses){
        this.statuses = statuses;
    }

    public Boolean isAllCorrect(){
        for(LetterStatus status:statuses){
            if(status != LetterStatus.Green){
                return false;
            }
        }
        return true;
    }
    //判断游戏胜利
    public List<LetterStatus> getStatuses(){
        return statuses;
    }
    //因为statuses是private的，所以不能直接访问
    //获取状态来输出正确与否

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(LetterStatus status:statuses){
            switch(status){
                case Green:
                    sb.append("✅");
                    break;
                case Yellow:
                    sb.append("🟨");
                    break;
                case Gray:
                    sb.append("❌");
                    break;
            }
        }
        return sb.toString();
    }
}
