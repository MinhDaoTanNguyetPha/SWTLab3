/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swtassignment;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tusk
 */
public class XoaBanCoTest {

    public XoaBanCoTest() {
    }

    /**
     * ****************************************************************** *
     * The following part makes use of Equivalence partitioning technique *
     * There is 1 input (n) so number of test cases should be the number  *
     * of equivalence partitioning of n. In this case is 3 because n has  *
     * 3 equivalence partitioning: n<1 || 1<=n<=MAXN || n>MAXN
     * ****************************************************************** *
     */
    //TC1: n is (bigger than or equal to 1) and (smaller than or equal to MAXN)
    @Test
    public void shouldChangeNxNElemetnInBancoToZero() {
        //given
        int n = 2;
        int[][] result = SWTAssignment.Banco.clone();
        result[0][0]=0;
        result[0][1]=0;
        result[1][0]=0;
        result[1][1]=0;
        
        //when
        SWTAssignment.XoaBanco(n);
        
        //then
        assertArrayEquals(result, SWTAssignment.Banco);
    }
    //TC2: n is bigger than MAXN
    @Test
    public void shouldThrowsIndexOutOfBoundsExceptionEquivalence() {
        //given
        int n=15;
        boolean result=false;
        //when
        try{
            SWTAssignment.XoaBanco(n);
        } catch (IndexOutOfBoundsException e) {
            result=true;
        }
        //then
        assertTrue(result);
    }
    //TC3: n is smaller than 1
    @Test
    public void shouldDoNothingEquivalence() {
        //given
        int n=-5;
        int[][] result = SWTAssignment.Banco.clone();
        //when
        SWTAssignment.XoaBanco(n);
        //then
        assertArrayEquals(result, SWTAssignment.Banco);
    }
    
    /**
     * ******************************************************** *
     * The following part makes use of Boundary value technique *
     * ******************************************************** *
     */
    //TC4: n is 1
    @Test
    public void shouldChangeTheFirstElementToZero() {
        //given
        int n = 1;
        int[][] result = SWTAssignment.Banco.clone();
        result[0][0]=0;
        
        //when
        SWTAssignment.XoaBanco(n);
        
        //then
        assertArrayEquals(result, SWTAssignment.Banco);
    }
    //TC5: n is 0
    @Test
    public void shouldDoNothingBoundary() {
        //given
        int n = 0;
        int[][] result = SWTAssignment.Banco.clone();
        
        //when
        SWTAssignment.XoaBanco(n);
        
        //then
        assertArrayEquals(result, SWTAssignment.Banco);
    }
    
    //TC6: n is MAXN
    @Test
    public void shouldChangeAllElementToZero() {
        //given
        int n = SWTAssignment.MAXN;
        int[][] result = new int[n][n]; //array is initialized with 0
        
        //when
        SWTAssignment.XoaBanco(n);
        
        //then
        assertArrayEquals(result, SWTAssignment.Banco);
    }
    //TC7: n is MAXN+1
    @Test
    public void shouldThrowsIndexOutOfBoundsExceptionBoundary() {
        //given
        int n = SWTAssignment.MAXN+1;
        boolean result = false;
        
        //when
        try {
        SWTAssignment.XoaBanco(n); } catch(IndexOutOfBoundsException e) {
            result=true;
        }
        
        //then
        assertTrue(result);
    }
//    //Template
//    @Test
//    public void should() {
//        //given
//        //when
//        //then
//    }
}
