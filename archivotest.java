
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maast
 */
public class archivotest {
    
   //Palindromo b=new Palindromo(); 
   //test1 Positive = new test1();
    Positive a= new Positive();
    
    @Test
    public void testSomething() {
        assertEquals(15, a.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, a.sum(new int[]{1,-2,3,4,5}));
        //assertEquals(0, Positive.sum(new int[]{}));
       // assertEquals(0, Positive.sum(new int[]{-1,-2,-3,-4,-5}));
        //assertEquals(9, Positive.sum(new int[]{-1,2,3,4,-5}));
    } 
    
      @Test
    public void testPalindrome() {
        assertEquals(true, a.checkpalindrome("oso"));
       assertEquals(true, a.checkpalindrome("ana"));
       assertEquals(true, a.checkpalindrome("holi"));
    }
    
    
    
    //tarea ejercicio
    /*
     @Test
    public void testID() {
        assertEquals(1001, a.checkID(1,"Maestro"));
       assertEquals(4922, a.checkID(1,"Maestro"));
       assertEquals(al060878, a.checkID(2,"Alumno"));
       assertEquals(al040557, a.checkID(2,"Alumno"));
    }  
    
      @Test
    public void testID2() {
        assertEquals(ERROR01, a.checkID(1,"Maestro"));
       assertEquals(ERROR01, a.checkID(1,"Maestro"));
       assertEquals(ERROR02, a.checkID(2,"Maestro"));
       assertEquals(ERROR02, a.checkID(2,"Maestro"));
    }  
    
    */
    
    
}
