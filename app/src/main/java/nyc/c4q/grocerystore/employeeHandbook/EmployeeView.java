package nyc.c4q.grocerystore.employeeHandbook;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.grocerystore.R;
import nyc.c4q.grocerystore.employeeHandbook.employees.Hyunjoo;

public class EmployeeView extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_view);

    }
}
