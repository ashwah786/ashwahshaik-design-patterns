package com.designpatterns.PrototypePattern;

public class BlackColour extends Colour{
	public BlackColour()  
    { 
        this.colourName = "blue"; 
    } 
   
    @Override
    void addColour()  
    { 
        System.out.println("Black colour added"); 
    } 
}