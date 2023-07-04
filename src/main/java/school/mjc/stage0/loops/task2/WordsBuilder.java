package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int k = 0 , n = chars.length;

        while(k < n){
            System.out.print(chars[k]+" ");
            k++;
        }
    }
}
