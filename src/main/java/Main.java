import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] arr = {2,4,1};

        //returnArray(arr);
        //returnArray2(arr);
       // returnArray3(arr);
        System.out.println(returnArray3(arr));
    }

    public static int[] returnArray(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                index = i;
            }
        }
        if (index == -1) {
            throw new RuntimeException();
        }
//        for (int i = index + 1; i < arr.length; i++) {
//            Arrays.copyOfRange(arr, index + 1, arr.length);
//        }
        int[] arr1 = new int[arr.length - index - 1];
        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = arr[index + j + 1];
        }
        System.out.println(Arrays.toString(arr1));
        return arr1;
    }

    public static void returnArray2(int[] arr) {
        boolean result = true;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 4) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] != 1) {
                        index = -1;
                    }
                }
            }

            if (index != 0) {
                result = false;
            }

        }
        System.out.println(result);

    }

    public static boolean returnArray3(int[] arr) {
        boolean four = false;
        boolean one = false;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                four = true;
            } else if (arr[i] == 1) {
                one = true;
            } else {
                return false;
            }
        }

        return four && one;

    }

}


//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j] != 1) {
//                    one = true;
//                }