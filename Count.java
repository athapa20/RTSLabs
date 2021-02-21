//Print the number of integers in an array that are
//above the given input and the number that are below

public class Count {
    public static void main(String[] args) {
        int countAbove = 0;
        int countBelow = 0;
        int arr[] = { 1, 5, 2, 1, 10 };
        int input = 6;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < input) {
                countBelow++;
            }
            if (arr[i] > input) {
                countAbove++;
            }
        }
        System.out.println("Number of counts above and below 6");
        System.out.println("Above:" + countAbove);
        System.out.print("Below:" + countBelow);
    }
}
