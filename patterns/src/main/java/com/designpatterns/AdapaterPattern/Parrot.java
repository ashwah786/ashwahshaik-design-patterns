package com.designpatterns.AdapaterPattern;

class Parrot implements Bird 
{ 
    public void fly(){ 
        System.out.println("Flying..."); 
    } 
    public void makeSound() 
    { 
        System.out.println("Chip...Chip...."); 
    } 
} 