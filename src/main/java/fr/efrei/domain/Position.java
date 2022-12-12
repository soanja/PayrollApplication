package fr.efrei.domain;


public class Position {
    private String positionCode;
    private boolean positionFilled;
    private String statusPosition;

    //default constructor
    private Position() {}

    //add another constructor later
    private Position(Builder builder){
        this.positionCode = builder.positionCode;
        this.positionFilled = builder.positionFilled;
        this.statusPosition = builder.statusPosition;
    }

    //getters but no setters, to have protected classes
    public String getPositionCode() {
        return positionCode;
    }

    public boolean isPositionFilled() {
        return positionFilled;
    }

    public String getStatusPosition() {
        return statusPosition;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionCode=" + positionCode +
                ", positionFilled=" + positionFilled +
                ", status position=" + statusPosition +
                '}';
    }

    //builder class = static inner class, copy the same attributes at the top
    public static class Builder {
        private String positionCode;
        private boolean positionFilled;
        private String statusPosition;

        //setters, not getters
        public Builder setPositionCode(String positionCode) {
            this.positionCode = positionCode;
            return this; //return the Builder object
        }

        public Builder setPositionFilled(boolean positionFilled) {
            this.positionFilled = positionFilled;
            return this; //return the Builder object
        }

        public Builder setStatusPosition(String statusPosition){
            this.statusPosition = statusPosition;
            return this;
        }

        public Builder copy(Position position){
            this.positionCode = position.positionCode;
            this.positionFilled = position.positionFilled;
            this.statusPosition = position.statusPosition;
            return this; //return the Builder object
        }

        //build a position object -- like copy constructor in C++
        public Position build() {
            return new Position(this);
        }
    }
}