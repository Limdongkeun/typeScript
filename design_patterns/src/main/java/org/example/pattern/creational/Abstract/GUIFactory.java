package org.example.pattern.creational.Abstract;

import org.example.pattern.creational.Abstract.buttons.Button;
import org.example.pattern.creational.Abstract.checkboxes.Checkbox;

public interface GUIFactory {
  Button createButton();
  Checkbox createCheckbox();
}
