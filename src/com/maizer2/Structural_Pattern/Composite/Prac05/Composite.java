package com.maizer2.Structural_Pattern.Composite.Prac05;

import java.util.*;


public class Composite extends Component {

    public List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        this.setName(name);
    }

    public void addNode(Component folder) {
        String name = folder.getName();
        this.children.get(String) = folder;
    }
}
