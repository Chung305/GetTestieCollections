package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {

    HashMap<Integer, Person> personMap = new HashMap<>();

     @Test
    public void addingKeysAndValues(){
         //Given
         Integer key = 1;
         Person chung = new Person("Chung", 1989);
         Integer key2 = 2;
         Person kendra = new Person("Kendra", 1992);



         //when
         personMap.put(key,chung);
         personMap.put(key2, kendra);

         //then key == chung && key2 == kendra CHECK
         Assert.assertEquals(chung, personMap.get(key));
         Assert.assertEquals(kendra, personMap.get(key2));
     }

     @Test
    public void testingRemoveTest(){
         //Given
         Integer key = 1;
         Person chung = new Person("Chung", 1989);
         Integer key2 = 2;
         Person kendra = new Person("Kendra", 1992);

         //when
         personMap.put(key,chung);
         personMap.put(key2, kendra);
         personMap.remove(key);


         //then
         Assert.assertNull(personMap.get(key));




     }

}
