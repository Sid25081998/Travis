package dheeraj.com.trafficsolution;

import android.content.Intent;
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
public class GeoFenceFragment extends Fragment {


    View view;
    Button bt_startService, bt_stopService;

    public GeoFenceFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_geofence, container, false);

        init();

        bt_startService = (Button)view.findViewById(R.id.bt_geoFence_startService);
        bt_stopService = (Button)view.findViewById(R.id.bt_geoFence_stopService);

        bt_startService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().startService(new Intent(getActivity(), GeoFenceService.class));
            }
        });

        bt_stopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().stopService(new Intent(getActivity(), GeoFenceService.class));
            }
        });


        // Inflate the layout for this fragment
        return view;
    }



    void init() {

    }
}