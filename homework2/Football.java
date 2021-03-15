package com.company;

public class Football extends Ball{

    protected String m_brandName;

    @Override
    public void toss(){
        System.out.println("right now");
    }
    @Override
    public void bounce(){
        System.out.println("bla");
    }
}
