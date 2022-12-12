package za.cput.domain;

public class Position {
    private int positionCode;
    private boolean positionFilled;

    //default constructor
    public Position() {}

    //add another constructor later
    private Position(Builder builder){
        this.positionCode = builder.positionCode;
        this.positionFilled = builder.positionFilled;
    }

    //getters but no setters, to have protected classes
    public int getPositionCode() {
        return positionCode;
    }

    public boolean isPositionFilled() {
        return positionFilled;
    }


    @Override
    public String toString() {
        return "Position{" +
                "positionCode=" + positionCode +
                ", positionFilled=" + positionFilled +
                '}';
    }

    //builder class = static inner class, copy the same attributes at the top
    public static class Builder {
        private int positionCode;
        private boolean positionFilled;

        //setters, not getters
        public Builder setPositionCode(int positionCode) {
            this.positionCode = positionCode;
            return this; //return the Builder object
        }

        public Builder setPositionFilled(boolean positionFilled) {
            this.positionFilled = positionFilled;
            return this; //return the Builder object
        }

        public Builder copy(Position position){
            this.positionCode = position.positionCode;
            this.positionFilled = position.positionFilled;
            return this; //return the Builder object
        }

        //build a position object -- like copy constructor in C++
        public Position build() {
            return new Position(this);
        }
    }
}
