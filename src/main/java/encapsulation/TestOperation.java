package encapsulation;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[8];

        operations[0] = new Credit("07/10/1997", 130.00);
        operations[1] = new Debit("07/10/1997", 180.00);
        operations[2] = new Credit("07/10/1997", 200.00);
        operations[3] = new Debit("07/10/1997", 400.00);
        operations[4] = new Credit("07/10/1997", 1000.00);
        operations[5] = new Debit("07/10/1997", 180.00);
        operations[6] = new Credit("07/10/1997", 140.00);
        operations[7] = new Debit("07/10/1997", 130.00);

        double result = 0.00;
        for (Operation operation : operations) {
            System.out.println(operation.getType());
            System.out.println(operation.date);
            System.out.println(operation.mount);
            if (operation.getType().equals("Credit")) {
                result += operation.mount;
            } else if (operation.getType().equals("Debit")) {
                result -= operation.mount;
            }
        }

        System.out.println("le resultat est : " +result);
    }
}
