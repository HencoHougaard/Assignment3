/**
 * Created by Henco on 3/26/2017.
 */
public class Audi extends Car{

    public Audi(String carBrand, String carModel, int carYear)
    {
        super(carBrand, carModel, carYear);
    }

    public String engine(){
        return "4.0 TT V8";
    }
}
