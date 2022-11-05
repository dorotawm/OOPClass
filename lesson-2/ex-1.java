public class Plant {
    private Name name;
    private boolean perennial;
    private boolean overwinters;
    private Conditions conditions;

    Plant(Name plantName, boolean wintering, boolean perennial, Conditions conditions) {
        this.name = plantName;
        this.overwinters = wintering;
        this.perennial = perennial;
        this.conditions = conditions;
    }

    public String toString() {
        return "";
    }

    public boolean suitableForAllYearOutdoors() {
        return this.overwinters && this.perennial;
    }

    public class Name {
        private String englishName;
        private String latinName;

        Name (String englishName, String latinName) {
            this.latinName = latinName;
            this.englishName = englishName;
        }

        public String toString() {
            return String.format("%d (latin: %d)", this.englishName, this.latinName);
        }
    }

    public class Conditions {
        private String soil;
        private String sunExposure;
        private String watering;

        Conditions (String soil, String sunExposure, String wateringFrequency) {
            this.soil = soil;
            this.sunExposure = sunExposure;
            this.watering = wateringFrequency;
        }

        public String toString() {
            return String.format("Plant in %d soil, sun exposure: %d, warer %d", this.soil, this.sunExposure, this.watering);
        }
    }

    public static void main(String[] args) {
        Name sedumName = new Name("Stonecrop", "Sedum");
        Conditions sedumConditions = new Conditions("well drained", "sunny", "rarely");
        Plant sedum = new Plant(sedumName, true, true, sedumConditions);

        System.out.println(sedum.suitableForAllYearOutdoors());

    }
}



