package SS2BT7;

import java.util.Random;

public class TinhTongDuongCheoChinh {
    public static void main(String[] args) {
        Random rd = new Random();
        int arr[][] = new int[5][5];
        arr[0][0] = 1;
        arr[1][1] = 1;
        arr[2][2] = 1;
        arr[3][3] = 1;
        arr[4][4] = 1;
//        for (int i =0 ; i < arr.length; i++) {
//            for (int j = 0 ; j < arr.length ; j++) {
//                if (i ==j ) {
//                    arr[i][j] = rd.nextInt(100);
//                }
//            }
//        }
        System.out.println("Tổng đường chéo huyền là : " + tinhTongCheoHuyen(arr));
        System.out.println("Tổng đường chéo sắc là : " + tinhTongCheoSac(arr));

    }
    private static int tinhTongCheoHuyen(int arr[][]) {
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
    private static int tinhTongCheoSac(int arr[][]) {
        int tong = 0;
        for (int i =0 ; i < arr.length; i++) {
            for (int j = arr.length ; j >= 0 ; j--) {
                if (i +j ==4 ) {
                    tong += arr[i][j];
                }
            }
        }
        return tong;
    }
}
