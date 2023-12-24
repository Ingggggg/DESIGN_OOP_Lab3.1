public class MainProgram {
    public static void main(String[] args) {
        // IEmployee emp = new Employee();
        // emp.salary();

        // IManager manager = new Manager();
        // manager.salary();
        // manager.hire();
        // manager.train();
        // manager.addBonus();

        ICeo ceo = new CEO();
        ceo.salary();
        ceo.hire();
        ceo.train();
        ceo.addBonus();
        ceo.makeDecisions();
        ceo.addStocks();
    }
}
