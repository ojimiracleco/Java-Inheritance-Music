class Music {
    void play() {
        System.out.println("Music is playing");
    }
}

class Afrobeat extends Music {
    void dance() {
        System.out.println("People are dancing to Afrobeat");
    }
}

class Amapiano extends Afrobeat {
    void vibe() {
        System.out.println("Amapiano gives good vibes");
    }
}

class HipHop extends Music {
    void rap() {
        System.out.println("HipHop has rap lyrics");
    }
}

interface Instrument {
    void useInstrument();
}

class Gospel extends Music implements Instrument {
    public void useInstrument() {
        System.out.println("Gospel uses piano and drums");
    }

    void worship() {
        System.out.println("People worship with Gospel music");
    }
}

public class InheritanceMusic {
    public static void main(String[] args) {

        System.out.println("Single Inheritance:");
        Afrobeat a = new Afrobeat();
        a.play();
        a.dance();

        System.out.println();

        System.out.println("Multilevel Inheritance:");
        Amapiano am = new Amapiano();
        am.play();
        am.dance();
        am.vibe();

        System.out.println();

        System.out.println("Hierarchical Inheritance:");
        HipHop h = new HipHop();
        h.play();
        h.rap();

        System.out.println();

        System.out.println("Multiple Inheritance:");
        Gospel g = new Gospel();
        g.play();
        g.useInstrument();
        g.worship();
    }
}