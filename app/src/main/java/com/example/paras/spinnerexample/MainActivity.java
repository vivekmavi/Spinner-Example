package com.example.paras.spinnerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Spinner.OnItemSelectedListener{
    Spinner spinner1,spinner2,spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] java_array_for_spinner = {"monday","tuesday","wednesday"};

        spinner1= (Spinner) findViewById(R.id.spinner1);
        spinner2= (Spinner) findViewById(R.id.spinner2);
        spinner3= (Spinner) findViewById(R.id.spinner3);

        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);

        //Populating spinner 2 from array in aml and using simple spinner dropdown view
        ArrayAdapter adapterForSpinner2 = ArrayAdapter.createFromResource(this,R.array.spinner_data_array_xml,
                android.R.layout.simple_spinner_item);
        spinner2.setAdapter(adapterForSpinner2);

        //Populating spinner from array that we created above in onCreate()
        ArrayAdapter<String> adapterForSpinner3= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,
                java_array_for_spinner);
        spinner3.setAdapter(adapterForSpinner3);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long rowId)
    {
        Spinner spinner = (Spinner) adapterView ;
        TextView textView = (TextView) view; // to access text on selected item(view)

        String itemSlected = textView.getText().toString();


        if (spinner.getId()==R.id.spinner1)
        {
            Toast.makeText(this,"spinner 1 selected",Toast.LENGTH_SHORT).show();
            Toast.makeText(this,"item selected is "+itemSlected,Toast.LENGTH_SHORT).show();
            Toast.makeText(this,"position is "+String.valueOf(position),Toast.LENGTH_SHORT).show();
            Toast.makeText(this,"rowId is "+String.valueOf(rowId),Toast.LENGTH_SHORT).show();
        }
        if (spinner.getId()==R.id.spinner2)
        {
            Toast.makeText(this,"spinner 2 selected",Toast.LENGTH_SHORT).show();
            Toast.makeText(this,"item selected is "+itemSlected,Toast.LENGTH_SHORT).show();
            Toast.makeText(this,"position is "+String.valueOf(position),Toast.LENGTH_SHORT).show();
            Toast.makeText(this,"rowId is "+String.valueOf(rowId),Toast.LENGTH_SHORT).show();
        }
        if (spinner.getId()==R.id.spinner3)
        {
            Toast.makeText(this,"spinner 3 selected",Toast.LENGTH_SHORT).show();
            Toast.makeText(this,"item selected is "+itemSlected,Toast.LENGTH_SHORT).show();
            Toast.makeText(this,"position is "+String.valueOf(position),Toast.LENGTH_SHORT).show();
            Toast.makeText(this,"rowId is "+String.valueOf(rowId),Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView)
    {
        //dont know what it do.. i guess it is for what to do when nothing selected
    }
}
