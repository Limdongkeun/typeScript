package org.example.pattern.creational.Abstract.buttons;

public class WindowsButton implements Button{
  @Override
  public void paint() {
    System.out.println("Painting WindowsButton");
  }
}
