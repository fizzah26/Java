import java.util.*;
public class Demo {
    public static void main(String[] args) {
        // Music m1 = new Music("hasi", "selena", "5min", "love", new Date(25, 5, 2005), "sad");
        //Music m2 = new Music("no love", "taylor", "2min", "hate", new Date(18, 9, 2008),"hiphop");
        //Music m3 = new Music("fire", "zayn", "1min", "youth", new Date(2, 3, 2013),  "hiphop");
        //Music m4 = new Music("patience", "harry", "4min", "love", new Date(13, 7, 1999), "sad");
        //Music m5 = new Music("patience", "harry", "4min", "love", new Date(13, 7, 1999), "sad");

        /*if (m4.getTitle().equals(m1.getTitle())) {
            System.out.println("objects are equal");
        }
        else {
            System.out.println("objects are not equal");
        }

        Music list[]=new Music[10];
        list [0]=m1;
        list[1]=m2;
        list[2]=m3;
        list[3]=m4;
        list[4]=m5;

        for (int i=0;i<=4;i++){
            System.out.println(list[i]);
        }*/
        // System.out.println(m1.toString());
        //System.out.println(m2.toString());
        //System.out.println(m3.toString());
        //System.out.println(m4.toString());
        //System.out.println(m5.toString());

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter title:");
        String Title=sc.next();

        System.out.println("Enter Artist:");
        String Artist=sc.next();

        System.out.println("Duration:");
        String Duration=sc.next();

        System.out.println("Enter Release Date:");
        int ReleaseDate=sc.nextInt();

        System.out.println("Enter release month::");
        int ReleaseMonth=sc.nextInt();

        System.out.println("Enter release year:");
        int ReleaseYear=sc.nextInt();

        System.out.println("Enter Album Name:");
        String AlbumName=sc.next();



        System.out.println("Enter genre:");
        String Genre=sc.next();

       Music m1=new Music(Title,Artist,Duration,AlbumName,new Date (ReleaseDate,ReleaseMonth,ReleaseYear),Genre);
        System.out.println(m1);


        Music m2=new Music(Title,Artist,Duration,AlbumName,new Date (ReleaseDate,ReleaseMonth,ReleaseYear),Genre);
        System.out.println(m2);








    }
}
