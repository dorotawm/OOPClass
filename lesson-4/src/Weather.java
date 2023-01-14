public class Weather {
    private final Forecast forecast;

    public Weather(Forecast forecast) {
        this.forecast = forecast;
    }

    public String currentTemperature() {
        return "Current temperature: "+ this.forecast.temperature();
    }
}
