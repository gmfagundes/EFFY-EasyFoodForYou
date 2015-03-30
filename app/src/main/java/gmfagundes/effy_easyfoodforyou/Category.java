package gmfagundes.effy_easyfoodforyou;

import java.util.ArrayList;

/**
 * Created by gmfagundes on 3/28/2015.
 */
public class Category {
    private String name;
    private ArrayList<Recipe> listRecipe;

    //construtor
    public Category( String name )
    {
        this.name = name;
        this.listRecipe = new ArrayList<Recipe>();
    }

    //retornando o valor do nome da categoria
    public String getName(){
        return this.name;
    }
    public void setName( String name ){
        this.name = name;
    }

    //retornando valor da lista de receitas da categoria
    public ArrayList<Recipe> getListRecipe(){
        return this.listRecipe;
    }
    public void setListRecipe (ArrayList<Recipe> listRecipe){
        this.listRecipe = listRecipe;
    }


}
