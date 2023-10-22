package org.example.Dao;

public class DaoImpl implements IDao{
    @Override
    public double getData(){
        double data=50;
        System.out.println("data : ");
        return data;
    }
}
