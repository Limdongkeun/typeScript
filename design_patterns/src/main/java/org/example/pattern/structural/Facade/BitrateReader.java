package org.example.pattern.structural.Facade;

public class BitrateReader {
  public static VideoFile read(VideoFile file, Codec codec) {
    System.out.println("BitrateReader: reading file...");
    return file;
  }

  public static VideoFile convert(VideoFile buffer, Codec codec) {
    System.out.println("BitrateReader: converting file...");
    return buffer;
  }
}
