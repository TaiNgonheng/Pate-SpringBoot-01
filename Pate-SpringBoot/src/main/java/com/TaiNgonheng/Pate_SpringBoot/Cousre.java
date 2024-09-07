package com.TaiNgonheng.Pate_SpringBoot;

public class Cousre {
    private long id;
    private String name;
    private String author;

    public Cousre(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return author;
    }

    @Override
    public String toString() {
        return "Cousre{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                ", type='" + author + '\'' +
                '}';
    }
}
