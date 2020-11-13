package com.aniamadej.remotes;

import com.aniamadej.commands.Command;

public class SimpleRemoteController {
    private Command button1;
    private Command button2;
    private Command button3;
    private Command button4;
    private Command button5;

    public void setButton1(Command button1) {
        this.button1 = button1;
    }

    public void setButton2(Command button2) {
        this.button2 = button2;
    }

    public void setButton3(Command button3) {
        this.button3 = button3;
    }

    public void setButton4(Command button4) {
        this.button4 = button4;
    }

    public void setButton5(Command button5) {
        this.button5 = button5;
    }

    public void pressButton1(){
        button1.run();
    }

    public void pressButton2(){
        button2.run();
    }

    public void pressButton3(){
        button3.run();
    }

    public void pressButton4(){
        button4.run();
    }

    public void pressButton5(){
        button5.run();
    }
}
