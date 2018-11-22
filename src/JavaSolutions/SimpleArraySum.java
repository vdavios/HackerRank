package JavaSolutions;



public class SimpleArraySum {

    public int sum(int[] array){
        int res = 0;
        for(int value: array){
            res+= value;
        }
        return res;
    }
}
