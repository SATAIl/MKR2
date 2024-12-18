package MKR2;
public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena();
        arena.addObserver(new PlayerObserve("Player1"));
        arena.addObserver(new PlayerObserve("Player2"));

        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactor();
        CharacterFactory berserkerFactory = new BerserkerFactor();

        Character warrior = warriorFactory.createCharacter("Борис");
        Character mage = mageFactory.createCharacter("Мерлін");
        Character archer = archerFactory.createCharacter("Робін");
        Character berserker = berserkerFactory.createCharacter("Беовульф");

        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);
        arena.addCharacter(berserker);

        warrior.move(1, 1);
        mage.move(2, 2);
        archer.move(3, 1);
        berserker.move(4, 1);

        arena.characterAttack(warrior, mage);
        arena.characterAttack(archer, warrior);
        arena.characterAttack(berserker, mage);
    }
}