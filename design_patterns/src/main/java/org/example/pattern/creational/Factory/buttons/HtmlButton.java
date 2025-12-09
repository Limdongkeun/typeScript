package org.example.pattern.creational.Factory.buttons;

public class HtmlButton implements Button{

  @Override
  public void render(){
    System.out.println("Rendering HTML Button");
    onClick();
  }

  public void onClick(){
    System.out.println("Click! Button says - 'Hello World!'");
  }
}
