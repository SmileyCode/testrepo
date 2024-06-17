public class Human {
    private String name;
    private Integer height;

    public Human(String name, Integer height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        if (height < 0) {
            height = height * -1;
        }
        this.height = height;
    }

    private String printName() {
        return name + " имеет рост " + height + " см";
    }

    public String printPublic() {
        return printName();
    }
}
