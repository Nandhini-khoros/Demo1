package com.lambda;
//package com.Company;
interface phone
{
    void call();
    default void message()
    {
        System.out.println("hello");
    }
}
public class Demo implements phone{
    public void call() {
        System.out.println("hi");
    }
    public static void main(String[] args) {
	    phone p=new Demo();
	    p.call();
	    p.message();
    }
}
