package threadlocal;

import lombok.Data;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Data
public class TestA {
    // thread local 是一个变量 的包装，通过get set 设置 值，
    // 不同线程get 到的都是不同的 变量
    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        stack.push('a');
        stack.push('b');
        stack.push('c');

//        for (int i = 0; i < 10; i++) {
//            e.execute(()->{
//                threadLocal.set("suck  " + Thread.currentThread());
//                System.out.println(threadLocal.get());
//            });
//        }
    }


    public static String decodeString(String s) {
        if (s.length() == 0) return "";

        int times = Integer.valueOf(s.substring(0,1)) ;

        int b = s.indexOf("[");
        int e = s.indexOf("]");
        String word = s.substring(b+1, e);

        for (int i = 1; i < times; i++) {
            word += word;
        }

        if (e == s.length() - 1) return word;
        return word + decodeString(s.substring(e+1, s.length()));
    }

}
