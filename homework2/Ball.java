package com.company;

public class Ball implements Tossable{

    protected String m_brandName;

    public void getBrandName (String name){
        System.out.println(name = m_brandName);
    }

    public void bounce(){
        System.out.println("whatever");
    }
    @Override
    public void toss() {
        System.out.println("toss it as far as u can!");
    }
}
