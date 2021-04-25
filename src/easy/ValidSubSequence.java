package easy;

public class ValidSubSequence {

    public static void main(String[] args) {
        int arr[] ={5,1,22,25,6,-1,8,10};
        int subSeq[] = {1,6,-1,10};

        System.out.println(validSubSeq(arr,subSeq));
    }

    public static boolean validSubSeq(int [] arr, int [] subSeq){
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] == subSeq[j]){
                j++;
            }
            if(j == subSeq.length){
                return true;
            }
        }
        return false;
    }
}
