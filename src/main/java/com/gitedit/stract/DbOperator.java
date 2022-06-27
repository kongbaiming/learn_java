package com.gitedit.stract;

/**
 * @author king
 * 模板方法模式(抽象方法)
 */
public abstract class DbOperator {
    public static void main(String[] args) {
        new MySql().process();
        new Oracle().process();
    }

    /**
     * 连接
     */
    public abstract void connection();

    public void open() {
        System.out.println("打开链接");
    }

    public void use() {
        System.out.println("使用数据库");
    }

    public void close() {
        System.out.println("关闭连接");
    }

    public void process() {
        connection();
        open();
        use();
        close();
    }
}
