package org.example.pattern.creational.Factory;

import org.example.pattern.creational.Factory.buttons.Button;
import org.example.pattern.creational.Factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog{

  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}
