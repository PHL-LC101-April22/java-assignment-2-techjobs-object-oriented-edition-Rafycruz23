package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField{

//    private int id;
//    private static int nextId = 1;
//    private String value;

    public PositionType() {
        super();
    }

    public PositionType(String value) {
        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

//    public String toString() {return value;}


    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType positionType = (PositionType) o;
        return getId() == positionType.getId();
    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }


//    @Override
//    public int hashCode() {
//        return Objects.hash(id, value);
//    }
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

}
