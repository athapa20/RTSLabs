//Rotate the characters in a string by a given input
//and have the overflow appear at the beginning

public class Main {
    public static void main(String[] args) {
        String test = "MyString";
        String result = rotateString(test,2);
        System.out.print(result);
    }
    public static String rotateString(String string, int numRotations){
        char[] arr = string.toCharArray();
        char[] arr2 = new char[string.length()];
        for(int i = 0; i < arr.length; i++){
            arr2[(i + numRotations)%arr.length] = arr[i]; 
        }
        String result = new String(arr2);
        return result;
    }
}
