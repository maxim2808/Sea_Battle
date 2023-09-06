package java_dz.SeaBattle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    Player rival;
    String name;
   static String message_ship_location= new String("Корабль не может так располагаться! ");

    //Поле
    public  Icons[][] array1 = {{Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,
            Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,}, {Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,
            Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,}, {Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,
            Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,}, {Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,
            Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,}, {Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,
            Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,}, {Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,
            Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,}, {Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,
            Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,}, {Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,
            Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,}, {Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,
            Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,}, {Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,
            Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell, Icons.Empty_cell,},};
    //Счетчики количества
     boolean bship_little1 = true;
     boolean bship_little2 = true;
     boolean bship_little3 = true;
     boolean bship_little4 = true;
     boolean bship_double1 = true;
    boolean bship_double2 = true;
    boolean bship_double3 = true;
     boolean bship_triple1 = true;
    boolean bship_triple2 = true;
     boolean bship_linkor1 = true;

    int count_little_ship = 4;
     int count_double_ship = 3;
     int count_triple_ship = 2;
     int count_linkor = 1;
    int count_filled_cell = 0;
    ArrayList<Little_ship> arl1 = new ArrayList<>();
     ArrayList<Double_ship> arl2 = new ArrayList<>();
     ArrayList<Tripple_ship> arl3 = new ArrayList<>();
     ArrayList<Linkor> arl4 = new ArrayList<>();
     public void arrangment_little_ship(){
         try{
         Scanner sc1 = new Scanner(System.in);
         System.out.println(name + " Введите два числа через пробел для размещения одинарного корабля");
          String chislo = sc1.nextLine();
         String [] masschisel =  chislo.split(" ");
        int x1 = Integer.parseInt(masschisel[0]);
         int y1 = Integer.parseInt(masschisel[1]);
        add_little_ship(x1, y1);
             }
         catch (Exception ex){arrangment_little_ship();}
     }

    public void arrangment_double_ship(){
        try{
            Scanner sc1 = new Scanner(System.in);
            System.out.println(name + " Введите четыре числа через пробел для размещения двойного корабля");
            String chislo = sc1.nextLine();
            String [] masschisel =  chislo.split(" ");
            int x1 = Integer.parseInt(masschisel[0]);
            int y1 = Integer.parseInt(masschisel[1]);
            int x2 = Integer.parseInt(masschisel[2]);
            int y2 = Integer.parseInt(masschisel[3]);
            add_double_ship(x1, y1, x2, y2);

            }
        catch (Exception ex){arrangment_double_ship();}
    }

    public void arrangment_triple_ship(){
        try{
            Scanner sc1 = new Scanner(System.in);
            System.out.println(name + " Введите шесть чисел через пробел для размещения тройного корабля");
            String chislo = sc1.nextLine();
            String [] masschisel =  chislo.split(" ");
            int x1 = Integer.parseInt(masschisel[0]);
            int y1 = Integer.parseInt(masschisel[1]);
            int x2 = Integer.parseInt(masschisel[2]);
            int y2 = Integer.parseInt(masschisel[3]);
            int x3 = Integer.parseInt(masschisel[4]);
            int y3 = Integer.parseInt(masschisel[5]);

                add_triple_ship(x1, y1, x2, y2, x3, y3);
        }
        catch (Exception ex){arrangment_triple_ship();}
    }

    public void arrangment_linkor(){
        try{
            Scanner sc1 = new Scanner(System.in);
            System.out.println(name + " Введите восемь чисел через пробел для размещения линкора");
            String chislo = sc1.nextLine();
            String [] masschisel =  chislo.split(" ");
            int x1 = Integer.parseInt(masschisel[0]);
            int y1 = Integer.parseInt(masschisel[1]);
            int x2 = Integer.parseInt(masschisel[2]);
            int y2 = Integer.parseInt(masschisel[3]);
            int x3 = Integer.parseInt(masschisel[4]);
            int y3 = Integer.parseInt(masschisel[5]);
            int x4 = Integer.parseInt(masschisel[6]);
            int y4 = Integer.parseInt(masschisel[7]);

            add_linkor(x1, y1, x2, y2, x3, y3, x4, y4);
        }
        catch (Exception ex){arrangment_linkor();}
    }
    public void arrangment_ships(){
         arrangment_little_ship();
        arrangment_little_ship();
        arrangment_little_ship();
        arrangment_little_ship();
        arrangment_double_ship();
        arrangment_double_ship();
        arrangment_double_ship();
        arrangment_triple_ship();
        arrangment_triple_ship();
        arrangment_linkor();

    }

public void skirmish(){
    try{
      if(rival.sum_hp() <=0){System.out.println("Игра закончена, игрок " + name + " победил");}
      else {

          Scanner sc2 = new Scanner(System.in);
          System.out.println(name + " Введите два числа через пробел для выстрела");
          rival.display_field();
          String chislo = sc2.nextLine();
          String[] masschisel = chislo.split(" ");
          int x1 = Integer.parseInt(masschisel[0]);
          int y1 = Integer.parseInt(masschisel[1]);
          shot(x1, y1);

      }
    }
    catch (Exception ex){skirmish();}
}

public void fire_cycle(){
         while(sum_hp()>0 && rival.sum_hp()>0
    ){
             skirmish();
             if(sum_hp()==0 || rival.sum_hp()==0){break;}
             rival.skirmish();
             if(sum_hp()==0 || rival.sum_hp()==0){break;}
         }
}

    public void disguise(){
        for(int i = 0; i<array1.length; i++){
            for(int j = 0; j<array1[i].length; j++){
                if(array1[i][j]==Icons.Filled_cell){Icons.Filled_cell.setPicture(" \uD83C\uDF0A");}
            }
        }
    }

    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();
        p1.name = "Player1";
        p2.name = "Player2";
        p1.rival =p2;
        p2.rival = p1;
        p1.arrangment_ships();
        p2.arrangment_ships();
        p1.disguise();
        p2.disguise();
        p1.fire_cycle();
       // p1.display_arl1();
       // System.out.println();
       // p2.display_arl1();



    }
    public  void add_little_ship(int x1, int y1) {
        if((x1>=0)&&(x1<=9)&&(y1>=0)&&(y1<=9)){
        if (check_cell(x1, y1) == true) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Размещение одинарного корабля, корабли слишком близко друг к другу!!!!!!!!!!!");
                arrangment_little_ship();
            }
        } else {
            if (count_little_ship == 0) {
                System.out.println("Закончились мелкие корабли у игрока " + name);
            } else {
                if(bship_little1==true){ Little_ship l_ship1 = new Little_ship(x1, y1);
                    arl1.add(l_ship1);
                    bship_little1=false;}
                else if(bship_little2==true){ Little_ship l_ship2 = new Little_ship(x1, y1);
                    arl1.add(l_ship2);
                    bship_little2=false;}
                else if(bship_little3==true){ Little_ship l_ship3 = new Little_ship(x1, y1);
                    arl1.add(l_ship3);
                    bship_little3=false;}
                else if(bship_little4==true){ Little_ship l_ship4 = new Little_ship(x1, y1);
                    arl1.add(l_ship4);
                    bship_little4=false;}


                array1[x1][y1] = Icons.Filled_cell;

                count_little_ship--;
                System.out.println("Осталось маленький кораблей у игрока  " + name + " " + count_little_ship);
                display_field();
            }}


        }
        else{try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("неверные координаты установки маленького коробля");
            arrangment_little_ship();
        }
        }

    }

    public  void add_double_ship(int x1, int y1, int x2, int y2) {
        if(((x1>=0)&&(x1<=9)&&(y1>=0)&&(y1<=9))&&((x2>=0)&&(x2<=9)&&(y2>=0)&&(y2<=9))) {
            if (check_cell(x1, y1) == true || check_cell(x2, y2) == true
            ) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Размещение двойного корабля, корабли слишком близко друг к другу!!!!!");
                    arrangment_double_ship();
                }
            } else {
                if (count_double_ship == 0) {
                    System.out.println("Закончились средние корабли");
                } else {
                    if (
                            ((x2 == x1) && (y2 == y1 + 1 || y2 == y1 - 1)) || (y2 == y1) && ((x2 == x1 + 1 || x2 == x1 - 1))) {
                        if (bship_double1 == true) {
                            Double_ship d_ship1 = new Double_ship(x1, y1, x2, y2);
                            arl2.add(d_ship1);
                            bship_double1 = false;
                        } else if (bship_double2 == true) {
                            Double_ship d_ship2 = new Double_ship(x1, y1, x2, y2);
                            arl2.add(d_ship2);
                            bship_double2 = false;
                        } else if (bship_double3 == true) {
                            Double_ship d_ship3 = new Double_ship(x1, y1, x2, y2);
                            arl2.add(d_ship3);
                            bship_double3 = false;
                        }
                        {

                            array1[x1][y1] = Icons.Filled_cell;
                            array1[x2][y2] = Icons.Filled_cell;

                            count_double_ship--;
                            System.out.println("Осталось средних кораблей " + count_double_ship);
                            display_field();
                        }
                    } else {
                        System.out.println(message_ship_location);
                        arrangment_double_ship();
                    }
                }


            }
        }
        else{try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("неверные координаты установки двойного коробля");
            arrangment_double_ship();
        }
        }
    }

    public  void add_triple_ship(int x1, int y1, int x2, int y2, int x3, int y3) {
        if(((x1>=0)&&(x1<=9)&&(y1>=0)&&(y1<=9))&&((x2>=0)&&(x2<=9)&&(y2>=0)&&(y2<=9))&&((x3>=0)&&(x3<=9)&&(y3>=0)&&(y3<=9))) {

            if (
                    check_cell(x1, y1) == true || check_cell(x2, y2) == true || check_cell(x3, y3) == true
            ) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Размещение тройноно корабля, корабли слишком близко друг к другу!!!!!!!!!!!");
                    arrangment_triple_ship();
                }
            } else {
                if (count_triple_ship == 0) {
                    System.out.println("Закончились тройные корабли");
                } else {
                    if (
                        //Сверка первой и второй ячейки
                            ( ((x2 == x1) && (y2 == y1 + 1 || y2 == y1 - 1)) || ((y2 == y1) && (x2 == x1 + 1 || x2 == x1 - 1)))
                                    //Сверка второй и третьей ячейки
                                    && (((x3 == x2 && x3 == x1) && (y3 == y2 + 1 || y3 == y2 - 1)) || ((y3 == y2 && y3 == y1) && (x3 == x2 + 1 || x3 == x2 - 1)))
                    ) {
                        if (bship_triple1 == true) {
                            Tripple_ship t_ship1 = new Tripple_ship(x1, y1, x2, y2, x3, y3);
                            arl3.add(t_ship1);
                            bship_triple1 = false;
                        } else if (bship_triple2 == true) {
                            Tripple_ship t_ship2 = new Tripple_ship(x1, y1, x2, y2, x3, y3);
                            arl3.add(t_ship2);
                            bship_triple2 = false;
                        }

                        array1[x1][y1] = Icons.Filled_cell;
                        array1[x2][y2] = Icons.Filled_cell;
                        array1[x3][y3] = Icons.Filled_cell;
                        count_triple_ship--;

                        System.out.println("Осталось тройных кораблей " + count_triple_ship);
                        display_field();
                    } else {
                        System.out.println(message_ship_location);
                        arrangment_triple_ship();
                    }
                }


            }
        }
        else{try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("неверные координаты установки тройного коробля");
            arrangment_triple_ship();
        }
        }
    }

    public void add_linkor(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        if(((x1>=0)&&(x1<=9)&&(y1>=0)&&(y1<=9))&&((x2>=0)&&(x2<=9)&&(y2>=0)&&(y2<=9))&&((x3>=0)&&(x3<=9)&&(y3>=0)&&(y3<=9))&&((x4>=0)&&(x4<=9)&&(y4>=0)&&(y4<=9))) {
            if
            (check_cell(x1, y1) == true || check_cell(x2, y2) == true || check_cell(x3, y3) == true || check_cell(x4, y4) == true
            ) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Размещение линкора, корабли слишком близко друг к другу!!!!!!!!!!!");
                    arrangment_linkor();
                }
            } else {
                if (count_linkor == 0) {
                    System.out.println("Закончились линкоры");
                } else {
                    if (

                            (((x2 == x1) && (y2 == y1 + 1 || y2 == y1 - 1)) || ((y2 == y1) && (x2 == x1 + 1 || x2 == x1 - 1)))
                                    //Сверка первой и второй ячейки
                                    //Сверка второй и третьей ячейки
                                    && (((x3 == x2 && x3 == x1) && (y3 == y2 + 1 || y3 == y2 - 1)) || (y3 == y2 && y3 == y1) && (x3 == x2 + 1 || x3 == x2 - 1))
                                    // Сверка третьей и четвертой ячейки
                                    && (((x4 == x3 && x4 == x2 && x4==x1) && (y4 == y3 + 1 || y4 == y3 - 1)) || (y4 == y3 && y4 == y2 && y4==y1) && (x4 == x3 + 1 || x4 == x3 - 1))

                    ) {
                        if
                        (bship_linkor1 == true) {
                            Linkor linkor1 = new Linkor(x1, y1, x2, y2, x3, y3, x4, y4);
                            arl4.add(linkor1);
                            bship_linkor1 = false;
                        }


                        array1[x1][y1] = Icons.Filled_cell;
                        array1[x2][y2] = Icons.Filled_cell;
                        array1[x3][y3] = Icons.Filled_cell;
                        array1[x4][y4] = Icons.Filled_cell;

                        count_linkor--;
                        System.out.println("Осталось линкоров  " + count_linkor);
                        display_field();
//
                    } else {
                        System.out.println(message_ship_location);
                        arrangment_linkor();
                    }
                }


            }
        }
        else{try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("неверные координаты установки линкора");
            arrangment_linkor();
        }
        }
    }



    public Boolean shot(int x, int y) {
         boolean b = false;
        System.out.println("Выстрел по координатам " + x + " " + y);
        if((x>=0)&&(x<=9)&&(y>=0)&&(y<=9)) {
            locator();
            if ((rival.array1[x][y].equals(Icons.Miss)) || (rival.array1[x][y].equals(Icons.Hit)) || (rival.array1[x][y].equals(Icons.Destroy))) {
                System.out.println("Уже был выстрел по координатм " + x + " " + y);
                skirmish();
                return true;
            } else {




                for (Little_ship d1 : rival.arl1) {
                    if (d1.x1 == x && d1.y1 == y) {
                        d1.hp--;

                    }


                }


                for (Double_ship d1 : rival.arl2) {
                    if ((d1.x1 == x && d1.y1 == y) || (d1.x2 == x && d1.y2 == y)) {
                        d1.hp--;
                    }
                }
                for (Tripple_ship d1 : rival.arl3) {
                    if ((d1.x1 == x && d1.y1 == y) || (d1.x2 == x && d1.y2 == y) || (d1.x3 == x && d1.y3 == y)) {
                        d1.hp--;
                    }
                }
                for (Linkor d1 : rival.arl4) {
                    if ((d1.x1 == x && d1.y1 == y) || (d1.x2 == x && d1.y2 == y) || (d1.x3 == x && d1.y3 == y) || (d1.x4 == x && d1.y4 == y)) {
                        d1.hp--;

                    }

                }
                if (rival.array1[x][y].equals(Icons.Filled_cell)) {
                    rival.array1[x][y] = Icons.Hit;
                    locator();
                    System.out.println("Попадание по координатам " + x + " " + y);
                    //rival.display_arl4();
                    skirmish();

                    return true;


                } else {
                    System.out.println("Промах по координатам " + x + " " + y);
                    rival.array1[x][y] = Icons.Miss;
                }


            }

            locator();

 return false;
        }
        else{try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("неверные координаты выстрела");
            locator();
            skirmish();
           return true;

        }
        }


    }

    public Boolean check_cell(int x1, int y1) {

        if (
                x1 <= 8 && array1[x1 + 1][y1].equals(Icons.Filled_cell) || x1 >= 1 && array1[x1 - 1][y1].equals(Icons.Filled_cell) || y1 <= 8 && array1[x1][y1 + 1].equals(Icons.Filled_cell)
                        || y1 >= 1 && array1[x1][y1 - 1].equals(Icons.Filled_cell) || x1 <= 8 && y1 <= 8 && array1[x1 + 1][y1 + 1].equals(Icons.Filled_cell) || x1 >= 1 && y1 <= 8 && array1[x1 - 1][y1 + 1].equals(Icons.Filled_cell)
                        || x1 <= 8 && y1 >= 1 && array1[x1 + 1][y1 - 1].equals(Icons.Filled_cell) || x1 >= 1 && y1 >= 1 && array1[x1 - 1][y1 - 1].equals(Icons.Filled_cell)
        ) {
            return true;
        }
        return false;
    }

    public void display_field() {
        System.out.println("Поле игрока " + name + " ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j].getPicture());
            }
            System.out.println();
        }
        System.out.println();
    }

    public  void locator(){
        int count_filled_cell = 1;
        for(Little_ship a:rival.arl1){
            if(a.hp==0){
                rival.array1[a.x1][a.y1] = Icons.Destroy;
            }
        }
        for(Double_ship a:rival.arl2){
            if(a.hp==0){
                rival.array1[a.x1][a.y1] = Icons.Destroy;
                rival.array1[a.x2][a.y2] = Icons.Destroy;
            }
        }

        for(Tripple_ship a:rival.arl3){
            if(a.hp==0){
                rival.array1[a.x1][a.y1] = Icons.Destroy;
                rival.array1[a.x2][a.y2] = Icons.Destroy;
                rival.array1[a.x3][a.y3] = Icons.Destroy;
            }
        }
        for(Linkor a:rival.arl4){
            if(a.hp==0){
                rival.array1[a.x1][a.y1] = Icons.Destroy;
                rival.array1[a.x2][a.y2] = Icons.Destroy;
                rival.array1[a.x3][a.y3] = Icons.Destroy;
                rival.array1[a.x4][a.y4] = Icons.Destroy;
            }
        }



    }
    public  ArrayList<Little_ship> display_arl1(){
        for(Little_ship a:arl1){
            System.out.println(a.x1 + " " + a.y1 + " hp " + a.hp);

        }
        return arl1;
    }

    public  ArrayList<Double_ship> display_arl2(){
        for(Double_ship a:arl2){
            System.out.println(a.x1 + " " + a.y1 + " " + a.x2 + " " + a.y2 +  " hp " + a.hp);

        }
        return arl2;
    }
    public ArrayList<Tripple_ship> display_arl3(){
        for(Tripple_ship a:arl3){
            System.out.println(a.x1 + " " + a.y1 + " " + a.x2 + " " + a.y2 + " " + a.x3 + " " + a.y3 + " hp " + a.hp);

        }
        return arl3;
    }


    public  ArrayList<Linkor> display_arl4(){
        for(Linkor a:arl4){
            System.out.println(a.x1 + " " + a.y1 + " " + a.x2 + " " + a.y2 + " " + a.x3 + " " + a.y3 + " " + a.x4 + " " + a.y4 +" hp " + a.hp);

        }
        return arl4;
    }

    public int sum_hp(){
       int  count_hp = 0;
        for(Little_ship a:arl1){
            count_hp = count_hp + a.hp;        }
        for(Double_ship a:arl2){count_hp = count_hp + a.hp;}
        for(Tripple_ship a:arl3){count_hp = count_hp + a.hp;}
        for(Linkor a:arl4){count_hp = count_hp + a.hp;}
        return count_hp;
    }

}
