package edu.uw.tcss450.uiandnavigationlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import edu.uw.tcss450.uiandnavigationlab.model.UserInfoViewModel;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivityArgs args = MainActivityArgs.fromBundle(getIntent().getExtras());
        String email = args.getEmail();

        //userInfo from part 2 of lab step 28
        //part3 step 40
        new ViewModelProvider(this,
                new UserInfoViewModel.UserInfoViewModelFactory(email)).get(UserInfoViewModel.class);
    }

}
