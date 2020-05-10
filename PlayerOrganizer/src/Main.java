import controller.PlayerImpl;
import java.util.List;
import model.Player;

public class Main {

  public static void main(String[] args) {
    PlayerImpl playerImpl = new PlayerImpl();
     final String ARQUIVE = "src/jogadores.txt";
    List<Player> playersList;

    if (playerImpl.verifyFileExists(ARQUIVE)){
      playersList = playerImpl.getPlayersList(ARQUIVE);
      playerImpl.orderPlayersByScore(playersList);
    }


  }
}
