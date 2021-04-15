package com.example.lettuceeat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LoginFragment.LoginListener,
        CreateAccountFragment.RegisterListener, RestaurantsFragment.RestaurantListener,
        UpdateAccountFragment.UpdateAccountListener, SettingsFragment.SettingsListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.rootView, new LoginFragment())
                .commit();
    }

    @Override
    public void goToRestaurants() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.rootView, new RestaurantsFragment())
                .commit();
    }

    @Override
    public void gotoLogin() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.rootView, new LoginFragment())
                .commit();
    }

    @Override
    public void gotoCreateAccount() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.rootView, new CreateAccountFragment())
                .commit();
    }

    @Override
    public void gotoUpdate() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.rootView, new UpdateAccountFragment())
                .commit();
    }

    @Override
    public void gotoSettings() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.rootView, new SettingsFragment())
                .commit();
    }

    @Override
    public void logout() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.rootView, new LoginFragment())
                .commit();
    }
}