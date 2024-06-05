package day06.exercise;

import java.util.Scanner;

public class ExerDemo2 {
    public static void main(String[] args) {
        /*
        2. 综合练习一：

           - 需求:<<主持人大赛>>有N位评委给选手打分

           - 选手的最终得分为:去掉最高分和最低分之后的N-2位评委的平均分
           - 要求:使用方法实现
         */

        int peopleNum = 6;
        double[] scores = getScores(peopleNum);
        System.out.println("选手的最终得分为:" + getAvg(scores));

    }

    // 获取评委打分
    public static double[] getScores(int peopleNum) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[peopleNum];
        for (int i = 0; i < peopleNum; i++) {
            System.out.println("请输入第" + (i+1) + "位评委打分");
            scores[i] = sc.nextDouble();
        }
        return scores;
    }
    // 获取平均分
    public static double getAvg(double[] scores) {
        double total = 0.0;
        double maxScore = scores[0],minScore = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
            if (scores[i] < minScore) {
                minScore = scores[i];
            }
            total += scores[i];
        }
        return (total - maxScore - minScore) / (scores.length - 2);
    }

}
