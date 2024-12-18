import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Character> characters = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        notifyObservers(character);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers(Character character) {
        for (Observer obs : observers) {
            obs.update(character);
        }
    }

    public void characterAttack(Character attacker, Character target) {
        if (characters.contains(attacker) && characters.contains(target)) {
            attacker.attack(target);
        } else {
            System.out.println("Один з персонажів відсутній на арені");
        }
    }
}
