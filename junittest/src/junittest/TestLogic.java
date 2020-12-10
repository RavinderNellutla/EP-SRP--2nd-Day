package junittest;

import static org.junit.Assert.*;  
import org.junit.Test;  
  
public class TestLogic 
{  
  
    @Test  
    public void testCheckPrime()
    {  
        assertEquals(0,Sample.checkPrime(3));       
    }  
} 