//package fr.efrei.domain;

import java.io.Serializable;
import java.util.Objects;

public class Race {
    private String id;
    private String description;

    //default constructor
    private Race() {}

    //add another constructor later -- KEEP PRIVATE CONSTRUCTORS
    private Race(Builder builder){
        this.id = builder.id;
        this.description = builder.description;
    }

    //getters but no setters, to have protected classes. NO SETTERS => IMMUTABILITY
    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return Objects.equals(id, race.id) && Objects.equals(description, race.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }


    @Override
    public String toString() {
        return "Race{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    //builder class = static inner class, copy the same attributes at the top
    //              = build your object
    public static class Builder {
        private String id;
        private String description;

        //setters, not getters
        public Builder setId(String id) {
            this.id = id;
            return this; //return the Builder object
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this; //return the Builder object
        }

        public Builder copy(Race race){
            this.id = race.id;
            this.description = race.description;
            return this; //return the Builder object
        }

        //build a race object -- like copy constructor in C++
        public Race build() {
            return new Race(this);
        }
    }

}
