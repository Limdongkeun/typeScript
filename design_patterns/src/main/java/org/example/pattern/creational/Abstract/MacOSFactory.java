package org.example.pattern.creational.Abstract;

import org.example.pattern.creational.Abstract.buttons.Button;
import org.example.pattern.creational.Abstract.buttons.MacOSButton;
import org.example.pattern.creational.Abstract.checkboxes.Checkbox;
import org.example.pattern.creational.Abstract.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
  @Override
  public Button createButton() {
    return new MacOSButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new MacOSCheckbox();
  }
}
