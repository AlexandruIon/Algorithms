package main.java.c1;

public class MainClass {

    public static void main(String[] args) {
        String[] vars = {"alex", "ion"};

        Bag<String> bag1 = new Bag<>(vars);

        for (String b : bag1) {
            System.out.println(b);
        }



        Double [] asd={1d,2d,3d,4d,5d};
        Bag<Double> numbers = new Bag<Double>(asd);
        int N = numbers.size();
        double sum = 0.0;
        for (double x : numbers)
            sum += x;
        double mean = sum/N;
        sum = 0.0;
        for (double x : numbers)
            sum += (x - mean)*(x - mean);
        double std = Math.sqrt(sum/(N-1));

        System.out.printf("Mean: %.2f\n", mean);
        System.out.printf("Std dev: %.2f\n", std);
        ////
        System.out.println("__________________________");

        FixedStackStringImplementation stackImplementation = new FixedStackStringImplementation(4);
        String first = "Alex";
        String sec = "Ion";
        String third = "Nicolae";

        stackImplementation.push(first);
        System.out.println(stackImplementation.pop());

        stackImplementation.push(first);
        stackImplementation.push(sec);
        System.out.println(stackImplementation.pop());





    }

}
