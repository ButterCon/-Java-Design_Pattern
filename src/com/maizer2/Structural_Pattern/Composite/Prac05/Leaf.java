package com.maizer2.Structural_Pattern.Composite.Prac05;


public class Leaf extends Component {

    private String data;

    public Leaf(String name) {
        this.setName(name);
    }

    public String getData() {
        return this.data;
    }

    public void setData(String date) {
        this.data = date;
    }
}
