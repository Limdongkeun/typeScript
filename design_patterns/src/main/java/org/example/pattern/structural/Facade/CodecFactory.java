package org.example.pattern.structural.Facade;

public class CodecFactory {
  public static Codec extracr(VideoFile file) {
    String type = file.getCodecType();
    if(type.equals("mp4")) {
      System.out.println("Creating MPEG4CompressionCodec");
      return new MPEG4CompressionCodec();
    } else {
      System.out.println("Creating OggCompressionCodec");
      return new OggCompressionCodec();
    }
  }
}
