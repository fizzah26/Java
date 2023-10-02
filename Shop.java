

public class Shop {
    public static void main(String[] args) {

        Product p4=new Product("product 1",80,8, new Date(20,4,2023));
        System.out.println(p4);

        Product p5=new Product("product 2",100,4, new Date(9,9,2023));
        System.out.println(p5);

        System.out.println(p4.isLatest(p4,p5));


        //Product p1=new Product("LCD", 50000, 2);
        //Product p2=new Product("Keboard",700,10);
        //Product p3=new Product("Keboard wireless",700,10);

        //System.out.println(p1);
        //System.out.println(p2);
        //System.out.println(p3);
    }
}