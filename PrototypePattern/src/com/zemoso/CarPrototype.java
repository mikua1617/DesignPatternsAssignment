package com.zemoso;

public abstract class CarPrototype implements Cloneable {

    public String carName;
    public int speed;

    abstract void runCar();

    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }


}
