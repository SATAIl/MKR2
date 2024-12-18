public class MageFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Mage(name);
    }
}
