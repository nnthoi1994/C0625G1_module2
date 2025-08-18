package ss11_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập số cần chuyển sang nhị phân");
        int num = Integer.parseInt(sc.nextLine());
        while (num>0){
            stack.push(num%2);
            num/=2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
