package com.codecool.oopws3;

public abstract class Animal {
    private String name;
    private Boolean isMale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    public Animal(String name, Boolean isMale){
        this.name=name;
        this.isMale=isMale;
    }
//     public String feed(){
//        speak();
//        return "";
//     }
//
//     public void speak(){
//         System.out.println("niam niam");
//     }
     public void feed(){
         System.out.println("niam niam");
         speak();
     }

    public abstract void speak();
}
