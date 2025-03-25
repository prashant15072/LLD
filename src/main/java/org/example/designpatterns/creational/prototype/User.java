package org.example.designpatterns.creational.prototype;

public class User implements ProtoType{

    private final String id;
    private final String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public ProtoType clone() {
        return new User(this.id, this.name);
    }
}
