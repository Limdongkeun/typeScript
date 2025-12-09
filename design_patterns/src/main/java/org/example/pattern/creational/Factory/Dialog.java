package org.example.pattern.creational.Factory;

import org.example.pattern.creational.Factory.buttons.Button;

public abstract class Dialog {
  public void renderWindow() {

    Button okButton = createButton();
    okButton.render();
  }

  public abstract Button createButton();
}
