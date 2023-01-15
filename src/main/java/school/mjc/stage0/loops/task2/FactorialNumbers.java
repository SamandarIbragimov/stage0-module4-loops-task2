package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int k = 0;
        while(k <= printToInclusive){
            if(k==0){
                System.out.println(1);
                k++;
            }
            else {
                int n = 1;
                while (n < k) {
                    System.out.print(n + ",");
                    n++;
                }
                System.out.println(k);
                k++;
            }
        }
    }
}
