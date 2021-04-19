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


public class UpdateAccountFragment extends Fragment {
    UpdateAccountListener mListener;
    EditText editTextEmailAddress, editTextPassword, editTextName;

    public UpdateAccountFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_create_account, container, false);

        getActivity().setTitle("Update Account");

        editTextEmailAddress = view.findViewById(R.id.editTextForumDesc);
        editTextPassword = view.findViewById(R.id.editTextPassword);
        editTextName = view.findViewById(R.id.editTextForumTitle);
        editTextEmailAddress.setText("a@a.com");
        editTextPassword.setText("test123");

        view.findViewById(R.id.buttonCreateAccountSubmit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();
                String email = editTextEmailAddress.getText().toString();
                String password = editTextPassword.getText().toString();

                if(name.isEmpty()){
                    Toast.makeText(getActivity(), "Name is required", Toast.LENGTH_SHORT).show();
                } else if(email.isEmpty()){
                    Toast.makeText(getActivity(), "Email is required", Toast.LENGTH_SHORT).show();
                } else if(password.isEmpty()){
                    Toast.makeText(getActivity(), "Password is required", Toast.LENGTH_SHORT).show();
                } else {
                    //create account and go to restaurants page
                    mListener.goToAccount();

                }
            }
        });

        view.findViewById(R.id.buttonCancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.goToAccount();
            }
        });

        return view;
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            mListener = (UpdateAccountFragment.UpdateAccountListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement RegisterListener");
        }
    }

    interface UpdateAccountListener{
        void goToAccount();

    }
}