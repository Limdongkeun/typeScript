package org.example.pattern.creational.Prototype.shapes;

public abstract class Shape {
  public int x;
  public int y;
  public String color;

  public Shape() {

  }

  public Shape(Shape target) {
    if( target != null) {
      this.x = target.x;
      this.y = target.y;
      this.color = target.color;
    }
  }

  public abstract Shape clone();

  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Shape)) return false;
    Shape shape2 = (Shape) obj;
    return shape2.x == x && shape2.y == y && shape2.color.equals(color);
  }

  @Override
  public String toString() {
    return String.format("(%d, %d) %s", x, y, color);
  }
}
