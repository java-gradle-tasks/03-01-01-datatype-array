import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinDiffIndexFromAvgTest {

   @Test
   public void test_no_data() {
      int expected=-1;
      int[] data={};
      int actual=MyArray.getMinDifferenceIndexFromAvg(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg az atlaghoz legkozelebb eso szam sorszamat!.");
   }

   @Test
   public void test_first() {
      int expected=0;
      int[] data={2,1,3,1,3,1,3,1,3,4};
      int actual=MyArray.getMinDifferenceIndexFromAvg(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg az atlaghoz legkozelebb eso szam sorszamat!.");
   }

   @Test
   public void test_last() {
      int expected=9;
      int[] data={4,1,3,1,3,1,3,1,3,2};
      int actual=MyArray.getMinDifferenceIndexFromAvg(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg az atlaghoz legkozelebb eso szam sorszamat!.");
   }

   @Test
   public void test_middle() {
      int expected=7;
      int[] data={4,4,4,4,1,2,1,3,1,3,1,3,2};
      int actual=MyArray.getMinDifferenceIndexFromAvg(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg az atlaghoz legkozelebb eso szam sorszamat!.");
   }

   @Test
   public void test_samedistance() {
      int expected=0;
      int[] data={1,2,1,2,1,2,1,2};
      int actual=MyArray.getMinDifferenceIndexFromAvg(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg az atlaghoz legkozelebb eso szam sorszamat!.");
   }


}
