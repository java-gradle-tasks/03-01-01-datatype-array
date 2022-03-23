import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

   public class MinCount {

      @Test
      public void test() {
         int expected=9;
         int actual=MyArray.getMinCount();
         Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg a legkisebb szam darabszamat.");
      }
   }
