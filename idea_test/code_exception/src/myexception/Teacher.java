package myexception;

public class Teacher {
    public void checkScore(int score) throws ScoreException{
        if(score<0 || score>100){
            throw new ScoreException("你输入的分数有误，分数范围应在0-100之间");
        }else{
            System.out.println("分数正常");
        }
    }
}
