package encapsulation;

import java.util.Date;

public class Debit extends Operation{
    public Debit(String date, double mount) {
        super(date, mount);
    }

    @Override
    public String getType() {
        return "Debit";
    }
}
