package java_dz.SeaBattle;

public abstract class Ship {
int hp;

}

class Little_ship extends Ship{

    public int x1;
    public int y1;
    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public Little_ship(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;

        hp= 1;

    }
}

class Double_ship extends Ship{
    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Double_ship(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        hp = 2;
    }
}



class Tripple_ship extends Ship{
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    public int x3;
    public int y3;

    public Tripple_ship(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        hp = 3;
    }
}

class Linkor extends Ship{
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    public int x3;
    public int y3;
    public int x4;
    public int y4;

    public Linkor(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;

        hp = 4;
    }
}