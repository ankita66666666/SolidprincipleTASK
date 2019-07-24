package com.stackroute;

class LightBulb {

    boolean bulbstate;

    //Changes the state of the bulb to on if the bulb is turned
// off
    void turnOn() {
        if (bulbstate == false) {
            bulbstate = true;
        }
    }

    void displaylightbulb() {
        if (bulbstate == true)
        {
            System.out.println("The lightbuld is on");
        }
        else {
            System.out.println("The lightbulb is off");
        }
    }
    public static void main (String args[]) {
        LightBulb m = new LightBulb();

        m.bulbstate = false;
        m.displaylightbulb();
        m.turnOn();
        m.displaylightbulb();
    }

}