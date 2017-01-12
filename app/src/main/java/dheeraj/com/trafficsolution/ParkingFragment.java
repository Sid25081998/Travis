package dheeraj.com.trafficsolution;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by prasang7 on 28/12/16.
 */
public class ParkingFragment extends Fragment {

    View view;
    Button find_2wheeler_Parking, find_4wheeler_Parking;

    public ParkingFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_parking, container, false);
        init();

        find_2wheeler_Parking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), ParkingSearchResult.class);
                i.putExtra("key", "2 Wheeler");
                startActivity(i);
            }
        });

        find_4wheeler_Parking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), ParkingSearchResult.class);
                i.putExtra("key", "4 Wheeler");
                startActivity(i);
            }
        });

        return view;
    }

    void init() {
        find_2wheeler_Parking = (Button) view.findViewById(R.id.bt_find_2wheeler_parking);
        find_4wheeler_Parking = (Button) view.findViewById(R.id.bt_find_4wheeler_parking);
    }
}