
package com.inheritence.multiple;

class Sport {
    public void athleteSport(int time) {
        System.out.println("Sport duration: " + time + " minutes");
    }
}

class Cricket extends Sport {
    @Override
    public void athleteSport(int time) {
        System.out.println("Cricket duration: " + time + " minutes");
    }
}

class Football extends Sport {
    @Override
    public void athleteSport(int time) {
        System.out.println("Football duration: " + time + " minutes");
    }
}

public class Driver {
    public static void main(String[] args) {

        Sport s = new Sport();
        Cricket c = new Cricket();
        Football f = new Football();

        s.athleteSport(60);
        c.athleteSport(90);
        f.athleteSport(45);
    }
}
