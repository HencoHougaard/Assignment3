import java.util.*;

/**
 * Created by Henco on 3/26/2017.
 */
public class RunCar
{
    public static void main(String[] args)
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

        carList.add(audi);
        carList.add(audi2);
        carList.add(audi3);
        carList.add(audi4);
        carList.add(vw);
        carList.add(vw2);

        hashSet.add(audi);
        hashSet.add(audi2);
        hashSet.add(audi3);
        hashSet.add(audi4);

        hashMap.put("1", audi);
        hashMap.put("2", vw);

        for(int i=0; i<carList.size(); i++)
        {
            System.out.println(carList.get(i) + "\nengine: " + carList.get(i).engine());
        }
        System.out.println(hashSet);
        System.out.println(hashMap);

    }
}
