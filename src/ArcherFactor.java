public class ArcherFactor implements CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Archer(name);
    }
}
