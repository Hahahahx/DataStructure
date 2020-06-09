public class main {
    public static  void main(String[] args){
        int n[] = new int []{7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0,1,1,7,0,1};
        FiFo FIFO = new FiFo(3);
        FIFO.Zhihuan(n);
        System.out.println("\n\n置换次数为："+FIFO.num);

//        Opt OPT  = new Opt(3);
//        OPT.ZhiHuan(n);
//        System.out.println("\n\n置换次数为："+OPT.num);

       /* LRU lru = new LRU(3);
        lru.ZhiHuan(n);
        System.out.println("\n\n置换次数为："+lru.num);*/
    }
}
