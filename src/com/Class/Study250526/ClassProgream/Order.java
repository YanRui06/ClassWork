package com.Class.Study250526.ClassProgream;

public class Order {
    //订单编号
    private String id;
    //订单状态
    private String state;
    //订单对应的处理人
    private Persion persion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Persion getPersion() {
        return persion;
    }

    public void setPerson(Persion persion) {
        this.persion = persion;
    }

    public Order(String id, String state) {
        this.id = id;
        this.state = state;
    }

    public Order() {
    }

    public void orderInfo() {
        System.out.println("订单编号：" + this.id + ",订单状态：" + this.state);
    }
}
