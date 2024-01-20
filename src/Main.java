import all.*;
import interfaces.*;

public class Main {

    public static void main(String[] args) throws NotFlopableException {

        Person alice = new Person("Алиса");
        Person rabbit = new Person("Белый Кролик");
        House house = new House("Дом");
        Thoughts thoughts = new Thoughts("Мысли");

        thoughts.addAdjective(enumThoughts.right);
        thoughts.addAdjective(enumThoughts.late);
        alice.grewUp();
        alice.gotUp(partsBody.knees);
        alice.lay(house.floor);
        alice.leanedOn(partsBody.elbows, house.door);
        alice.putIn(partsBody.arms);
        alice.grewUp();
        alice.StickedOut(partsBody.arms, house.window);
        alice.placedIn(partsBody.legs, house.fireplace);

        Sounds.TrahSound.play();
        Sounds.BdyshSound.play();
        alice.flopped(Subjects.LEAVES,Subjects.BRUSHWOOD);
        alice.trauma = false;
        alice.getTrauma();
        alice.gotUp(partsBody.legs);
        alice.looked(Directions.UP);
        Runnable runnable = () -> System.out.println("Было темно");
        Runnable runnable2 = () -> System.out.println("Тоннель впереди");
        runnable.run();
        runnable2.run();
        rabbit.flashed();
        rabbit.runAway();


    }
}
