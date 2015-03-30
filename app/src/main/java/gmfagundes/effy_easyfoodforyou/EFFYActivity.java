package gmfagundes.effy_easyfoodforyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class EFFYActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Data.initData();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_effy);

        Button randomButton = (Button) findViewById(R.id.randomButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomGenerator = new Random();  // Construct a new Random number generator
                int randomCategoryIndex = randomGenerator.nextInt( Data.categories.size() );
                int randomRecipeIndex = randomGenerator.nextInt( Data.categories.get( randomCategoryIndex ).getListRecipe().size() );

                // Seta a categoria e a receita selecionada
                Data.selectedCategory = randomCategoryIndex;
                Data.selectedRecipe = randomRecipeIndex;

                startActivity( new Intent( view.getContext(), RecipeDynamicActivity.class ) );
                finish();


            }
        };

        randomButton.setOnClickListener(listener);






    }

    //Choose! Button to activity_categories Layout
    public void onButton1Click(View view) {
        Button Button1 = (Button) view;
        startActivity(new Intent(getApplicationContext(),CategoriesActivity.class));
    }

    //Favorites button to activity_favorites Layout
    public void onButton2Click (View view) {
        Button Button2 = (Button) view;
        startActivity(new Intent(getApplicationContext(),FavoritesActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.effy, menu);
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
