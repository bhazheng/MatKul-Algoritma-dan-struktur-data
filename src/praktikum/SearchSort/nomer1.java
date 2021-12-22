package praktikum.SearchSort;
import java.util.Scanner;

public class nomer1 {
    static void sort(int[] data){ 
        int tmp;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length-1; j++) {
                if (data[j]>data[j+1]) {
                    tmp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=tmp;
                } 
            }

        }
    }
    public static int binarySearch(int[] data,int target){
        int a = 0;
        int r = data.length-1;
        while (a<=r) {
            int mid=1+(r-1)/2;
            System.out.println(a+" "+r);
            if (data[mid]==target) {
                return mid;
            } else if(data[mid]<target){
                a=mid+1;
            }else if (data[mid]>target) {
                r=mid-1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int many=read.nextInt();
        int[] data=new int[many];
        for (int i = 0; i < many; i++) {
            data[i]=read.nextInt();
        }
        int target=read.nextInt();
        sort(data);
        System.out.println(binarySearch(data, target));

    }
}