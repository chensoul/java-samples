package com.example.corejava.oom;

/**
* VM Args：-Xss128k   StackOverflowError
*/
public class StackSOF {
  private int stackLength = 1;
  public void stackLeak() {
    stackLength++;
    stackLeak();
  }
  public static void main(String[] args) throws Throwable {
    StackSOF oom = new StackSOF();
    try {
    	oom.stackLeak();
    } catch (Throwable e) {
    	System.out.println("stack length:" + oom.stackLength);
    	throw e;
    }
  }
}