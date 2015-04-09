package co.mobiwise.recyclerview.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import co.mobiwise.recyclerview.R;

/**
 * Created by mac on 09/04/15.
 */
public class MainFragment extends Fragment implements View.OnClickListener {

    private Button buttonLinearLayoutManager, buttonGridLayoutManager, buttonStaggeredGridLayoutManager;

    public MainFragment() {
    }

    /**
     * Static factory method returns the
     * new fragment to the client.
     */
    public static MainFragment newInstance() {
        MainFragment mainFragment = new MainFragment();
        return mainFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        buttonLinearLayoutManager = (Button) rootView.findViewById(R.id.buttonLinearLayoutManager);
        buttonGridLayoutManager = (Button) rootView.findViewById(R.id.buttonGridLayoutManager);
        buttonStaggeredGridLayoutManager = (Button) rootView.findViewById(R.id.buttonStaggeredGridLayoutManager);

        buttonLinearLayoutManager.setOnClickListener(this);
        buttonGridLayoutManager.setOnClickListener(this);
        buttonStaggeredGridLayoutManager.setOnClickListener(this);


        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonLinearLayoutManager:
                switchFragment(LinearLayoutManagerFragment.newInstance(), "LinearLayoutManagerFragment");
                break;
            case R.id.buttonGridLayoutManager:
                switchFragment(GridLayoutManagerFragment.newInstance(), "GridLayoutManagerFragment");
                break;
            case R.id.buttonStaggeredGridLayoutManager:
                switchFragment(StaggeredGridLayoutManagerFragment.newInstance(), "StaggeredGridLayoutManagerFragment");
                break;
            default:
                break;
        }
    }

    private void switchFragment(Fragment fragment, String tag) {
        getActivity().getSupportFragmentManager().beginTransaction()
                .add(R.id.container, fragment).addToBackStack(tag)
                .commit();
    }
}
