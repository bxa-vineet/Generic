package Generic;
import java.util.*;
public class Ques1 {
    public static  void main(String[] args) {
        Generic.Ques1.Box<Integer> b = new Generic.Ques1.Box<>();
        b.set(10);
        System.out.println(b.get());
        Generic.Ques1.Box<String> b1 = new Generic.Ques1.Box<String>();
        b1.set("Vineet");
        System.out.println( b1.get());
        Integer[] a = {1,3,4};
        String [] s = {"java","Spring"};
        printArray(a);
        printArray(s);

        Generic.Ques1.Calculator<Integer> c1 = new Generic.Ques1.Calculator<>(10, 20);
        Generic.Ques1.Calculator<Double> c2 = new Generic.Ques1.Calculator<>(2.5, 3.5);
        System.out.println( c1.sum());
        System.out.println( c2.sum());
        List<Integer> li = List.of(1,2,3);
        List<Double> ld = List.of(1.5,2.5);
        printNumbers(li);
        printNumbers(ld);
    }
    public static class Box<T>{
        T val;
        public void set(T val){
            this.val = val;
        }
        public T get(){
            return val;
        }
    }
    public static <T> void  printArray(T[] arr){
        for(T ele : arr){
            System.out.println(ele);
        }
    }
    public static void printNumbers(List< ? extends Number> list)
    {
        for(Number a : list){
            System.out.println(a);

        }
    }

    public static  class Calculator<T extends Number>{
        T a;
        T b;
        Calculator(T a, T b){
            this.a = a;
            this.b = b;
        }
        public double sum() {
            return a.doubleValue() + b.doubleValue();
        }
    }
}

