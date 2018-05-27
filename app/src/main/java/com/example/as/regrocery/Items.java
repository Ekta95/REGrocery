package com.example.as.regrocery;

public class Items {
    private String item;
    private int id;
    private int quant;
 public Items(String item,int quant){
     this.item=item;
     this.quant=quant;
 }

  public String getItem(){
        return item;
    }
    public void setItem(String item){
        this.item=item;
    }
    public int getId(){return id;}
    public void setId(int id){
     this.id=id;

    }
    public int getQuant(){
     return quant;
    }
    public void setQuant(int quant){
     this.quant=quant;
    }
}
