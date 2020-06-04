package Java队列;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 高并发业务操作：同时处理多个用户的请求(抢购系统)
 *      问题：后端程序不能及时的处理所有用户的请求
 *      缓冲操作：将所有用户的请求排队存放(有序存放)，让后台系统逐个处理
 *      解决：使用队列存储所有用户请求
 * 
 * 可以使用集合处理（线程安全的集合），但是取完还需要执行删除操作，代码量增加
 * 而队列操作本身就是线程安全的且保证效率
 */
public class QueueTest{
    public static void main(String[] args){
        // 声明一个队列：存储3个数据
        // ArrayBlockingQueue 数组实现的队列所以性能上还是会存在一些问题
        Queue<String> msg = new ArrayBlockingQueue<String>(3);
        msg.add("集合");   // 队列未满时可以增加数据，但其是Collections集合的方法
        msg.offer("队列");  // 队列方法，增加数据，入队操作
        msg.element();  // 查询队首位置（前置计数器）的数据，不执行删除
        msg.poll();     // 查询并出队
        msg.size();     // 查询所有数据总数，也是Collections的方法
    }
}