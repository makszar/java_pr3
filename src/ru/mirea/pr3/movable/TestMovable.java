package ru.mirea.pr3.movable;

public class TestMovable {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 10, 5, 2, 3);
        System.out.println("Одинаковая скорость: " + rectangle.hasSameSpeed());
        Movable[] objects = {new MovablePoint(1, 2, 2, 3), new MovableCircle(0, 0, 2, 3, 5), rectangle};
        for (Movable object : objects) {
            System.out.println(object);
            object.moveUp();
            object.moveRight();
            System.out.println(object);
            object.moveDown();
            object.moveLeft();
            System.out.println(object);
        }
        try {
            new MovableRectangle(new MovablePoint(0, 0, 1, 1), new MovablePoint(10, 5, 2, 1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
