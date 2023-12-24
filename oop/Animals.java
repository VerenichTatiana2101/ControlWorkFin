import java.time.LocalDate;

public abstract class Animals{
    private int id;
    private String type;
    private String name;
    private LocalDate birthday;

    public Animals(int id, String type, String name, LocalDate birthday) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.birthday = birthday;
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

    @Override
    public String toString() {
        return "Animals [id=" + id + ", type=" + type + ", name=" + name + ", birthday=" + birthday + "]";
    }
    
}