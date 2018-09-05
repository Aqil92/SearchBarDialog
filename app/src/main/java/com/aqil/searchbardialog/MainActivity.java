package com.aqil.searchbardialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.aqil.mainlibrary.core.BaseSearchDialogCompat;
import com.aqil.mainlibrary.core.SearchResultListener;
import com.aqil.searchbardialog.Model.ContactModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);
        provide2CustomContactDialog();
    }


    void provide2CustomContactDialog(){
        new ContactSearchDialogCompat<>(MainActivity.this, "Search...",
                "What are you looking for...?", null, createSampleContacts(),
                new SearchResultListener<ContactModel>() {
                    @Override
                    public void onSelected(BaseSearchDialogCompat dialog,
                                           ContactModel item, int position) {
                        Toast.makeText(MainActivity.this, item.getTitle(),
                                Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                }).show();
    }




    private ArrayList<ContactModel> createSampleContacts(){
        ArrayList<ContactModel> items = new ArrayList<>();
        // Thanks to https://randomuser.me for the images
        items.add(new ContactModel("First item", "https://randomuser.me/api/portraits/women/93.jpg","1","2","3"));
        items.add(new ContactModel("Second item", "https://randomuser.me/api/portraits/women/79.jpg","1","2","3"));
        items.add(new ContactModel("Third item", "https://randomuser.me/api/portraits/women/56.jpg","1","2","3"));
        items.add(new ContactModel("The ultimate item", "https://randomuser.me/api/portraits/women/44.jpg","1","2","3"));
        items.add(new ContactModel("Last item", "https://randomuser.me/api/portraits/women/82.jpg","1","2","3"));
        items.add(new ContactModel("Lorem ipsum", "https://randomuser.me/api/portraits/lego/3.jpg","1","2","3"));
        items.add(new ContactModel("Dolor sit", "https://randomuser.me/api/portraits/women/60.jpg","1","2","3"));
        items.add(new ContactModel("Some random word", "https://randomuser.me/api/portraits/women/32.jpg","1","2","3"));
        items.add(new ContactModel("guess who's back", "https://randomuser.me/api/portraits/women/67.jpg","1","2","3"));
        return items;
    }
}
