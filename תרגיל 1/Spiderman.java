package com.company;

public class Spiderman extends Humanoid implements IClimb{

    protected double m_web_length;

    public Spiderman(String m_name, double m_web_length) {
        super(m_name);
        this.m_web_length = m_web_length;
    }

    @Override
    public void activateSpecialPower() {
        System.out.println("shoot web");

    }

    @Override
    public void climb() {
        System.out.println("climb walls");

    }
}
