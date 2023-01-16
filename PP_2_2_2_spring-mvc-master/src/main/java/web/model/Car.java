package web.model;

public class Car {

    private String model;
    private int series;

    private int engineCapacity;

    public Car(String model, int series, int engineCapacity) {
        this.model = model;
        this.series = series;
        this.engineCapacity = engineCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }


}
