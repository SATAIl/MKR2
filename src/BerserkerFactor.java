public class BerserkerFactor implements CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Berserker(name);
    }
}
