package com.example.lettuceeat;

import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class LoginFragment extends Fragment {

    LoginListener mListener;
    EditText editTextEmailAddress, editTextPassword;

    public LoginFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        editTextEmailAddress = view.findViewById(R.id.editTextForumDesc);
        editTextPassword = view.findViewById(R.id.editTextPassword);

        editTextEmailAddress.setText("a@a.com");
        editTextPassword.setText("test123");
        getActivity().setTitle("Login");

        view.findViewById(R.id.buttonLoginSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editTextEmailAddress.getText().toString();
                String password = editTextPassword.getText().toString();

                if(email.isEmpty()){
                    Toast.makeText(getActivity(), "Email is required", Toast.LENGTH_SHORT).show();
                } else if(password.isEmpty()){
                    Toast.makeText(getActivity(), "Password is required", Toast.LENGTH_SHORT).show();
                } else {
                    //initiate the asyctask.

                    mListener.goToRestaurants();
                }
            }
        });

        view.findViewById(R.id.buttonCreateAccount).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.gotoCreateAccount();
            }
        });

        return view;
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            mListener = (LoginListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement LoginListener");
        }
    }

    interface LoginListener{
        void goToRestaurants();
        void gotoCreateAccount();
    }
}