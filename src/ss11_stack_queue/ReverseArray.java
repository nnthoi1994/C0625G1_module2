package ss11_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Stack<Character> wStack = new Stack<>();
        System.out.println("Nhập chuỗi cần đảo ngược");
        Scanner sc = new Scanner(System.in);
        String mWord = sc.nextLine();
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.charAt(i));
        }
        while (!wStack.empty()){
            System.out.print(wStack.pop());
        }

    }
}
