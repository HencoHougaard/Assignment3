import jdk.nashorn.internal.runtime.ECMAException;
import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

/**
 * Created by Henco on 3/26/2017.
 */
public class CarTest extends TestCase
{
    List<CarInterface> carList = new ArrayList();
    Set<CarInterface> hashSet = new HashSet();
    Map<String, CarInterface> hashMap = new HashMap();

    Audi audi = new Audi("Audi", "RS 6 Avant", 2015);
    Audi audi2 = new Audi("Audi", "RS 4", 2016);
    Audi audi3 = new Audi("Audi", "RS 7", 2014);
    Audi audi4 = new Audi("Audi", "S 6", 2012);

    Volkswagen vw = new Volkswagen("Volkswagen", "Golf 7 GTI", 2017);
    Volkswagen vw2 = new Volkswagen("Volkswagen", "Golf 6 GTI", 2014);

    Volkswagen  vw3;

    @Test
    public void testListObjectNotSame() throws Exception
    {
        carList.add(0, audi);
        carList.add(1, vw);

        assertNotSame(carList.get(0).engine(),carList.get(1).engine());
    }

    @Test
    public void testHashSetOjectNotNull() throws Exception
    {
        hashSet.add(audi2);
        hashSet.add(audi3);

        assertNotNull(hashSet);
    }

    @Test
    public void testHashMapObjectNull() throws Exception
    {
        hashMap.put("5", audi4);
        assertNull(hashMap.get("6"));
    }

}
