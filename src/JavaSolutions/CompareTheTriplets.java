package JavaSolutions;

public class CompareTheTriplets {

    public int[] compare(int[] a, int[]b){
        int[] res = new int[]{0,0};
        for(int i= 0 ; i < a.length ; i++){
            if(a[i]> b[i]) {
                res[0] +=1;
            }else if(a[i]< b[i]){
                res[1] +=1;
            }
        }
        return res;
    }
}
