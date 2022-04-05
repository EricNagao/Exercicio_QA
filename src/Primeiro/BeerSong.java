package Primeiro;
public class BeerSong {
    public static void main(String[] args) {
        int beerNum =  10;
        String word = "bottles";

        while(beerNum>0){
            if(beerNum == 1) {
                word = "bottle"; //no singular, como em "uma" Garrafa
            }

            System.out.println(beerNum+ " " + word + " of beer on the wall,");
            System.out.println(beerNum+ " "+  word + " of beer");
            System.out.println("TaKe oNe DoWn");
            System.out.println("PaSS iT aRouND");
            beerNum = beerNum-1;
           
            if(beerNum>0){
                System.out.println(beerNum + " " + word + " oF Beer on the Wall");
               } else{
                   System.out.println("No MoRe Bottles Of Beer oN the WalL");
               }//fim de else
        }//fim do while
    }//fim do main
}//fim da classe 
