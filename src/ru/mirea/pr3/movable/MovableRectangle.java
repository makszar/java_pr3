package ru.mirea.pr3.movable;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this(new MovablePoint(x1, y1, xSpeed, ySpeed), new MovablePoint(x2, y2, xSpeed, ySpeed));
    }

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = new MovablePoint(topLeft.x, topLeft.y, topLeft.xSpeed, topLeft.ySpeed);
        this.bottomRight = new MovablePoint(bottomRight.x, bottomRight.y, bottomRight.xSpeed, bottomRight.ySpeed);
        if (!hasSameSpeed()) {
            throw new IllegalArgumentException("Скорости точек должны совпадать");
        }
    }

    public boolean hasSameSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public void moveUp() { topLeft.moveUp(); bottomRight.moveUp(); }
    @Override
    public void moveDown() { topLeft.moveDown(); bottomRight.moveDown(); }
    @Override
    public void moveLeft() { topLeft.moveLeft(); bottomRight.moveLeft(); }
    @Override
    public void moveRight() { topLeft.moveRight(); bottomRight.moveRight(); }
    @Override
    public String toString() { return "MovableRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]"; }
}
