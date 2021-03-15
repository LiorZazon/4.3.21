package com.company;

public class Baseball extends Ball{

    protected String m_brand_name;

    @Override
    public void bounce(){
        System.out.println("now");
    }
    @Override
    public void toss(){
        System.out.println("toss the ball to me");
    }
}
