public interface Forecast {
    float temperature();

    final class Fake implements Forecast {
        @Override
        public float temperature() {
            return 7;
        }
    }
}
