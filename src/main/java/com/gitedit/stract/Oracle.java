package com.gitedit.stract;

/**
 * @author king
 */
public class Oracle extends DbOperator {
    /**
     * 连接
     */
    @Override
    public void connection() {
        System.out.println("oracle 建立连接");
    }
}
