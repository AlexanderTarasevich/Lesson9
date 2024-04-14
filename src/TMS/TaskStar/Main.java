package TMS.TaskStar;

public class Main {
    public static void main(String[] args) {
        Person originalPerson = new Person("Bob", 55);
        // Клонируем объект
        Person clonedPerson = (Person) originalPerson.clone();

        // Изменяем данные в клонированном объекте
        clonedPerson.setName("Мария");
        clonedPerson.setAge(25);

        // Выводим информацию обоих объектов
        System.out.println("Оригинальный объект:");
        originalPerson.printInfo();

        System.out.println("Клонированный объект:");
        clonedPerson.printInfo();


    }
}
