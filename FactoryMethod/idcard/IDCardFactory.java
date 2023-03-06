package idcard;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory {
    private int sereal = 100;

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, sereal);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "を登録しました。");
    }
}
