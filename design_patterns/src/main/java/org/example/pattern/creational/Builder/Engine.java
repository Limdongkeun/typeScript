package org.example.pattern.creational.Builder;

public class Engine {
  private final double volume;
  private double mileage;
  private boolean started;

  public Engine(double volume, double mileage) {
    this.volume = volume;
    this.mileage = mileage;
  }

  public void on() {
    started = true;
  }

  public void off() {
    started = false;
  }

  public void go(double mileage) {
    if (started) {
      this.mileage += mileage;
    } else {
      throw new IllegalStateException("Engine is off");
    }
  }

  public double getVolume() {
    return volume;
  }

  public double getMileage() {
    return mileage;
  }

  public boolean isStarted() {
    return started;
  }
}
