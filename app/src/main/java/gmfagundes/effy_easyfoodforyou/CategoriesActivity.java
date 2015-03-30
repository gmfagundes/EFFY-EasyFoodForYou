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

import java.util.ArrayList;

import gmfagundes.effy_easyfoodforyou.R;

public class CategoriesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);


        String [] categoriesNames = new String[ Data.categories.size() ];
        for ( int i = 0; i < Data.categories.size(); i++ )
        {
            categoriesNames[i] = Data.categories.get( i ).getName();
        }

        //Criando um ArrayAdapter para a lista (adapta o array para lista em geral)
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categoriesNames );

        //Linkando o Array a variavel ListView (a lista especifica)
        ListView listView = (ListView) findViewById(R.id.categoriesListView);
        listView.setAdapter(itemsAdapter);


        //Possibilitando que cada item da lista seja clicavel e abra uma nova activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               Data.selectedCategory = i;
               startActivity(new Intent(view.getContext(), RecipeListDynamicActivity.class));
            }
        });
    }


}



