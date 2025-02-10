# Абстрактные классы

* Абстрактный класс - это класс, который не позволят создавать его объекты, и нужен просто как шаблон для других классов
* Абстрактный метод - метод, который не содержит тела
* Если класс содержит хотя бы один абстрактный метод, то весь класс должен быть абстрактным
* Тогда, если у класса есть потомок, то он обязан реализовать этот абстрактный метод, либо он тоже должен быть помечен как абстрактный
* Абстрактный класс может содержать поля и неабстрактные методы, например:

```java
public abstract class Figure {
    protected int x;
    protected int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public abstract double getArea();
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}

public class Rectangle extends Figure {

    private int a;
    private int b;

    public Rectangle(int x, int y, int a, int b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
```

* Итог: абстрактные классы позволяют реализовать иерархию для полиморфизма и заставить программиста соблюдать нужную архитектуру