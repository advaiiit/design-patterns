package builderpattern;

public class Phone {
  String os;
  String processor;
  double screenSize;
  int battery;
  int camera;

  public Phone(String os, String processor, double screenSize, int battery, int camera) {
    this.os = os;
    this.processor = processor;
    this.screenSize = screenSize;
    this.battery = battery;
    this.camera = camera;
  }

  @Override
  public String toString() {
    return "{os=" + os + ", processor=" + processor + ", screenSize=" + screenSize +
        ", battery=" + battery + ", camera=" + camera + "}";
  }
}
