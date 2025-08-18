package ss11_stack_queue;




import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra");
        String string = sc.nextLine();
        Boolean flag = true;
        string.toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
            queue.add(string.charAt(i));
        }
        while(!stack.isEmpty()){
            if(!stack.pop().equals(queue.poll())){
               flag = false;
               break;
            }
        }
        System.out.println(flag?"Day la chuoi palindrome":"Day khong la chuoi palindrome");
    }

}
