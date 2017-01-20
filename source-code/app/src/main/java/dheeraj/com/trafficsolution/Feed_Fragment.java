package dheeraj.com.trafficsolution;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import dheeraj.com.trafficsolution.Utils.SharedPreferenceMethods;

/**
 * Created by prasang7 on 28/12/16.
 */
public class Feed_Fragment extends Fragment {

    View view;
    FloatingActionButton mFab;

    public Feed_Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_feed, container, false);

        init();

        mFab = (FloatingActionButton) view.findViewById(R.id.fab);
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user == null || user.isAnonymous()) {
                    Toast.makeText(getActivity(), "You must sign-in to post.", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(getActivity(), "fab clicked", Toast.LENGTH_SHORT).show();
                //Intent newPostIntent = new Intent(getActivity(), NewPostActivity.class);
                //startActivity(newPostIntent);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }



    void init() {

        Typeface MontReg = Typeface.createFromAsset(getActivity().getApplication().getAssets(), "Montserrat-Regular.otf");
        Typeface MontBold = Typeface.createFromAsset(getActivity().getApplication().getAssets(), "Montserrat-Bold.otf");
        //Typeface MontHair = Typeface.createFromAsset(getApplication().getAssets(), "Montserrat-Hairline.otf");

    }
}