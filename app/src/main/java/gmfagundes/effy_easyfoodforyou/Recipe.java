package gmfagundes.effy_easyfoodforyou;

/**
 * Created by gmfagundes on 3/28/2015.
 */
public class Recipe {

    private String title;
    private String ingredients;
    private String howtocook;
    private String imageId;
    private Boolean favorite;


    //Construtor
    public Recipe (String title, String ingredients, String howtocook, String imageId){
        this.title = title;
        this.ingredients = ingredients;
        this.howtocook = howtocook;
        this.imageId = imageId;
    }


    //ingredients
    public String getIngredients(){
        return this.ingredients;
    }

    public void setIngredients (String ingredients){
        this.ingredients = ingredients;
    }

    //how to cook
    public String getHowtocook(){
        return this.howtocook;
    }

    public void setHowtocook (String howtocook){
        this.howtocook = howtocook;
    }

    //ibagens
    public String getImageId(){
        return this.imageId;
    }

    public void setImageId (String imageId){
        this.imageId = imageId;
    }

    //titulo
    public String getTitle(){
        return this.title;
    }

    public void setTitle (String title){
        this.title = title;
    }
}


