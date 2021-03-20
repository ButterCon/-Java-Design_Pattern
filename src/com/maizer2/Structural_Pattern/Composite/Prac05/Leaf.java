package com.maizer2.Structural_Pattern.Composite.Prac05;


public class Leaf extends Component{

    private int price;

    public Leaf(String name) {
        this.setName(name);
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
