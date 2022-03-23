import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsAvgInArray {

   @Test
   public void testNoData() {
      double[] data={};
      boolean expected=false;
      boolean actual=MyArray.isAvgInArray(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy a tömb tartalmazza-e az átlagot!");
   }

   @Test
   public void testSameData() {
      double[] data={2,2,2,2,2,2,2};
      boolean expected=true;
      boolean actual=MyArray.isAvgInArray(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy a tömb tartalmazza-e az átlagot!");
   }

   @Test
   public void testLastData() {
      double[] data={2,3,2,3,2,3,2.5};
      boolean expected=true;
      boolean actual=MyArray.isAvgInArray(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy a tömb tartalmazza-e az átlagot!");
   }

   @Test
   public void testFistData() {
      double[] data={2.5,2,3,2,3,2,3};
      boolean expected=true;
      boolean actual=MyArray.isAvgInArray(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy a tömb tartalmazza-e az átlagot!");
   }

   @Test
   public void testDoubleData() {
      double[] data={1.9,2.1,2.1,2.1,2.4,2.0,2.1,2.2,2.1,2.0};
      boolean expected=true;
      boolean actual=MyArray.isAvgInArray(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy a tömb tartalmazza-e az átlagot!");
   }
}
