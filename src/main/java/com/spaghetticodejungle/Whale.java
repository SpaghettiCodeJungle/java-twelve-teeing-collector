package com.spaghetticodejungle;

public class Whale {
  private String name;
  private Integer length;
  private Integer weight;

  public Whale(String name, Integer length, Integer weight) {
    this.name = name;
    this.length = length;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Whale{" +
        "name='" + name + '\'' +
        ", length=" + length +
        ", weight=" + weight +
        '}';
  }
}
