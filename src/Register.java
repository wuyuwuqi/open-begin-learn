import java.util.Scanner;

/**
 * @author WangYH
 * @version 2021.1.3
 * @date 2023/3/6 23:37
 */

public class Register {
    /**
     * 实现用户输入用户名和密码，并确认密码，完成注册
     */

    public static void main(String[] args) {
        System.out.println("【流浪猫】》》用户注册");
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String uName = input.nextLine();
        while (true){
            System.out.println("请输入密码：");
            String pwd1 = input.nextLine();
            System.out.println("请确认密码:");
            String pwd2 = input.nextLine();
            if(pwd1.equals(pwd2)){
                System.out.println("【" + uName + "】"  + "注册成功，感谢你的使用，请牢记你的密码！");
                break;
            }else {
                System.out.println("两次密码输入不一致，请重试！");
            }
        }

    }
}
