package co.mobiwise.recyclerview.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import co.mobiwise.recyclerview.R;
import co.mobiwise.recyclerview.adapter.RecyclerViewAdapter;
import co.mobiwise.recyclerview.model.CellDataItem;

/**
 * Created by mac on 09/04/15.
 */
public class LinearLayoutManagerFragment extends Fragment {

    public LinearLayoutManagerFragment() {
    }

    /**
     * Static factory method returns the
     * new fragment to the client.
     */
    public static LinearLayoutManagerFragment newInstance() {
        LinearLayoutManagerFragment linearLayoutManagerFragment = new LinearLayoutManagerFragment();
        return linearLayoutManagerFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);

        // Populating our data set
        List<CellDataItem> dataItems = new ArrayList<CellDataItem>();
        dataItems.add(new CellDataItem("Indigo", "#3F51B5"));
        dataItems.add(new CellDataItem("Pink", "#E91E63"));
        dataItems.add(new CellDataItem("Orange", "#FF5722"));
        dataItems.add(new CellDataItem("Green", "#4CAF50"));
        dataItems.add(new CellDataItem("Grey", "#607D8B"));
        dataItems.add(new CellDataItem("Cyan", "#00BCD4"));
        dataItems.add(new CellDataItem("Amber", "#FFC107"));
        dataItems.add(new CellDataItem("Brown", "#795548"));
        dataItems.add(new CellDataItem("Blue", "#03A9F4"));
        dataItems.add(new CellDataItem("Red", "#F44336"));

        // Creating new adapter object
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(dataItems);
        recyclerView.setAdapter(myAdapter);

        // Setting the layoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }
}
