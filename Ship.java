import java.util.*;
public class Ship {
    public int hp = 3;
    public int map(){
        Random random = new Random();
        int ran = random.nextInt(5);
        return ran;
    }
    public void damage(){
        hp = hp-1;
    }
    public void init1(){
        if(this.hp != 0){
            System.out.print("命中だがまだ沈まない移動します。");
        }else{
            System.out.print("命中し、撃沈しました");
        }
    }
    public void init2(){
        System.out.println("波高し！");
    }
    public void init3(){
        System.out.println("はずれ");
    }
}
