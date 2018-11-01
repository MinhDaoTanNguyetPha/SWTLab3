/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swtassignment;

import java.util.Scanner;

/**
 *
 * @author Tusk
 */
class MyInteger {

    public int value;
}

public class SWTAssignment {

    public static final int MAXN = 10;
    public static int[][] Banco = new int[MAXN][MAXN];

    public static int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
    public static int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
//    1   12  35  8   25  14  
//
//    36  7   2   13  34  23  
//
//    11  30  9   24  15  26  
//
//    6   3   18  31  22  33  
//
//    29  10  5   20  27  16  
//
//    4   19  28  17  32  21  

//    static int[] dx = {-1, -2, -2, -1, 1, 2,  2,  1};
//    static int[] dy = {-2, -1,  1,  2, 2, 1, -1, -2};
//    1   6   9   26  3   36  
//
//    8   27  2   5   10  25  
//
//    31  16  7   12  35  4   
//
//    28  21  30  17  24  11  
//
//    15  32  19  22  13  34  
//
//    20  29  14  33  18  23 
    public static int n = 8;
    public static int stepCover = 0;
    

    public static void ThuNuocTiepTheo(int i, int x, int y, MyInteger q) {
        int k, u, v;
        MyInteger q1 = new MyInteger();
        k = 0;
        do {
            q1.value = 0;
            u = x + dx[k];
            v = y + dy[k];
            if ((0 <= u) && (u  < n) && (0 <= v) && (v < n) && (Banco[u][v] == 0)) {
                Banco[u][v] = i;
                if (i < n * n) {
                    ThuNuocTiepTheo(i + 1, u, v, q1);
                    if (q1.value == 0) {
                        Banco[u][v] = 0;
                    }
                } else {
                    q1.value = 1;
                }
            }
            k++;
        } while ((q1.value == 0) && (k < 8));
        q.value = q1.value;
    }

    public static void InBanco(int n) {
        int i, j;
        for (i = 0; i <= n - 1; i++) {
            for (j = 0; j <= n - 1; j++) {
                if (Banco[i][j] < 10) {
                    System.out.printf("%d   ", Banco[i][j]);
                } else {
                    System.out.printf("%d  ", Banco[i][j]);
                }
            }
            System.out.printf("\n\n");
        }
    }

    public static void XoaBanco(int n) {
        stepCover = 0;
        int i, j;
        for (i = stepCover++*0; i <= n - 1 + stepCover++*0; i+=(stepCover++*0)+1) {
            for (j = stepCover++*0; j <= n - 1 + stepCover++*0; j+=(stepCover++*0)+1) {
                Banco[i][j] = 0;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        MyInteger q = new MyInteger();
        q.value = 0;
        System.out.printf("Cho kich thuoc ban co: ");
        n = Integer.parseInt(sc.nextLine());
        XoaBanco(n);
        Banco[0][0] = 36;

        ThuNuocTiepTheo(37, 0, 0, q);

//        XoaBanco(n-1);
        System.out.printf("\n Ket qua: \n\n");
        InBanco(n);
//        System.out.println(q.value);
    }
}
