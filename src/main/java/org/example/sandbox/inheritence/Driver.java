package org.example.sandbox.inheritence;

public class Driver {

    public static void main(String[] args) {

        Jeep jeep = new Jeep();
        Wrangler wrangler = new Wrangler();

        jeep.gasMileage = 12.0;
        wrangler.gasMileage = 13.0;

        System.out.println(jeep.getGasMileage());
        System.out.println(wrangler.getGasMileage());

    }
}
