package com.tauhidmonwar.prowriting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {

    AlertDialog.Builder ExitDialog;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.paragraph);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Paragraph.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.note);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Note.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.composition);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Composition.class);
                startActivity(intent);
            }
        });
        button = findViewById(R.id.letter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Latter.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.dialogue);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Dialogue.class);
                startActivity(intent);
            }
        });
        button = findViewById(R.id.applicatiion);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Application.class);
                startActivity(intent);
            }
        });
        button = findViewById(R.id.story);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Story.class);
                startActivity(intent);
            }
        });


        Toast toast = Toast.makeText(MainActivity.this, "Check your Internet Connection", Toast.LENGTH_LONG);
        toast.show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.About) {

            Intent intent = new Intent(getApplicationContext(), About.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);

    }


    public void loadExitDialog(){

        ExitDialog = new AlertDialog.Builder(MainActivity.this);
        ExitDialog.setMessage("Do you want to Exit ?");
        ExitDialog.setTitle("Confirmation");
        ExitDialog.setCancelable(false);
        ExitDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                finish();

            }
        });

        ExitDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.cancel();

            }
        });

        AlertDialog alertDialog = ExitDialog.create();
        alertDialog.show();


    }

    @Override
    public void onBackPressed() {

        loadExitDialog();
    }
}
