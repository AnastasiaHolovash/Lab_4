@SuppressWarnings("WeakerAccess")

public class Student {
    private String name;
    private int age;
    private String city;
    private String faculty;
    private String group;

    public Student(String name, int age, String city, String faculty, String group) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.faculty = faculty;
        this.group = group;
    }

    //@Override
    public String toString() {
        return "name: " + name + "\t\t" +
                " age: " + age + "\t\t" +
                " city: " + city + "\t\t" +
                " faculty: " + faculty + "\t\t" +
                " group: " + group;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGroup() {
        return group;
    }

}
