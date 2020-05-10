package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import model.Player;

public class PlayerImpl {

  private static final String JOGADORES_ARQUIVE = "jogadores.txt";

  public boolean verifyFileExists(String path) {
    try {
      Optional<Scanner> file = Optional
          .ofNullable(new Scanner(new BufferedReader(new FileReader(path))));

      return file.isPresent();
    } catch (IOException e) {
      System.out.println("Não encontrou arquivo");
      return false;
    }
  }

  public List<Player> getPlayersList(String path) {
    List<String> lines = new ArrayList<>();
    try {
      Scanner scanner = new Scanner(new BufferedReader(new FileReader(path)));
      while (scanner.hasNext()) {
        lines.add(scanner.nextLine());
      }
    } catch (IOException e) {
      Logger.getLogger("Erro: ", e.getMessage());
    }
    List<Player> players = new ArrayList<>();

    lines.forEach(line -> {
      String[] info = line.split(",");
      players.add(new Player(info[0], info[1], Integer.parseInt(info[2]), info[3],
          Integer.parseInt(info[4])));
    });
    return players;
  }

  public void printPlayers(List<Player> players) {
    players.forEach(System.out::println);
  }

  public void printPlayersByTeam(List<Player> players, String team) {
    players.stream().filter(player -> player.getCurrentTeam().equalsIgnoreCase(team))
        .forEach(System.out::println);
  }

  public void printPlayersGoalsGreaterThenTenByTeam(List<Player> players, String team) {
    players.stream().filter(
        player -> player.getCurrentTeam().equalsIgnoreCase(team) && player.getGoalsScored() > 10)
        .forEach(System.out::println);
  }

  public void groupPlayersByTeam(List<Player> players) {
    players.stream().sorted(Comparator.comparing(Player::getCurrentTeam))
        .forEach(System.out::println);
  }

  public double calculatePlayersAverageAge(List<Player> players) {
    return players.stream().mapToInt(Player::getAge).average().getAsDouble();
  }

  public void printOldierPlayer(List<Player> players) {
    Player olderPlayer = players.stream().max(Comparator.comparing(Player::getAge)).get();
    System.out.println("Older player: " + olderPlayer.getAge());
  }

  public void printYoungerPlayer(List<Player> players) {
    Player youngerPlayer = players.stream().min(Comparator.comparing(Player::getAge)).get();
    System.out.println("Younger player: " + youngerPlayer.getAge());
  }

  public void printTopScorer(List<Player> players) {
    Optional<Player> scorePlayer = Optional.ofNullable(players)
        .orElseThrow(() -> new IllegalArgumentException("No player created!")).stream()
        .max(Comparator.comparing(Player::getGoalsScored));
    System.out
        .printf("Player with top score: %s with score = %s\n", scorePlayer.orElse(null).getName(),
            scorePlayer.orElse(null).getGoalsScored());
  }

  public int printScoreSum(List<Player> players) {
    return players.stream().mapToInt(Player::getGoalsScored).sum();
  }

  public void groupByTeam(List<Player> players) {
    Map<String, List<Player>> groupedPlayers = players.stream()
        .collect(Collectors.groupingBy(Player::getCurrentTeam));
    System.out.println(groupedPlayers);
  }

  public void orderPlayersByScore(List<Player> players) {
    players.stream().sorted(Comparator.comparingInt(Player::getGoalsScored))
        .forEach(System.out::println);
  }
}
