package designPatterns.adapter.challenge;

public class Adapter implements City{

    AsianCity asianCity;

    public Adapter(AsianCity asianCity) {
        this.asianCity = asianCity;
    }

    @Override
    public String getName() {
        return asianCity.getName();
    }

    @Override
    public double getTemperature() {
        return asianCity.getTemperature() * 1.8 + 32;
    }

    @Override
    public String getTemperatureScale() {
        return asianCity.getTemperatureScale();
    }

    @Override
    public boolean getHasWeatherWarning() {
        return asianCity.getHasWeatherWarning();
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        asianCity.setHasWeatherWarning(hasWeatherWarning);
    }
}
