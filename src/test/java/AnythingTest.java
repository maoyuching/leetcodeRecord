import org.junit.Test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.IntStream;

public class AnythingTest {

    @Test
    public void t1() {
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

    @Test
    public void t2() {
        IntStream.range(1, 10).forEach(i -> {
            IntStream.range(1, i + 1)
                    .mapToObj(j -> j + "*" + i + "=" + j * i + (j*i >= 10? " ": "  "))
                    .forEach(System.out::print);
            System.out.println();
        });

    }
}
