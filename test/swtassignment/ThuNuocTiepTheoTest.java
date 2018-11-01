/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swtassignment;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Tusk
 */
public class ThuNuocTiepTheoTest {

    /**
     * **
     *
     */
    /**
     * ******************************************************************
     * The following part makes use of Equivalence partitioning technique. There
     * are 4 inputs: (n, i, x, y) n has 3 equivalence partitioning: n<1 ||
     * 1<=n<=MAXN || N>MAXN (x,y) can be treated as interchangeable so we have 6
     * equivalence partitioning: (x>=n && y>=n) || (x>=n && 0<=y<n) || (x>=n &&
     * y<0) || (0<=x<n && 0<=y<n) || (0<=x<n && y<0) || (x<0 && y<0) i has 3
     * equivalence partitioning: i<2 || 2<=i<n*n || i>=n*n So to coverage every
     * case, we need 3*6*3 = 54 test cases. For simplicity, if n<1 or n>MAXN
 will both throw IndexOutOfBoundsException for any set of other inputs.
 If n has not thrown any exception, any combination with (x or y) that (bigger than or equal to n) or (smaller than 0)
 will throw CoordinateOutOfSizeException. And because x and y can be treated as inter changeable, so we will test for x only.
 So we will only have these combination:
 TC1: n<1
     * TC2: n>MAXN
     * TC3: 1<=n<=MAXN and x<0
     * TC4: 1<=n<=MAXN and x>=n
     * TC5: 1<=n<=MAXN and 0<=x<n and i<2
     * TC6: 1<=n<=MAXN and 0<=x<n and i>n*n
     * 
     * So in this case, the number of test cases will be 2 + 3 + 3*
     * signature is: private void assign(int n, int i, int x, int y);
     * ****************************************************************** *
     */
    //TC1: if n<1 then throws index out of bounds exception
    @Test
    public void shouldThrowIndexOutOfBoundsExceptionBecauseNSmallerThan1TC1() {
        //given
        assign(-5, -5, -5, -5);
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

    //TC2: if n>MAXN then throws index out of bounds exception
    @Test
    public void shouldThrowIndexOutOfBoundsExceptionBecauseNBiggerThanMAXNTC2() {
        //given
        assign(SWTAssignment.MAXN + 5, 5, 5, 5);
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

    //TC3:  From this test case, n will always satisfy that 1<=n<=MAXN
    //      This test case will test combination: (x>=n and y>=n) and i>=n*n
    //      Should throw CoordinateOutOfSizeException
    @Test
    public void shouldThrowCoordinationOutOfSizeExceptionTC3() {
        //given
        assign(5, 30, 5, 5);
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

    //TC4:  Given: 
    //      Should throw
    @Test
    public void shouldThrowExceptionTC() {
        //given
        assign(n, i, x, y);
        boolean result = false;
        //when
        try { 
            SWTAssignment.ThuNuocTiepTheo(i, x, y, q);
        } catch ( e) {
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
