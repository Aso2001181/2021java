import java.util.*;
public class Main {
    public static void main(String[] args){
        System.out.println("戦艦ゲーム");
        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        Ship ship3 = new Ship();
        int count = 3;
        int turn = 1;
        int[][] area = new int[5][5];
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int s4 = 0;
        int s5 = 0;
        int s6 = 0;
        
        for(int i=0;i<area.length;i++){
            for(int j=0;j<area.length;j++){
                area[i][j]=0;
            }
        }

        s1 = ship1.map();
        s2 = ship1.map();
        area[s1][s2] = 1;
        s3 = ship2.map();
        s4 = ship2.map();
        area[s1][s2] = 2;
        s5 = ship3.map();
        s6 = ship3.map();
        area[s5][s6] = 3;

        while(count != 0 && turn<10){
            System.out.printf("%sターン目\n",turn++);
            System.out.println("爆弾のX座標を指定してください");
            int x = new java.util.Scanner(System.in).nextInt();
            System.out.println("爆弾のY座標を指定してください");
            int y = new java.util.Scanner(System.in).nextInt();
            if(area[x][y] == 1){
                ship1.damage();
                ship1.init1();
            }else if(area[x][y] == 2){
                ship2.damage();
                ship2.init1();
            }else if(area[x][y] == 3){
                ship3.damage();
                ship3.init1();
            }else if(area[x-1][y] != 0){
                ship1.init2();
            }else if(area[x+1][y] != 0){
                ship1.init2();
            }else if(area[x][y-1] != 0){
                ship1.init2();
            }else if(area[x][y+1] != 0){
                ship1.init2();
            }else{
                ship1.init3();
            }
        }
    }
}
