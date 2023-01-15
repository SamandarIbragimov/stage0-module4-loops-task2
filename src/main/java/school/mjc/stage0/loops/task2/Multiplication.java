package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int k = 0;
        if(multiplyByAndToInclusive < 0)
            while (k >= multiplyByAndToInclusive){
                System.out.println(k * multiplyByAndToInclusive);
                k--;
            }
        else
            while (k <= multiplyByAndToInclusive){
                System.out.println(k * multiplyByAndToInclusive);
                k++;
            }

    }
}
