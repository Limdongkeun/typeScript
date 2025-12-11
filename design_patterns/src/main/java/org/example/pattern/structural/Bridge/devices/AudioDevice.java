package org.example.pattern.structural.Bridge.devices;

public interface AudioDevice extends Device {
  void nextTrack();

  void prevTrack();

  String getCurrentTrack();
}