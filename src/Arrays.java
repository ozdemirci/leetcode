import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //Create a String array by getting elements from user
        //Type code to put elements in alphabetical order
        //Type code to print the total number of characters in the first and the last String
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the capacity of array");
        int length=input.nextInt();

        String[] arr=new String[length];

        System.out.println("Empty Array: "+ java.util.Arrays.toString(arr));


        for(int i =0; i<length;i++){
            System.out.println("Enter the element of the array in the index of "+i);
            arr[i]=input.next();
        }

        System.out.println(java.util.Arrays.toString(arr));

        //sort() method puts the String elements in alphabetical order
        java.util.Arrays.sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
        int numOfCharInFirstElement = arr[0].length();
        int numOfCharInLastElement = arr[arr.length-1].length();

        System.out.println("Total number of characters: "+(numOfCharInFirstElement+numOfCharInLastElement));

    }
}
