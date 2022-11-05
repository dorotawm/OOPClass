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
        String perennialString;
        if (this.perennial) {
            perennialString = "Can grow for multiple years.";
        } else {
            perennialString = "Needs to be replaced after a year.";
        }

        String overwintersString;
        if (this.overwinters) {
            overwintersString = "Doesn't need any special care during winter outdoors.";
        } else {
            overwintersString = "Needs covering or bringing inside during winter.";
        }

        return this.name.toString() + "\n" + perennialString + "\n" + overwintersString + "\n" + this.conditions.toString();
    }

    public boolean suitableForAllYearGarden() {
        return this.overwinters && this.perennial;
    }

    public static void main(String[] args) {
        Name sedumName = new Name("Stonecrop", "Sedum");
        Conditions sedumConditions = new Conditions("well drained", "sunny", "rarely");
        Plant sedum = new Plant(sedumName, true, true, sedumConditions);

        System.out.println(sedum.suitableForAllYearGarden());
        System.out.println(sedum);
    }
}


public class Conditions {
    private String soil;
    private String sunExposure;
    private String watering;

    Conditions(String soil, String sunExposure, String wateringFrequency) {
        this.soil = soil;
        this.sunExposure = sunExposure;
        this.watering = wateringFrequency;
    }

    public String toString() {
        return String.format("Plant in %s soil, sun exposure: %s, water %s", this.soil, this.sunExposure, this.watering);
    }

}


public class Name {
    private String englishName;
    private String latinName;

    Name (String englishName, String latinName) {
        this.latinName = latinName;
        this.englishName = englishName;
    }

    public String toString() {
        return String.format("%s (latin: %s)", this.englishName, this.latinName);
    }
}
