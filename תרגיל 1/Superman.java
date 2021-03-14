package com.company;

public class Superman extends Humanoid implements IFireLaser {

    protected long m_flight_speed;

    public Superman(String m_name, long m_flight_speed) {
        super(m_name);
        this.m_flight_speed = m_flight_speed;
    }

    @Override
    public void activateSpecialPower(){
        System.out.println("activated");
    }

    public void fireLaser(){
        System.out.println("fire lasers activated");
    }
}
