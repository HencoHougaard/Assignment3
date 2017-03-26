/**
 * Created by Henco on 3/26/2017.
 */
public abstract class Car implements CarInterface
{

    private String carBrand;
    private String carModel;
    private int carYear;

    public Car(String carBrand, String carModel, int carYear)
    {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYear = carYear;
    }

    public void setCarBrand(String carBrand)
    {
        this.carBrand = carBrand;
    }

    public void setCarModel(String carModel)
    {
        this.carModel = carModel;
    }

    public void setCarYear(int carYear)
    {
        this.carYear = carYear;
    }



    public String getCarBrand(){ return carBrand; }

    public String getCarModel(){ return carModel; }

    public int getCarYear(){ return carYear; }

    public String toString()
    {
        return "Brand: " + getCarBrand() + "\nModel: " + getCarModel() + "\nYear: " + getCarYear();
    }

}
