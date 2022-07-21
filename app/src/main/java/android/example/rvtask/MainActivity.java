package android.example.rvtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);


        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<TextViewModel> list = new ArrayList<>();
        list.add(new TextViewModel("Item1"));
        list.add(new TextViewModel("Item2"));
        list.add(new TextViewModel("Item3"));
        list.add(new TextViewModel("Item4"));
        list.add(new TextViewModel("Item5"));
        list.add(new TextViewModel("Item6"));
        list.add(new TextViewModel("Item7"));
        list.add(new TextViewModel("Item8"));
        list.add(new TextViewModel("Item9"));
        list.add(new TextViewModel("Item10"));
        list.add(new TextViewModel("Item11"));
        list.add(new TextViewModel("Item12"));
        list.add(new TextViewModel("Item13"));
        list.add(new TextViewModel("Item14"));
        list.add(new TextViewModel("Item15"));
        list.add(new TextViewModel("Item16"));
        list.add(new TextViewModel("Item17"));
        list.add(new TextViewModel("Item18"));
        list.add(new TextViewModel("Item19"));
        list.add(new TextViewModel("Item20"));

        TextViewAdapter adapter = new TextViewAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }
}