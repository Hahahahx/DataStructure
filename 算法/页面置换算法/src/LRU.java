import java.util.ArrayList;

public class LRU {
    ArrayList<Integer> zan = new ArrayList<Integer>();

    int Neichun;
    int num = 0;

    public LRU() {
    }

    public LRU(int neichun) {
        this.Neichun = neichun;
    }

    public void ZhiHuan(int n[]) {
        for (int i = 0;i<Neichun;i ++){
            zan.add(n[i]);
            for (int j :zan) {
                System.out.print(j+"   ");
            }
            System.out.print("X   ");
            System.out.println(n[i+1]);
            num++;
        }


        for (int p = num;p<n.length;p++) {
            boolean flag = true;
            for (int i :zan) {
                if(i == n[p]) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                ArrayList<Integer> zan2 = new ArrayList<Integer>(zan);
                a:for (int i = p -1; i >= 0; i--) {
                    for (int j = 0 ; j<zan2.size();j++ ) {
                        if (zan2.size() == 1) break a;
                        if (n[i]== zan2.get(j)) zan2.remove(j);
                    }
                }
                for (int j = 0; j < zan.size(); j++) {
                    if (zan.get(j) == zan2.get(0)) {
                        zan.set(j, n[p]);
                        break;
                    }
                }

                for (int j : zan) {
                    System.out.print(j + "   ");
                }
                System.out.print("X   ");
                if(p+1 != n.length) System.out.println(n[p + 1]);
                num++;
            }else{
                for (int j : zan) {
                    System.out.print(j + "   ");
                }
                System.out.print("    ");
                if(p+1 != n.length) System.out.println(n[p + 1]);

            }
        }
    }
}