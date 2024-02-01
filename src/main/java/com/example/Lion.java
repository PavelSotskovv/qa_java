package com.example;

import java.util.List;

public class Lion {

    private String sex;
    boolean hasMane;
    Feline feline;

 //   public Lion(Feline feline, String sex){
 //       this.feline = feline;
 //       this.sex = sex;
 //   }
    public Lion(Feline feline, String sex) throws Exception {
        this.feline = feline;
        this.sex = sex;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.eatMeat();
    }
}
