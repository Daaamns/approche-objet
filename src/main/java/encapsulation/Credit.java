package encapsulation;

import java.util.Date;

public class Credit extends Operation {
    public Credit(String date, double mount) {
        super(date, mount);
    }

    @Override
    public String getType() {
        return "Credit";
    }
}
