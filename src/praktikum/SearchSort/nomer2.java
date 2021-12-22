package praktikum.SearchSort;

import java.util.Scanner;

public class nomer2 {
	static void bubblesort(int[] data){
        int total = 0;
        for(int i = 0 ; i < data.length; i++){
            for(int j = 0; j < data.length-1-i; j++){
                if(data[j] > data[j+1]){
                    total++;
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
        }
        System.out.println(total);
    }
    static void insertionSort(int[] data){
        int tmp=0, sorted=0, total=0;
        for(int i = 1 ; i < data.length; i++){
            tmp = data[i];
            sorted = i-1;
            while(sorted>=0 && data[sorted] > tmp){
                total++;
                data[sorted+1] = data[sorted];
                sorted--;
            }
            total++;            
            data[sorted+1] = tmp;
        }
        System.out.println(total);
    }

    static void selectionSort(int[] data){
        int max, sorted = data.length-1, total =0;
        for(int i = 0 ; i < data.length; i++){
            max = 0;
            for(int j = 0; j <= sorted; j++){
                if(data[j] > data[max]){
                    max = j;
                }
            }
            int tmp = data[max];
            data[max] = data[sorted];
            data[sorted] = tmp;
            total++;
            sorted--;
        }
        System.out.println(total);
    }
    static void printx(int[] data,int jmlh){
        for(int i = 0; i < jmlh; i++){
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int many=read.nextInt();
        int[] data=new int[many];
        for (int i = 0; i < many; i++) {
            data[i]=read.nextInt();
        }
        int[] data1 = data.clone();
        int[] data2 = data.clone();
        bubblesort(data1);
        printx(data1,many);
        insertionSort(data2);
        printx(data2,many);
        selectionSort(data);
        printx(data,many);
        
    }
}