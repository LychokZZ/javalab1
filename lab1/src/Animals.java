import java.util.Objects;


public class Animals {
    private String name;
    private String species;
    private int age;

    /**
     *
     * @param name    назва
     * @param species специфіка
     * @param age     вік
     */
    public Animals(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', species='" + species + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animal = (Animals) o;
        return age == animal.age &&
                name.equals(animal.name) &&
                species.equals(animal.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, species, age);
    }
}

