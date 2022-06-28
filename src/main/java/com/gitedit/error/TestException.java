package com.gitedit.error;

/**
 * @author king
 */
class IllegalAgeException extends Exception {
    // 默认无参构造器
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }
}