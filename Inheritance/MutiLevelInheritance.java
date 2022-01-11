public class MutiLevelInheritance {
    //   <--------------- SUPER CLASS ----------->
    public static class box{
        int  l;
         int b;
         int h;
        box(){
            l=-1;
            b=-1;
            h=-1;
        }
        box(int l,int b ){
            this.l=l;
            this.b=b;
        }
        box(int l,int b,int h ){
            this.l=l;
            this.b=b;
            this.h=h;
        }
        box(int side ){
            this.l=side;
            this.b=side;
            System.out.println("i m in box having side "+ " " +side);
        }
    }
    //  <-------------- DERIVED CLASS 1 ------------>
    public static class boxweight extends box{
        int weight;
        boxweight(){
            weight=-1;
        }
        boxweight(int l ,int b ,int weight){
            super(l,b);
            this.weight=weight;
        }
        boxweight(int l ,int b ,int h ,int weight){
            super(l,b,h);
            this.weight=weight;
        }
        boxweight(int side,int weight){
            super(side);
            this.weight=weight;
            System.out.println("i m in boxweight having weight"+ " " + weight);
        }
    }
    // <----------------------DERIVED CLASS 2 ------------>
    public static class boxprice extends boxweight{
        int price;
        boxprice(){
            price=-1;
        }
        boxprice(int l, int b, int h, int weight, int price){
            super(l,b,h,weight);
            this.price=price;
        }
        boxprice(int side, int weight, int price){
            super(side,weight);
            this.price=price;
            System.out.println("i m in boxprice having price"+ " " + price);
        }
    }

    public static void main(String[] args){
        boxprice obj=new boxprice(3,7,200);


    }
}

  // ------------------ OUTPUT --------------------->
/*             i m in box having side  3
               i m in boxweight having weight 7
               i m in boxprice having price 200

 */