package TMS.Task1;

public class Main {
    public static void main(String[] args) {
        Position director = new Director();
        Position worker = new Worker();
        Position accountant = new Accountant();

        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}
