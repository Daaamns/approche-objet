package encapsulation;

import java.util.Date;

public abstract class Operation {
    String date;
    double mount;

    public Operation(String date, double mount) {
        this.date = date;
        this.mount = mount;
    }

    public abstract String getType();
}
