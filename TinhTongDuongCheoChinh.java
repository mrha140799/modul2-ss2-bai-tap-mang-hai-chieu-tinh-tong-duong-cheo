package SS2BT7;

import java.util.Random;

public class TinhTongDuongCheoChinh {
    public static void main(String[] args) {
        Random rd = new Random();
        int arr[][] = new int[5][5];
        for (int i =0 ; i < arr.length; i++) {
            for (int j = 0 ; j < arr.length ; j++) {
                if (i ==j ) {
                    arr[i][j] = rd.nextInt(100);
                }
            }
        }
        System.out.println("Tổng đường chéo chính là : " + tinhTong(arr));
    }
    private static int tinhTong(int arr[][]) {
        int tong = 0;
        for (int i =0 ; i < arr.length; i++) {
            for (int j = 0 ; j < arr.length ; j++) {
                if (i ==j ) {
                    tong += arr[i][j];
                }
            }
        }
        return tong;
    }
}
