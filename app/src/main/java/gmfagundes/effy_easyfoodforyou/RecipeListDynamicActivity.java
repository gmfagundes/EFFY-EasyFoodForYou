package gmfagundes.effy_easyfoodforyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import gmfagundes.effy_easyfoodforyou.R;

public class RecipeListDynamicActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list_dynamic);

        String [] recipeName = new String[Data.categories.get( Data.selectedCategory ).getListRecipe().size()];
        for ( int i = 0; i < Data.categories.get( Data.selectedCategory ).getListRecipe().size(); i++ )
        {
            recipeName[i] = Data.categories.get( Data.selectedCategory ).getListRecipe().get(i).getTitle();
        }

        //Criando um ArrayAdapter para a lista (adapta o array para lista em geral)
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, recipeName);

        //Linkando o Array a variavel ListView (a lista especifica)
        ListView listView = (ListView) findViewById(R.id.recipeListView);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(RecipeListDynamicActivity.this, RecipeDynamicActivity.class);
                Data.selectedRecipe = i;
                startActivity(intent);
            }
        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.recipe_list_dynamic, menu);
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
