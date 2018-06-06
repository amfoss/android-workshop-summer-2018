public class MyFavourites extends ParentFavourites implements Favourites {

    public void favouriteFruit(){
        System.out.println("Watermelon");
    }

    public void favouriteIceCream(){
        System.out.println("Watermelon ice-cream");
    }

    public void favouriteMovie(){ 
        super.parentFavouriteMovie(); 
        System.out.println("Watermelon movie");
    }

    public void favouriteSubject(){
        super.parentFavouriteMovie();
        System.out.println("History of watermelons");
    }

    
    public static void main(String[] args) {
        MyFavourites favourites = new MyFavourites();
        favourites.favouriteMovie();
        favourites.favouriteSubject();
    }













}