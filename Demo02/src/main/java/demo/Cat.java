package demo;

import java.util.Scanner;

public class Cat extends Animal {
    private String name;
    public Cat() {
        super();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Scanner in = new Scanner(System.in);
        this.name = in.nextLine();
    }
}
