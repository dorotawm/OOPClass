interface Animal {
    Animal giveFavouriteToy(String toyName);
}

public class Dog implements Animal {
    private String name;
    private String favouriteToy;

    Dog(String name, String favouriteToy) {
        this.name = name;
        this.favouriteToy = favouriteToy;
    }

    @Override
    public Dog giveFavouriteToy(String toyName) {
        return new Dog(this.name, toyName);
    }

    public String toString() {
        return String.format("Dog %s plays with %s", this.name, this.favouriteToy);
    }
}

public class Cat implements Animal {
    private String name;
    private String favouriteToy;

    Cat(String name, String favouriteToy) {
        this.name = name;
        this.favouriteToy = favouriteToy;
    }

    @Override
    public Cat giveFavouriteToy(String toyName) {
        return new Cat(this.name, toyName);
    }

    public String toString() {
        return String.format("Cat %s plays with %s", this.name, this.favouriteToy);
    }

}

public class Main {
    public static void main(String[] args) {
        Animal burekWithBone = new Dog("Burek", "Bone");
        Animal burekWithBall = burekWithBone.giveFavouriteToy("Ball");
        Cat rudyCat = new Cat("Rudy", "Mouse");
        rudyCat.giveFavouriteToy("Feather Wand");

        System.out.println(burekWithBone);
        System.out.println(burekWithBall);
    }
}