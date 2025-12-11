package org.example.pattern.structural.Bridge.remotes;

import org.example.pattern.structural.Bridge.devices.AudioDevice;

public class AudioRemote extends BasicRemote {
  private final AudioDevice audioDevice;

  public AudioRemote(AudioDevice device) {
    super(device);
    this.audioDevice = device;
  }

  public void nextTrack() {
    System.out.println("Remote: next track");
    audioDevice.nextTrack();
  }

  public void prevTrack() {
    System.out.println("Remote: previous track");
    audioDevice.prevTrack();
  }

  public void showCurrentTrack() {
    System.out.println("Now playing: " + audioDevice.getCurrentTrack());
  }
}