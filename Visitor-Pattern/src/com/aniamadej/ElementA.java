package com.aniamadej;

public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void doSomething(){
        System.out.println("and calling method doSomething()");
    }
}
