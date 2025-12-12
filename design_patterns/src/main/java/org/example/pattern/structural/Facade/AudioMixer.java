package org.example.pattern.structural.Facade;

import java.io.File;

public class AudioMixer {
  public File fix(VideoFile videoFile) {
    System.out.println("AudioMixerL: fixing audio,,,,");
    return new File("tmp");
  }
}
