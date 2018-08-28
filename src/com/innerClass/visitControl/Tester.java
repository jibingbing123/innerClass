package com.innerClass.visitControl;

/**
 * 成员内部类分为实例内部类和静态内部类
 * 如果不希望客户程序访问成员内部类,外部类可以将内部类设置为private,这样Tester类就不能使用Outer.InnerTool来访问内部类了
 * 该例的内部类没有用static修饰,属于实例内部类,在创建内部类的实例时,外部类的实例必须已经存在
 * 实力内部类自动持有外部类的引用,在内部类中可以直接访问外部类的成员变量和成员方法——这是因为当内部类实例存在时,外部类的实例必定存在
 * Created by jibingbing on 2017/12/22.
 */
public class Tester {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.add(1,2,3);

        //Tester类是Outer和内部类的客户类,如果要在客户类中使用内部类,必须要使用它的完整类名Outer.InnerTool
        Outer.InnerTool tool = new Outer().new InnerTool();
    }

}

class Outer{
    public class InnerTool {
        public int add(int a,int b){
            return a + b;
        }
    }

    private InnerTool innerTool = new InnerTool();

    public void add(int a,int b,int c){
        System.out.println(innerTool.add(innerTool.add(a,b),c));
    }
}
