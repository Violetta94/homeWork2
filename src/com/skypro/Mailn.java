package com.skypro;

public class Mailn {
    public static void main(String[] args) {
        /* 1 задание */
        double dog=8;
      var cat=3.6;
      var paper=763789;
      System.out.println(dog);
      System.out.println(cat);
      System.out.println(paper);

      dog=dog+4;
      cat=cat+4;
      paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog= dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        /* 2 задание */

        var friend= 19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        /* 3 задание */

        var firstBoxer=78.2;
        var secondBoxer=82.7;
        System.out.println(firstBoxer);
        System.out.println(secondBoxer);
        var summ=firstBoxer+secondBoxer;
        System.out.println(summ);

        var difference = secondBoxer-firstBoxer;
       System.out.println(difference);
        var surplus=secondBoxer%firstBoxer;
      System.out.println(surplus);

     var allTime=640;
     var dayTime=8;
     var men=allTime/dayTime;
      System.out.println( "Всего работников в компании "+men+" человек");
      men=men+94;
      allTime=dayTime*men;
      System.out.println("Если в компании работает "+men+" человек, то всего "+allTime+" часов работы может быть поделено между сотрудниками");
    }
}

