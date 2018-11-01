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
     
    //TC :  Given: n > MAXN
    //      Should throw IndexOutOfBoundsException
    @Test
    public void shouldThrowIndexOutOfBoundsExceptionTC2() {
        //given
        assign(15, 3, 5, 9);
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
    
    //TC :  Given: x < 0
    //      Should throw CoordinateOutOfSizeException
    @Test
    public void shouldThrowCoordinateOutOfSizeExceptionTC3() {
        //given
        assign(5, 3, -5, 9);
        boolean result = false;
        //when
        try { 
            SWTAssignment.ThuNuocTiepTheo(i, x, y, q);
        } catch (CoordinateOutOfSizeException e) {
            result = true;
        }
        //then
        assertTrue(result);
    }
    
    //TC :  Given: x > n-1
    //      Should throw CoordinateOutOfSizeException
    @Test
    public void shouldThrowCoordinateOutOfSizeExceptionTC4() {
        //given
        assign(6, 2, 10, 8);
        boolean result = false;
        //when
        try { 
            SWTAssignment.ThuNuocTiepTheo(i, x, y, q);
        } catch (CoordinateOutOfSizeException e) {
            result = true;
        }
        //then
        assertTrue(result);
    }    
    
    //TC :  Given: y  < 0
    //      Should throw CoordinateOutOfSizeException
    @Test
    public void shouldThrowCoordinateOutOfSizeExceptionTC5() {
        //given
        assign(5, 3, 6, -5);
        boolean result = false;
        //when
        try { 
            SWTAssignment.ThuNuocTiepTheo(i, x, y, q);
        } catch (CoordinateOutOfSizeException e) {
            result = true;
        }
        //then
        assertTrue(result);
    }
    
    //TC :  Given: y > n-1
    //      Should throw
    @Test
    public void shouldThrowCoordinateOutOfSizeExceptionTC6() {
        //given
        assign(6, 7, 2, 10);
        boolean result = false;
        //when
        try { 
            SWTAssignment.ThuNuocTiepTheo(i, x, y, q);
        } catch (CoordinateOutOfSizeException e) {
            result = true;
        }
        //then
        assertTrue(result);
    }
    
    //TC :  Given: n = 0
    //      Should throw IndexOutOfBoundsException
    @Test
    public void shouldThrowIndexOutOfBoundsExceptionTC7() {
        //given
        assign(0, 5, 2, 9);
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
    
    //TC :  Given: n = MAXN+1
    //      Should throw IndexOutOfBoundsException
    @Test
    public void shouldThrowIndexOutOfBoundsExceptionTC8() {
        //given
        assign(11, 5, 2, 9);
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
    
    //TC :  Given: x = -1
    //      Should throw CoordinateOutOfSizeException
    @Test
    public void shouldThrowCoordinateOutOfSizeExceptionTC9() {
        //given
        assign(5, 2, -1, 7);
        boolean result = false;
        //when
        try { 
            SWTAssignment.ThuNuocTiepTheo(i, x, y, q);
        } catch (CoordinateOutOfSizeException e) {
            result = true;
        }
        //then
        assertTrue(result);
    }
    
    //TC :  Given: x = n
    //      Should throw CoordinateOutOfSizeException
    @Test
    public void shouldThrowCoordinateOutOfSizeExceptionTC10() {
        //given
        assign(5, 2, 5, 9);
        boolean result = false;
        //when
        try { 
            SWTAssignment.ThuNuocTiepTheo(i, x, y, q);
        } catch (CoordinateOutOfSizeException e) {
            result = true;
        }
        //then
        assertTrue(result);
    }

    //TC :  Given: y = -1
    //      Should throw CoordinateOutOfSizeException
    @Test
    public void shouldThrowCoordinateOutOfSizeExceptionTC11() {
        //given
        assign(2, 8, 6, -1);
        boolean result = false;
        //when
        try { 
            SWTAssignment.ThuNuocTiepTheo(i, x, y, q);
        } catch (CoordinateOutOfSizeException e) {
            result = true;
        }
        //then
        assertTrue(result);
    }

    //TC :  Given:  y = n 
    //      Should throw CoordinateOutOfSizeException
    @Test
    public void shouldThrowCoordinateOutOfSizeExceptionTC12() {
        //given
        assign(8, 5, 7, 8);
        boolean result = false;
        //when
        try { 
            SWTAssignment.ThuNuocTiepTheo(i, x, y, q);
        } catch (CoordinateOutOfSizeException e) {
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
