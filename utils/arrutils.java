
package utils;
public class ArrUtils {
    public static public reverse(int[] arr) 
    {
        for(int i = 0; i < (arr.length-1)/2; i++)
        {
            arr[i] += arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i] - arr[arr.length - i - 1];
            arr[i] = arr[i] - arr[arr.length - i - 1];
        }
    }
    public static String strArr(Object arr) {
        String result = "";
        for(int i = 0; i < Array.getLength(arr); i++)
        {
            result += Array.get(arr, i);
        }
        return result;
    }