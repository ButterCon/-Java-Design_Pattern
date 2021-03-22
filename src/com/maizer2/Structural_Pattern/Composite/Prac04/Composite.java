package com.maizer2.Structural_Pattern.Composite.Prac04;

import java.util.*;


public class Composite extends Component {

    public HashMap<String, Component> children = new HashMap<String, Component>();

    public Composite(String name) {
        this.setName(name);
    }

    public void addNode(Component folder) {
        String name = folder.getName();
        this.children.put(name, folder);
    }

    public void removeNode(Component component) {
        String name = component.getName();
        this.children.remove(name);
    }

    public HashMap<String, Component> isNode(Component component) {
        return this.children;
    }
}
