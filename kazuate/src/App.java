import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int my_num = 50;
        int user_num;
        Scanner input = new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            //入力　
            while(true){
                try{
                    System.out.println("2桁の自然数を入力してください．");
                    user_num = input.nextInt();

                    //2桁の整数かどうか判定
                    if(user_num > 9 && user_num <100){
                        break;
                    }else{
                        continue;
                    }
                }catch(InputMismatchException e){
                    System.out.println("この入力は無効です．");
                    input.next();
                }
            }            

            //20以上差があるか判定，当たり判定
            if(Math.abs(user_num - my_num) >= 20){
                System.out.println("入力した数字は20以上の誤差があります．");
            }else if(user_num == my_num){
                System.out.println("当たりです．");
                input.close();
                return;
            }
            
            System.out.println("残りチャレンジ回数：" + (4-i) + "回");
        }

        input.close();
    }
}
