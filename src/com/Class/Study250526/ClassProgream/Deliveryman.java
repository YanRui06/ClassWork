package com.Class.Study250526.ClassProgream;

public class Deliveryman extends Persion implements Delivery {

    public Deliveryman(String name, String job) {
        super(name, job);
    }
    @Override
    public void delivery(Order order) {
        order.setState("配送中");
        order.setPerson(this);
        System.out.println("配送员 " + getName() + " 正在配送订单 " + order.getId());

    }

    @Override
    public void interoduction() {
        System.out.println("{姓名：" + getName() + "，职业：" + getJob() + "}");
    }
}
