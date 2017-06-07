/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormon.adventure.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego
 */
public class InGameMenuControlTest {
    
    public InGameMenuControlTest() {
    }

    /**
     * Test of CalculateItemsRemaining method, of class InGameMenuControl.
     */
    @Test
    public void testCalculateItemsRemaining() {
        System.out.println("Calculate Items Remaining Test Case 1");
        
        //Input Values for test case 1//
        double itemlist = 5.0;
        double itemsold = -3.0;
        InGameMenuControl instance = new InGameMenuControl();
        
        double expResult = -10.0; //Expected Result//
        
        double result = instance.CalculateItemsRemaining(itemlist, itemsold);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
    
    
   
        System.out.println("\tTest Case 2");
        
        //Input Values for test case 2//
        itemlist = 6.0;
        itemsold = -8.0;
        
        expResult = -10.0; //Expected Result//
        
        result = instance.CalculateItemsRemaining(itemlist, itemsold);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
    
    
        System.out.println("\tTest Case 3");
        
        //Input Values for test case 3//
        itemlist = 3.0;
        itemsold = 0.0;
        
        expResult = -10.0; //Expected Result//
        
        result = instance.CalculateItemsRemaining(itemlist, itemsold);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
        
        
        System.out.println("\tTest Case 4");
        
        //Input Values for test case 4//
        itemlist = 0.0;
        itemsold = -2.0;
        
        expResult = -10.0; //Expected Result//
        
        result = instance.CalculateItemsRemaining(itemlist, itemsold);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
        
        
        System.out.println("\tTest Case 5");
        
        //Input Values for test case 5//
        itemlist = 0.0;
        itemsold = 0.0;
        
        expResult = -10.0; //Expected Result//
        
        result = instance.CalculateItemsRemaining(itemlist, itemsold);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
        
        
    }
}


