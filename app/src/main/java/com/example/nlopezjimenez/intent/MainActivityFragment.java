package com.example.nlopezjimenez.intent;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_main, container, false);

        Button boton = (Button) vista.findViewById(R.id.button1);

    boton.setOnClickListener( new View.OnClickListener() {
        public void onClick(View vista) {
            Intent intent = new Intent(getActivity(), Main2Activity.class);
            startActivity(intent);
        }
    });
        return vista;
}
}
