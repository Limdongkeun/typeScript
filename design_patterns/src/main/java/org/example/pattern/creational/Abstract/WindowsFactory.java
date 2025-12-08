package org.example.pattern.creational.Abstract;

import org.example.pattern.creational.Abstract.buttons.Button;
import org.example.pattern.creational.Abstract.buttons.WindowsButton;
import org.example.pattern.creational.Abstract.checkboxes.Checkbox;
import org.example.pattern.creational.Abstract.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new WindowsCheckbox();
  }
}
