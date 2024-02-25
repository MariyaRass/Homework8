import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        double[] arr1 = {1.57, 7.654, 9.986};
        for (double v : arr1) {
            System.out.print(v + " ");
        }
        System.out.println();

        int[] arr2 = new int[18];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.println("Задание 2");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i < arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i < arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задание 3");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");}}
        System.out.println();

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i > 0) {
                System.out.print(", ");}}
        System.out.println();

        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i > 0) {
                System.out.print(", ");}}
        System.out.println();

        System.out.println("Задание 4");
        for (int i=0; i<arr.length;i++){
            if (arr[i]%2 ==1){
                arr[i]++;
                System.out.println(Arrays.toString(arr));
            }
        }







}}


