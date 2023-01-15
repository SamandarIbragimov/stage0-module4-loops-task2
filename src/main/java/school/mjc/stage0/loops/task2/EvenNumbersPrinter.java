package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int k = 2;
        while (k <= printTillInclusive){
            System.out.println(k);
            k+=2;
        }
    }
}
