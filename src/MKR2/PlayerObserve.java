package MKR2;
public class PlayerObserve implements Observer {
    private String playerName;

    public PlayerObserve(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void update(Character character) {
        System.out.println("Player " + playerName + " отримав повідомлення: На арену додано персонажа " + character.getName());
    }
}
