package Java链表;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedTest {
    public static void main(String[] args) {
        // 数组实现
        List<String> array = new ArrayList<>();
        // 链表实现
        List<String> linked = new LinkedList<>();

        // 新增数据
        long start = System.nanoTime();
        for(int i =0 ;i<100000;i++){
            array.add(i+"");
        }   
        long end = System.nanoTime();
        System.out.println("array:"+(end-start));     

        start = System.nanoTime();
        for(int i =0 ;i<100000;i++){
            linked.add(i+"");
        }   
        end = System.nanoTime();
        System.out.println("linked:"+(end-start));   

        //查询
        start = System.nanoTime();
        array.get(1000);
        end = System.nanoTime();
        System.out.println("array:"+(end-start));   
        start = System.nanoTime();
        linked.get(1000);
        end = System.nanoTime();
        System.out.println("linked:"+(end-start));    

    }
}
