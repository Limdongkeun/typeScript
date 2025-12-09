package org.example.pattern.creational.Factory;

import org.example.pattern.creational.Factory.buttons.Button;
import org.example.pattern.creational.Factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog{

  @Override
  public Button createButton() {
    return new HtmlButton();
  }
}
