import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
//        for(int i = 1; i<= 9; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print(j + "*" + i + "=" + j * i + " ");
//            }
//            System.out.println();
//        }

        Scanner sc = getScanner();
        

    }

    static Scanner getScanner() {
        return new Scanner(System.in);
    }

    static void setSlot(int[] slot, List<List<Integer>> round) {
        for (int i = 0; i < round.size(); i++) {
            int left = round.get(i).get(0);
            int right = round.get(i).get(1);
            for (int j = left; j <= right; j++) {
                slot[j] = i;
            }
        }
    }

    static int computePwd(int[] slot) {
        int sum = 0;
        for (int i = 0; i < slot.length; i++) {
            sum += slot[i] * i;
        }
        return sum % 100000009;
    }

    static void p2() {
        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();
        while (sc.hasNext() ) {
            String line = sc.nextLine();
            if ("-1".equals(line)) {
                break;
            }
            stack.push(line);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }

    }
}