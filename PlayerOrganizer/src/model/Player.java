package model;

import java.util.Objects;

public class Player {

  private String name;
  private String position;
  private int age;
  private String currentTeam;
  private int goalsScored;

  public Player() {
  }

  public Player(String name, String position, int age, String currentTeam, int goalsScored) {
    this.name = name;
    this.position = position;
    this.age = age;
    this.currentTeam = currentTeam;
    this.goalsScored = goalsScored;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCurrentTeam() {
    return currentTeam;
  }

  public void setCurrentTeam(String currentTeam) {
    this.currentTeam = currentTeam;
  }

  public int getGoalsScored() {
    return goalsScored;
  }

  public void setGoalsScored(int goalsScored) {
    this.goalsScored = goalsScored;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Player player = (Player) o;
    return name.equals(player.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return "Player{" +
        "name='" + name + '\'' +
        ", position='" + position + '\'' +
        ", age=" + age +
        ", currentTeam='" + currentTeam + '\'' +
        ", goalsScored=" + goalsScored +
        '}';
  }
}

