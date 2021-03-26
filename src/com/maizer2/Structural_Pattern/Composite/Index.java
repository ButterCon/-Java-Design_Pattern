package com.maizer2.Structural_Pattern.Composite;


import com.maizer2.Structural_Pattern.Composite.Prac05.*;
import java.util.*;


public class Index {

    public void run() {
       Composite root = new Composite("root");
       Composite home = new Composite("home");
       Composite hojin = new Composite("hojin");
       Composite jiny = new Composite("jiny");
       Composite users = new Composite("user");
       Composite temp = new Composite("temp");

       Leaf img1 = new Leaf("img1");
       Leaf img2 = new Leaf("img2");
       Leaf img3 = new Leaf("img3");
       Leaf img4 = new Leaf("img4");

       root.addNode(home);
       root.addNode(users);

       users.addNode(hojin);
       hojin.addNode(img1);
       hojin.addNode(img2);
       hojin.addNode(img3);
       hojin.addNode(img4);

       users.addNode(jiny);
       root.addNode(temp);
    }

    public void tree(Composite composite) {
      HashMap<String, Composite> arr = composite.children;

     arr.forEach((key, value) -> {
        if (value instanceof Composite) {
            System.out.println("Folder = " + key);

            if (value.)
        }
     });

   }
}
