package com.designpatterns.patterns;

/**
 * Hello world!
 *
 */
////import AdapterPattern.*
////import BridgePattern.*;
//import CommandPattern.*;
//import PrototypePattern.*;
//import TemplatePattern.*;
//import SIngletonPattern.*;
import java.io.*;
import java.util.*;

import com.designpatterns.AdapaterPattern.DriverAdapter;
import com.designpatterns.BridgePattern.DrawBridge;
import com.designpatterns.CommandPattern.DriverCommand;
import com.designpatterns.PrototypePattern.DriverPrototype;
import com.designpatterns.SingletonPattern.DriverSingleton;
import com.designpatterns.TemplatePattern.DriverTemplate;
public class App 
{
    @SuppressWarnings("UnUsed")
	public static void main( String[] args )
    {
        DriverAdapter adapter_pattern = new DriverAdapter();
        DrawBridge bridge_pattern = new DrawBridge();
        DriverCommand command_pattern = new DriverCommand();
        DriverPrototype prototype_pattern = new DriverPrototype();
        DriverSingleton singleton_pattern = new DriverSingleton();
        DriverTemplate template_pattern = new DriverTemplate();
        
    }
}