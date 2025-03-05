import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] numbers =  {1,2,3,4,5} ; // mang lac danh
        int[] x2 = numbers;
        /*
            - tên mảng : numbers
            - kiểu dữ liệu phần tử trong mảng : int
            - số phần tử trong mảng : 5 = số dài
         */

        int[] arr = new int[5];
        /*
            - tên mảng : arr
            - kiểu dữ liệu phần tử trong mảng : int
            - số phần tử trong mảng có thể chứa : 5 ( kích thước mảng )
            - các phần tử trong mảng hiện tại nhận giá trị mặc định của kiểu dữ liệu

         */

        // add item
        arr[0] = 7;
        arr[1] = 8;
        arr[2] = 9;
        arr[3] = 10;
        arr[4] = 11;

        // for each
        //for ( int items : arr  ) {
        // System.out.println(items);
        //}

        int [][] arr2 = new int[4][4];

        /*
            - tên mảng : arr 2
            - kiểu dữ liệu phần tử trong mảng : int
            - loại mảng : 2 chiều
            - số phần tử mảng arr2 : 4
            - số phần tử của một phần tử trong mảng arr2 : 6
         */

        arr2 [0][3] = 8;
        Scanner scanner = new Scanner(System.in);

        int x = 10;
        int y = 15;
        int total = sum(x,y);
        System.out.println(total);

    }

    public static int sum(int a, int b) {
        return a + b;
    }
    /*
        - tên hàm : sum
        - kiểu dữ liệu trả về : int
        - tham số đầu vào : int a , int b
        - tác dụng : tính tổng 2 số a và b

     */
}
