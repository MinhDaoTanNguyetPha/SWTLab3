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
     * This part follow part 1.1A in unit test document.<br>              *
     * Using equivalence partitioning technique                           *
     * ****************************************************************** *
     */
    //TC1: n<1
    @Test
    public void shouldThrowsIndexOutOfBoundsExceptionTC1() {
        //given
        int n = -5;
        boolean result = false;
        //when
        try {
            SWTAssignment.XoaBanco(n);
        } catch (IndexOutOfBoundsException e) {
            result = true;
        }
        //then
        assertTrue(result);
    }
    
    //TC2: 1<=n<MAXN
    @Test
    public void shouldChangeNxNElemetnInBancoToZeroTC2() {
        //given
        int n = 2;
        int[][] result = SWTAssignment.Banco.clone();
        result[0][0] = 0;
        result[0][1] = 0;
        result[1][0] = 0;
        result[1][1] = 0;

        //when
        SWTAssignment.XoaBanco(n);

        //then
        assertArrayEquals(result, SWTAssignment.Banco);
    }

    //TC3: n is bigger than MAXN
    @Test
    public void shouldThrowsIndexOutOfBoundsExceptionTC3() {
        //given
        int n = 15;
        boolean result = false;
        //when
        try {
            SWTAssignment.XoaBanco(n);
        } catch (IndexOutOfBoundsException e) {
            result = true;
        }
        //then
        assertTrue(result);
    }

    /**
     * ******************************************************** *
     * This part follow part 1.1B in unit test document.        *
     * Using boundary value technique                           *
     * ******************************************************** *
     */
    
    //TC4: n is 0
    @Test
    public void shouldThrowsIndexOutOfBoundsExceptionTC4() {
        //given
        int n = 0;
        boolean result = false;
        //when
        try {
            SWTAssignment.XoaBanco(n);
        } catch (IndexOutOfBoundsException e) {
            result = true;
        }
        //then
        assertTrue(result);
    }
    
    //TC5: n = 1
    @Test
    public void shouldChangeTheFirstElementToZeroTC5() {
        //given
        int n = 1;
        int[][] result = SWTAssignment.Banco.clone();
        result[0][0] = 0;

        //when
        SWTAssignment.XoaBanco(n);

        //then
        assertArrayEquals(result, SWTAssignment.Banco);
    }
    
    //TC6: n = 2
    @Test
    public void shouldChange4FirstElementsToZeroTC6() {
        //given
        int n = 2;
        int[][] result = SWTAssignment.Banco.clone();
        result[0][0] = 0;
        result[0][1] = 0;
        result[1][0] = 0;
        result[1][1] = 0;
        //when
        SWTAssignment.XoaBanco(n);
        //then
        assertArrayEquals(result, SWTAssignment.Banco);
    }

    //TC7: n is MAXN-1
    @Test
    public void shouldChange81FirstElementsBoundary() {
        //given
        int n = SWTAssignment.MAXN - 1;
        int[][] result = SWTAssignment.Banco.clone();
        int[][] tmp = new int[SWTAssignment.MAXN-1][SWTAssignment.MAXN-1];
        for(int i=0; i<tmp.length; i++) {
            for(int j=0; j<tmp.length; j++) {
                result[i][j] = tmp[i][j];
            }
        }
        //when
        SWTAssignment.XoaBanco(n);
        //then
        assertArrayEquals(result, SWTAssignment.Banco);
    }
    
    //TC8: n is MAXN
    @Test
    public void shouldChangeAllElementToZeroTC8() {
        //given
        int n = SWTAssignment.MAXN;
        int[][] result = new int[n][n]; //array is initialized with 0

        //when
        SWTAssignment.XoaBanco(n);

        //then
        assertArrayEquals(result, SWTAssignment.Banco);
    }

    //TC9: n is MAXN+1
    @Test
    public void shouldThrowsIndexOutOfBoundsExceptionBoundary() {
        //given
        int n = SWTAssignment.MAXN + 1;
        boolean result = false;

        //when
        try {
            SWTAssignment.XoaBanco(n);
        } catch (IndexOutOfBoundsException e) {
            result = true;
        }

        //then
        assertTrue(result);
    }

    /**
     * ******************************************************** *
     * This part follow part 1.1C in unit test document.        *
     * Using Statement coverage                                 *
     * ******************************************************** *
     */
    
    //TC10: 1 ≤ n ≤ MAXN
    @Test
    public void shouldReturnTheRightNumberOfStatement() {
        //given
        int n = 1;
        int stepExpected = 9;
        //when
        SWTAssignment.XoaBanco(n);
        //then
        assertTrue(stepExpected==SWTAssignment.stepCover);
    }
    
}
