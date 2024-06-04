package day05.exercise;

public class ExerByMyself {
    public static void main(String[] args) {
        /**
         * 小芳的妈妈每天给她2.5元钱，她都会存起来，
         * 但是，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，
         * 请问，经过多少天，小芳才可以存到100元钱。
         * 思路：
         * 使用while循环
         */
        double money = 2.5;
        int day=1;
        while(money<100){
            System.out.print("第"+day + "天存了" + money + "元，" + "\n");
            money+=2.5;
            day++;
            if(day%5==0){
                money-=6;
            }
        }
        System.out.println("经过"+day+"天，小芳可以存到100元钱");
    }
}
