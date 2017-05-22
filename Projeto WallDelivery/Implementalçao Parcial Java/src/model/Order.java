package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Order implements Serializable{
    
    private String client;
    private Date date;
    private double totalValue;
    private ArrayList<Item> items;
}
