package android.example.rvtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnButtonClickLIstener{

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

        TextViewAdapter adapter = new TextViewAdapter(list, this, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    public void onClicked(TextViewModel list, int a) {
        Log.d("demo"," - 1");

        switch (a){
            case 1:
                Toast.makeText(MainActivity.this, "Button 1 " + list.getText(),Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(MainActivity.this, "Button 2 " + list.getText(),Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(MainActivity.this, "Button 3 " + list.getText(),Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(MainActivity.this, "Button 4 " + list.getText(),Toast.LENGTH_SHORT).show();
                break;
            default:
                throw new RuntimeException("Unknow button ID");
        }
        }
}