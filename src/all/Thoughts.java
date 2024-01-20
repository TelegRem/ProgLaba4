package all;

import interfaces.intThoughts;


public class Thoughts extends absCharacter implements intThoughts {


    public Thoughts(String name) {
        super(name);
    }

    @Override
    public void addAdjective(enumThoughts type) {
        switch (type) {
            case right:
                System.out.println(this.getName() + " были правильными");
                break;
            case late:
                System.out.println(this.getName() + " были запоздалыми");
                break;

        }
    }
}
