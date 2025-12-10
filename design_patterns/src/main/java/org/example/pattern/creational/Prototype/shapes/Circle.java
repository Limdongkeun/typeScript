package org.example.pattern.creational.Prototype.shapes;

public class Circle extends Shape{

  public int radius;

  public Circle(){
  }

  public Circle(Circle target){
    super(target);
    if (target != null) radius = target.radius;
  }

  @Override
  public Shape clone() {
    return new Circle(this);
  }

  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Circle) || !super.equals(obj)) return false;
    Circle shape2 = (Circle) obj;
    return shape2.radius == radius;
  }

  @Override
  public String toString() {
    return super.toString() + " radius =" + " " +  radius;
  }
}
