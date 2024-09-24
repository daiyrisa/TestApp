import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

        @Test
        public void reverseTestWithNull(){
            Assert.assertNull(ReverseString.reverseString(null));
        }

        @Test
        public void reverseStringDigit(){
            Assert.assertEquals("random", ReverseString.reverseString("123abc"));
        }
        @Test
        public void reverseString(){
            Assert.assertEquals("elppa", ReverseString.reverseString("apple"));
            System.out.println("Good Job");
        }





}