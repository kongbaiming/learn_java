package com.gitedit.inherit;

/**
 * @author king
 */
public class Computer {
    public static void main(String[] args) {
        Cpu cpu = new Cpu();
        Memory mem = new Memory();
        cpu.cal();
        mem.store();
    }
}
