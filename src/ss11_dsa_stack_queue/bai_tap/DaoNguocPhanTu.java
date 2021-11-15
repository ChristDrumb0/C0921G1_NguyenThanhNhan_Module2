package ss11_dsa_stack_queue.bai_tap;

import java.util.Stack;

public class DaoNguocPhanTu {

    public static void main(String[] args) {
        int [] integers = {1,2,3,4};
        String character = "It's an Assigment";
        System.out.print("integer before: ");
        for (int i:integers){
            System.out.print(i);
        }
        System.out.print("\n");

        reverseInter(integers);
        System.out.print("\n");
        System.out.println("------------------");
        System.out.println("String before: " + character);
        reverseString(character);

    }

    private static void reverseInter(int[] inter) {
        Stack<Integer> interStack = new Stack<>();
        for (int i = 0; i < inter.length; i++) {
            interStack.push(inter[i]);
        }

//        for (int i = 0; i < inter.length; i++) {
//            inter[i]=interStack.pop();
//        }

        System.out.print("reverse Integer: ");
        while (!interStack.isEmpty()){
            System.out.print(interStack.pop());
        }
//        for (int j:inter){
//            System.out.print(j);
//        }
//        System.out.print("\n");
    }
    private static void reverseString(String chars){

        char [] char1 = new char[chars.length()];
        Stack<Character> reverseChars = new Stack<>();
        for (int i = 0; i < chars.length(); i++) {
            reverseChars.push(chars.charAt(i));
        }
        for (int i = 0; i < char1.length; i++) {
            char1[i] = reverseChars.pop();
        }

        new String(char1);
        System.out.print("reverse String: ");
        System.out.println(char1);
    }
}
