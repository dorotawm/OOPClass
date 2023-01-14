public class Main {

    public static void main(String[] args) {

        Forecast fakeForecast = new Forecast.Fake();
        Weather weather = new Weather(fakeForecast);
        System.out.println(weather.currentTemperature());
        assert "Current temperature: 7.0".equals(weather.currentTemperature());
    }
}