package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an array of words

        ArrayList<Word> words = new ArrayList<Word>();

        //words.add("one");

        //input to list is a new Word object
        words.add(new Word ("Where are you going?", "minto wuksus"));
        words.add(new Word ("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word ("My name is...", "oyaaset..."));
        words.add(new Word ("How are you feeling?", "michәksәs?"));
        words.add(new Word ("I’m feeling good.", "kuchi achit"));
        words.add(new Word ("Are you coming?", "әәnәs'aa?"));
        words.add(new Word ("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new Word ("I’m coming.", "әәnәm"));
        words.add(new Word ("Let’s go.", "yoowutis"));
        words.add(new Word ("Come here.", "әnni'nem"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this,words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        //LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

// WHILE LOOP

//        int index = 0;
//
//        while (index < words.size())
//        {
//        TextView wordView = new TextView(this);
//        wordView.setText(words.get(index));
//        rootView.addView(wordView);
//        index++;
//        }

//FOR LOOP

//        for (int index = 0; index<words.size(); index++){
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//        }

    }
}
