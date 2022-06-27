package com.gitedit.stract;

/**
 * @author king
 */
public class MySql extends DbOperator {
    /**
     * 连接
     */
    @Override
    public void connection() {
        System.out.println("建立MySQL连接");
    }
}
