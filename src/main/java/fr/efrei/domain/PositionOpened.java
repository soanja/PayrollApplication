package za.cput.domain;

public class PositionOpened extends Position {
    private boolean status;

    //default constructor
    private PositionOpened() {
        super();
    }

    //add another constructor later
    private PositionOpened(PositionOpened.Builder builder){
        this.status = builder.status;
    }


    //getters but no setters, to have protected classes
    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "PositionClosed{" +
                "status=" + status +
                '}';
    }


    //builder class = static inner class, copy the same attributes at the top
    public static class Builder {
        private boolean status;

        //setters, not getters
        public PositionOpened.Builder setStatus(boolean status) {
            this.status = status;
            return this; //return the Builder object
        }

        public PositionOpened.Builder copy(PositionOpened PositionClosed){
            this.status = PositionClosed.status;
            return this; //return the Builder object
        }

        //build a race object -- like copy constructor in C++
        public PositionOpened build() {
            return new PositionOpened(this);
        }
    }
}
