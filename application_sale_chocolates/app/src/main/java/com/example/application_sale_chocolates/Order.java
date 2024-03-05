package com.example.application_sale_chocolates;

import java.util.HashMap;

public class Order {
    private int count;
    private int prise;
    private String userName;
    private HashMap<Integer, Integer> prise_hash;

    public Order(int count, int prise, String userName, HashMap<Integer, Integer> prise_hash) {
        this.count = count;
        this.prise = prise;
        this.userName = userName;
        this.prise_hash = prise_hash;
    }

    public Order() {
    }

    public int getCount() {
        return count;
    }

    public HashMap<Integer, Integer> getPrise_hash() {
        return prise_hash;
    }

    public String getUserName() {
        return userName;
    }

    public int getPrise() {
        return prise;
    }

    @Override
    public String toString() {
        return "Имя - " + userName + "\nВы покупаете " + prise_hash + "\nКолличество" + count + "\nСумма заказа" + prise;
    }
}
