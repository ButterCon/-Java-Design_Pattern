package com.maizer2.Structural_Pattern.Composite.Prac05;

import java.util.*;


public class Composite extends Component {

    public HashMap<String, Composite> children = new HashMap<String, Composite>();

    public Composite(String name) {
        this.setName(name);
    }

    public void addNode(Composite folder) {
        String name = folder.getName();
        this.children.put(name, folder);
    }

    public void removeNode(Composite component) {
        String name = component.getName();
        this.children.remove(name);
    }

    public HashMap<String, Composite> isNode(Composite composite) {
        return this.children;
    }
}
