package org.example.pattern.structural.Decotators;

public interface DataSource {
  void writeData(String data);

  String readData();
}
