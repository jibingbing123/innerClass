package com.innerClass.visitControl;

/**
 * Created by jibingbing on 2017/12/23.
 */
public class AnotherOuter {
    private String name;

    public static void main(String[] args) {
        Inner inner = new AnotherOuter().new Inner();
        inner.showName();
    }

    public class Inner {
        private String name;

        void showName(){
            System.out.println(name);
        }
    }
}


