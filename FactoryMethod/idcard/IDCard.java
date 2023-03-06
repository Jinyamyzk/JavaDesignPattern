package idcard;

import framework.Product;

public class IDCard extends Product {
    private String owner;
    private int sereal;

    IDCard(String owner, int sereal) {
        System.out.println(owner + "のカードを" + sereal +"番で作ります。");
        this.owner = owner;
        this.sereal = sereal;
    }

    @Override
    public void use() {
        System.out.println(this + "を使います。");
    }

    @Override
    public String toString() {
        return "[IDCard: " + owner + "]";
    }

    public String getOwner() {
        return owner;
    }

    public int getSereal() {
        return sereal;
    }
}
