package com.designpatterns.PrototypePattern;

public class GreyColour extends Colour{
    public GreyColour() 
    { 
        this.colourName = "black"; 
    } 
   
    @Override
    void addColour()  
    { 
        System.out.println("Grey colour added"); 
    } 
}