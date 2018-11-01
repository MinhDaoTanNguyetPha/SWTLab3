/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swtassignment;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Tusk
 */
public class ThuNuocTiepTheoTest {

    
    //TC1:  Given: n<1
    //      Should throw IndexOutOfBoundsException
    @Test
    public void shouldThrowIndexOutOfBoundsExceptionTC1() {
        //given
        assign(-5, 3, 5, 8);
        boolean result = false;
        //when
        try { 
            SWTAssignment.ThuNuocTiepTheo(i, x, y, q);
        } catch (IndexOutOfBoundsException e) {
            result = true;
        }
        //then
        assertTrue(result);
    }
    
//    //TC :  Given:
//    //      Should throw
//    @Test
//    public void shouldThrowExceptionTC() {
//        //given
//        assign(n, i, x, y);
//        boolean result = false;
//        //when
//        try { 
//            SWTAssignment.ThuNuocTiepTheo(i, x, y, q);
//        } catch ( e) {
//            result = true;
//        }
//        //then
//        assertTrue(result);
//    }
    
    //TCX1:   1<=n<=MAXN && 0<=x<=n-1 && 0<=y<=n-1 && i<2
    //      Should only change Banco[x][y] to i-1
    @Test
    public void shouldChangeOneElementTCX1() {
        //given
        assign(5, -5, 2, 2);
        //for simplicity, we suppose that Banco will be clear before use.
        SWTAssignment.Banco = new int[SWTAssignment.MAXN][SWTAssignment.MAXN];
        int[][] result= SWTAssignment.Banco.clone();
        result[x][y]=i-1;
        //when
        SWTAssignment.ThuNuocTiepTheo(i, x, y, q);
        //then
        assertArrayEquals(result, SWTAssignment.Banco);
    }

    //TCX2:   1<=n<=MAXN && 0<=x<=n-1 && 0<=y<=n-1 && i>n^2
    //      Should only change Banco[x][y] to n^2
    @Test
    public void shouldChangeOneElementTCX2() {
        //given
        assign(5, 30, 2, 2);
        //for simplicity, we suppose that Banco will be clear before use.
        SWTAssignment.Banco = new int[SWTAssignment.MAXN][SWTAssignment.MAXN];
        int[][] result= SWTAssignment.Banco.clone();
        result[x][y]=25;
        //when
        SWTAssignment.ThuNuocTiepTheo(i, x, y, q);
        //then
        assertArrayEquals(result, SWTAssignment.Banco);
    }
    
    //
    @Test
    public void should() {
        //given
        //when
        //then
    }
    
    int n, i, x, y;
    int[][] Banco;
    MyInteger q = new MyInteger();

    private void assign(int n, int i, int x, int y) {
        this.n = n;
        this.i = i;
        this.x = x;
        this.y = y;
        this.q.value = 0;
        try {
            SWTAssignment.Banco[x][y] = i - 1;
        } catch (Exception e) {

        }
        this.Banco = SWTAssignment.Banco.clone();
        SWTAssignment.n = n;
    }
}
