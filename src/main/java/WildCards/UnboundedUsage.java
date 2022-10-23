package WildCards;

import java.util.ArrayList;
import java.util.List;

public class UnboundedUsage {
    public static void main(String[] args) throws ClassNotFoundException {

        // Its only safe to add null to a List<?>
        List<?> wildcards = new ArrayList<>();
        wildcards.add(null);
        System.out.println(wildcards);
    }

}
