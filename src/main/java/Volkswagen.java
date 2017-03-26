/**
 * Created by Henco on 3/26/2017.
 */
public class Volkswagen extends Car
{
    public Volkswagen(String carBrand, String carModel, int carYear)
    {
        super(carBrand, carModel, carYear);
    }

    public String engine(){
        return "2.0 tsi";
    }
}
