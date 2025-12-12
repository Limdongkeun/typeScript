package org.example.pattern.structural.Decotators;

public abstract class DataSourceDecorator implements DataSource{

  protected DataSource wrappee;

  DataSourceDecorator(DataSource source) {
    this.wrappee = source;
  }

  @Override
  public void writeData(String data) {
    wrappee.writeData(data);
  }

  @Override
  public String readData() {
    return wrappee.readData();
  }
}
