package co.mobiwise.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import co.mobiwise.recyclerview.R;
import co.mobiwise.recyclerview.model.CellDataItem;

/**
 * Created by mac on 09/04/15.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter {

    private List<CellDataItem> dataItems;

    // Adapter constructor
    public RecyclerViewAdapter(List<CellDataItem> dataItems) {

        this.dataItems = dataItems;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View layoutView = LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.item_detail, null);
        return new MyViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        CellDataItem dataItem = dataItems.get(position);
        // Casting the viewHolder to MyViewHolder so I could interact with the views
        MyViewHolder myViewHolder = (MyViewHolder) viewHolder;
        myViewHolder.colorBlock.setBackgroundColor(dataItem.getColor());
        myViewHolder.colorName.setText(dataItem.getName());
    }

    @Override
    public int getItemCount() {

        return dataItems.size();
    }

    /**
     * This is our ViewHolder class
     */
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView colorName;
        public View colorBlock;

        public MyViewHolder(View itemView) {
            super(itemView); // Must call super() first
            colorName = (TextView) itemView.findViewById(R.id.colorName);
            colorBlock = (View) itemView.findViewById(R.id.colorBlock);

        }
    }
}
