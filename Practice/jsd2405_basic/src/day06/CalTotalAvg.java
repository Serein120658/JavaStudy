package day06;

import java.util.Scanner;
import java.util.Arrays;

/**
 * 评委打分练习
 * 需求:<<主持人大赛>>有N位评委给选手打分
 * 选手的最终得分为:去掉最高分和最低分之后的N-2位评委的平均分要求:使用方法实现
 */
public class CalTotalAvg {
    public static void main(String[] args) {
        // 1.定义一个方法,接收评委打分数组,返回平均分
        int people = 5;
        //  double[] scores = getScores(people);
        //  // 声明方法计算平均分
        //  double avg = getAvg(scores);
        //  System.out.println("选手的平均得分为:"+avg);

        // 全部简写
        System.out.println("选手的平均分为:" + getAvg(getScores(people)));


    }

    public static double[] getScores(int people) {
        // 声明数组存储评委输入的分数
        double[] scores = new double[people];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入"+people+"位评委的打分:");
        for(int i = 0; i<scores.length; i++){
            scores[i] = sc.nextDouble();

        }
        return scores;
    }
    // 计算平均分
    public static double getAvg(double[] scores) {
        // 使用系统自带的排序
        Arrays.sort(scores);
        // 计算平均分
        double scoresSum = 0;
        for(int i = 1; i<scores.length-1; i++){
            scoresSum += scores[i];
        }

        return scoresSum/(scores.length-2);
   }
}
