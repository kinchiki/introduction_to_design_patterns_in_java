package ch04.idcard;

import ch04.framework.*;
import java.util.ArrayList;

public class IDCardFactory extends Factory {
    private ArrayList<String> owners = new ArrayList<>();

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public ArrayList<String> getOwners() {
        return owners;
    }
}
