import java.util.ArrayList;

public class FiFo {
    ArrayList<Integer> zan= new ArrayList<Integer>(); ;
    int Neichun;
    int num;

    public FiFo(){}
    public FiFo(int neichun){
        this.Neichun = neichun;
    }

    public void Zhihuan(int n[]){
        for (int i = 0;i<Neichun;i ++){
            zan.add(n[i]);
            for (int j :zan
                 ) {
                System.out.print(j+"   ");
            }
            System.out.print("X   ");
            System.out.println(n[i+1]);
            num++;
        }

        for(int i = num;i<n.length ;i++){
            boolean Flag = false;
            for (int j :zan
                 ) {
                if (j == n[i])  Flag = true;
            }

            if (Flag){
                for (int j :zan
                        ) {
                    System.out.print(j+"   ");
                }
                System.out.print("    ");
                if(i+1 != n.length) System.out.println(n[i+1]);
            }else{
                zan.remove(0);
                zan.add(n[i]);
                for (int j :zan
                        ) {
                    System.out.print(j+"   ");
                }
                System.out.print("X   ");
                if (i+1!=n.length) System.out.println(n[i+1]);
                num++;
            }
        }
    }

}
