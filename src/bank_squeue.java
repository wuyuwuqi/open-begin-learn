import java.util.ArrayDeque;
import java.util.Scanner;

public class bank_squeue
{
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            ArrayDeque<Integer> q1=new ArrayDeque<Integer>();
            ArrayDeque<Integer> q2=new ArrayDeque<Integer>();
            System.out.println("输入顾客编号个数\n");
            int n=scan.nextInt();
            while(n-->0){
                int num=scan.nextInt();
                if(num%2==1)  q1.offer(num);
                else q2.offer(num);
            }
            System.out.println("输出顾客处理序列\n");
            while(!q1.isEmpty()){
                int cnt=2,k=0;
                while(cnt-->0 && !q1.isEmpty()){
                    if(k++>0) System.out.print(" ");
                    System.out.print(q1.poll());
                }
                if(!q2.isEmpty()){
                    System.out.print(" "+q2.poll());
                }
                if(!q2.isEmpty()||!q1.isEmpty()) System.out.print(" ");//只有队列q1或者q2不空时再加空格
            }
            int k=0;
            while(!q2.isEmpty()){
                if(k++>0) System.out.print(" ");
                System.out.print(q2.poll());
            }
        }
}
