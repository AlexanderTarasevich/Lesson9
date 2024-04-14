package TMS.TaskStar;

class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Переопределение метода clone()
    @Override
    public Object clone() {

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }


    }

    public void printInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

}