package org.example.pattern.structural.Bridge.speaker;

import org.example.pattern.structural.Bridge.devices.AudioDevice;
import java.util.ArrayList;
import java.util.List;

public class AirPod implements AudioDevice {
  private boolean on = false;
  private int volume = 50;
  private int currentTrackIndex = 0;
  private List<String> playlist;

  public AirPod() {
    playlist = new ArrayList<>();
    playlist.add("Track 1 - Song A");
    playlist.add("Track 2 - Song B");
    playlist.add("Track 3 - Song C");
  }

  @Override
  public boolean isEnabled() {
    return on;
  }

  @Override
  public void enable() {
    on = true;
  }

  @Override
  public void disable() {
    on = false;
  }

  @Override
  public int getVolume() {
    return volume;
  }

  @Override
  public void setVolume(int volume) {
    if (volume > 100) {
      this.volume = 100;
    } else if (volume < 0) {
      this.volume = 0;
    } else {
      this.volume = volume;
    }
  }

  // AirPod은 채널 대신 트랙 인덱스 사용
  @Override
  public int getChannel() {
    return currentTrackIndex;
  }

  @Override
  public void setChannel(int channel) {
    if (channel >= 0 && channel < playlist.size()) {
      currentTrackIndex = channel;
    }
  }

  @Override
  public void nextTrack() {
    currentTrackIndex = (currentTrackIndex + 1) % playlist.size();
  }

  @Override
  public void prevTrack() {
    currentTrackIndex = (currentTrackIndex - 1 + playlist.size()) % playlist.size();
  }

  @Override
  public String getCurrentTrack() {
    return playlist.get(currentTrackIndex);
  }

  @Override
  public void printStatus() {
    System.out.println("------------------------------------");
    System.out.println("| I'm AirPod.");
    System.out.println("| I'm " + (on ? "enabled" : "disabled"));
    System.out.println("| Current volume is " + volume + "%");
    System.out.println("| Now playing: " + getCurrentTrack());
    System.out.println("------------------------------------\n");
  }
}