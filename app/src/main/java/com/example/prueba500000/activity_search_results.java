package com.example.prueba500000;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class activity_search_results {
    public class SearchResultsActivity extends Activity {

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            handleIntent(getIntent());
        }

        @Override
        protected void onNewIntent(Intent intent) {

            handleIntent(intent);
        }

        private void handleIntent(Intent intent) {

            if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
                String query = intent.getStringExtra(SearchManager.QUERY);
               query = "Estas buscando";

            }

        }

    }

}