package gmfagundes.effy_easyfoodforyou;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import gmfagundes.effy_easyfoodforyou.R;

public class RecipeDynamicActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_dynamic);

        TextView recipeTitle = (TextView) findViewById(R.id.titleTextView);
        recipeTitle.setText(Data.getSelectedRecipe().getTitle());

        TextView recipeIngredient = (TextView) findViewById(R.id.ingredient2TextView);
        recipeIngredient.setText(Data.getSelectedRecipe().getIngredients());

        TextView recipeHowTo = (TextView) findViewById(R.id.howto2TextView);
        recipeHowTo.setText(Data.getSelectedRecipe().getHowtocook());

        ImageView recipeImage = (ImageView) findViewById(R.id.recipeImage);
        int imageResource = getResources().getIdentifier(
                Data.getSelectedRecipe().getImageId(),
                "drawable",
                this.getPackageName()
        );

        Drawable res = getResources().getDrawable(imageResource);
        recipeImage.setImageDrawable(res);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.recipe_dynamic, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
