import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] A = new int[10000];
        for(int i = 0; i<10000; i++) {
            A[i] = 9;
        }
        long startTime = System.nanoTime();
        int [] result = twoSum(A);
        System.out.println(Arrays.toString(result));
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);

    }

    public static int [] twoSum(int [] arr) {
        if(arr.length == 0 ) {
            return null;
        }
        int incrementCounts = 0;
        for(int i = arr.length - 1; i>=0; i--) {
            if(arr.length == 1 && arr[0] < 9) {
                arr[0]++;
                break;
            }
            if(arr[i] != 9 && incrementCounts == arr.length-1) {
                arr[i]++;
                break;
            }
            if(incrementCounts == arr.length-1) {
                int [] newArray = new int[incrementCounts+2];
                newArray[0] = 1;
                return newArray;
            }
            if(arr[i] == 9) {
                arr[i] = 0;
                incrementCounts++;
                continue;
            }

            arr[i]++;
            break;
        }
        return arr;
    }

}

