package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Animals {
    private static final AtomicInteger counter = new AtomicInteger(1);
    private int id;
    private String type;
    private String name;
    private LocalDate birthday;
    private List<String> commands = new ArrayList<>();

    public Animals(String type, String name, LocalDate birthday, List<String> commands) {
        this.id = counter.getAndIncrement();
        this.type = type;
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "Animals " + getClass() + "[id=" + id + ", type=" + type + ", name=" + name + ", birthday="
                + birthday + ", commands="
                + commands + "]";
    }

}