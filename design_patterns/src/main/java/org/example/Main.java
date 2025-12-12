package org.example;

import org.example.pattern.creational.Abstract.MacOSFactory;
import org.example.pattern.creational.Abstract.WindowsFactory;
import org.example.pattern.creational.Builder.*;
import org.example.pattern.creational.Factory.Dialog;
import org.example.pattern.creational.Factory.HtmlDialog;
import org.example.pattern.creational.Factory.WindowsDialog;
import org.example.pattern.creational.Prototype.shapes.Circle;
import org.example.pattern.creational.Singleton.Singleton;
import org.example.pattern.structural.Adapter.RoundHole;
import org.example.pattern.structural.Adapter.RoundPeg;
import org.example.pattern.structural.Adapter.SquarePeg;
import org.example.pattern.structural.Adapter.SquarePegAdapter;
import org.example.pattern.structural.Bridge.devices.Device;
import org.example.pattern.structural.Bridge.devices.Radio;
import org.example.pattern.structural.Bridge.devices.Tv;
import org.example.pattern.structural.Bridge.remotes.AdvancedRemote;
import org.example.pattern.structural.Bridge.remotes.AudioRemote;
import org.example.pattern.structural.Bridge.remotes.BasicRemote;
import org.example.pattern.structural.Bridge.speaker.AirPod;
import org.example.pattern.structural.Decotators.*;
import org.example.pattern.structural.Facade.VideoConversionFacade;

import java.io.File;


public class Main {
  public static void main(String[] args) {

    //cerational pattern
    //Abstract Factory Pattern
    System.out.println("Abstract Factory Pattern ------------------------------------------------------------------------------");

    MacOSFactory macOsFactory = new MacOSFactory();
    macOsFactory.createButton().paint();
    macOsFactory.createCheckbox().paint();
    WindowsFactory windosFactory = new WindowsFactory();
    windosFactory.createButton().paint();
    windosFactory.createCheckbox().paint();

    //Builder Pattern
    System.out.println("\n"+"Builder Pattern ------------------------------------------------------------------------------");
    Director director = new Director();
    // 1. Car 만들기
    CarBuilder carBuilder = new CarBuilder();
    director.constructSportsCar(carBuilder);
    Car sportsCar = carBuilder.getResult();
    System.out.println("=== Engine 테스트 ===");
    System.out.println("시동 상태: " + sportsCar.getEngine().isStarted());  // false

    sportsCar.getEngine().on();  // 시동 켜기
    System.out.println("시동 ON 후: " + sportsCar.getEngine().isStarted());  // true

    sportsCar.getEngine().go(100);  // 100km 주행
    System.out.println("주행거리: " + sportsCar.getEngine().getMileage());  // 100.0

    sportsCar.getEngine().off();  // 시동 끄기
    System.out.println("시동 OFF 후: " + sportsCar.getEngine().isStarted());  // false

    // 3. TripComputer로 상태 확인
    TripComputer tripComputer = sportsCar.getTripComputer();

    sportsCar.getEngine().on();
    tripComputer.showStatus();  // "Car is started"

    sportsCar.getEngine().off();
    tripComputer.showStatus();  // "Car isn't started"

    // 4. 시동 안 켜고 주행하면 에러!
    // engine.go(50);  // IllegalStateException: Engine is off
    System.out.println("Car Type: " + sportsCar.getCarType());
    System.out.println("Seats: " + sportsCar.getSeats());

    // 2. Manual 만들기 (같은 설정으로 매뉴얼 생성)
    CarManualBuilder manualBuilder = new CarManualBuilder();
    director.constructSportsCar(manualBuilder);
    Manual sportsManual = manualBuilder.getResult();
    System.out.println(sportsManual.print());

    // 3. Director 없이 직접 빌드도 가능
    CarBuilder customBuilder = new CarBuilder();
    customBuilder.setCarType(CarType.CITY_CAR);
    customBuilder.setSeats(4);
    customBuilder.setEngine(new Engine(1.6, 0));
    customBuilder.setTransmission(Transmission.AUTOMATIC);
    Car customCar = customBuilder.getResult();

    //Factory Pattern
    System.out.println("Factory Pattern ------------------------------------------------------------------------------");
    // Factory Method Pattern
    Dialog dialog;

    // 환경에 따라 다른 Dialog 선택
    String os = System.getProperty("os.name").toLowerCase();
    if (os.contains("win")) {
      dialog = new WindowsDialog();
    } else {
      dialog = new HtmlDialog();
    }

    // 어떤 Dialog든 같은 방식으로 사용
    dialog.renderWindow();  // 내부에서 알아서 맞는 Button 생성


    //Prototype Pattern
    System.out.println("\n"+"Prototype Pattern ------------------------------------------------------------------------------");
    // 원본 생성
    Circle circle = new Circle();
    circle.x = 10;
    circle.y = 20;
    circle.color = "red";
    circle.radius = 15;

    System.out.println(circle.toString());

    // 복제
    Circle clonedCircle = (Circle) circle.clone();





    // 둘은 다른 객체지만 같은 값
    // 항상 다른 객체 (주소가 다름)
    System.out.println(circle != clonedCircle);      // true (다른 객체)
    // 값 비교는 상황에 따라 다름
    System.out.println(circle.equals(clonedCircle)); // true (같은 값)
    clonedCircle.x = 30;
    clonedCircle.y = 40;
    clonedCircle.color = "blue";
    clonedCircle.radius = 30;
    System.out.println(clonedCircle.toString());
    System.out.println(circle.equals(clonedCircle)); // false (다른 값)

    //Singleton Pattern
    System.out.println("\n"+"Singleton Pattern ------------------------------------------------------------------------------");
    System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
        "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
        "RESULT:" + "\n");
    Singleton singleton = Singleton.getInstance("FOO");
    Singleton anotherSingleton = Singleton.getInstance("BAR");
    System.out.println(singleton == anotherSingleton);
    System.out.println(singleton.value);
    System.out.println(anotherSingleton.value);
    singleton.value = "BAZ";
    System.out.println(singleton.value);

    //structural pattern
    //Adapter Pattern
    System.out.println("\n"+"Adapter Pattern ------------------------------------------------------------------------------");
    RoundHole hole = new RoundHole(5);
    RoundPeg peg = new RoundPeg(5);
    if (hole.fits(peg)) {
      System.out.println("Round peg r5 fits round hole r5.");
    }

    SquarePeg smallSqPeg = new SquarePeg(2);
    SquarePeg largeSqPeg = new SquarePeg(20);

    // Adapter solves the problem.
    SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
    SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

    if (hole.fits(smallSqPegAdapter)) {
      System.out.println("Square peg w2 fits round hole r5.");
    }
    if (!hole.fits(largeSqPegAdapter)) {
      System.out.println("Square peg w20 does not fit into round hole r5.");
    }

    //Bridge Pattern
    System.out.println("\n"+"Bridge Pattern ------------------------------------------------------------------------------");

    // TV와 BasicRemote 조합
    Device tv = new Tv();
    BasicRemote basicRemote = new BasicRemote(tv);

    System.out.println("=== TV + BasicRemote ===");
    basicRemote.power();       // TV 켜기
    basicRemote.volumeUp();    // 볼륨 +10
    basicRemote.volumeUp();    // 볼륨 +10
    basicRemote.channelUp();   // 채널 +1
    tv.printStatus();

    // Radio와 AdvancedRemote 조합
    Device radio = new Radio();
    AdvancedRemote advancedRemote = new AdvancedRemote(radio);

    System.out.println("=== Radio + AdvancedRemote ===");
    advancedRemote.power();    // Radio 켜기
    advancedRemote.volumeUp(); // 볼륨 +10
    advancedRemote.volumeUp(); // 볼륨 +10
    advancedRemote.mute();     // AdvancedRemote만의 기능: 음소거
    radio.printStatus();

    // 같은 리모컨으로 다른 기기 조작 가능 (Bridge의 핵심!)
    System.out.println("=== 같은 BasicRemote로 Radio 조작 ===");
    BasicRemote radioBasicRemote = new BasicRemote(radio);
    radioBasicRemote.power();  // Radio 끄기 (켜져있으므로)
    radio.printStatus();

    // AirPod + AudioRemote 조합 (확장된 인터페이스)
    System.out.println("=== AirPod + AudioRemote ===");
    AirPod airPod = new AirPod();
    AudioRemote audioRemote = new AudioRemote(airPod);

    audioRemote.power();       // AirPod 켜기
    audioRemote.showCurrentTrack();  // 현재 트랙 표시
    audioRemote.nextTrack();   // 다음 트랙
    audioRemote.showCurrentTrack();
    audioRemote.nextTrack();   // 다음 트랙
    audioRemote.showCurrentTrack();
    audioRemote.prevTrack();   // 이전 트랙
    audioRemote.showCurrentTrack();
    audioRemote.volumeUp();    // 볼륨도 사용 가능 (Device 상속)
    airPod.printStatus();


    //Decorator Pattern
    System.out.println("\n"+"Decorator Pattern ------------------------------------------------------------------------------");
    String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
    DataSourceDecorator encoded = new CompressionDecorator(
        new EncryptionDecorator(
            new FileDataSource("/Users/limdongkeun/Desktop/STUDY/design_patterns/src/main/resources/OutoutDemo.txt")));
    encoded.writeData(salaryRecords);
    DataSource plain = new FileDataSource("/Users/limdongkeun/Desktop/STUDY/design_patterns/src/main/resources/OutoutDemo.txt");

    System.out.println("- Input ----------------");
    System.out.println(salaryRecords);
    System.out.println("- Encoded --------------");
    System.out.println(plain.readData());
    System.out.println("- Decoded --------------");
    System.out.println(encoded.readData());

    //Facade Pattern
    System.out.println("\n"+"Facade Pattern ------------------------------------------------------------------------------");
    VideoConversionFacade converter = new VideoConversionFacade();
    File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
  }
}

