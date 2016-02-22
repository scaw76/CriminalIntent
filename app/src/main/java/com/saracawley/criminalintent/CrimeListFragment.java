package com.saracawley.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by scawley on 2/22/16.
 */
public class CrimeListFragment extends Fragment {

    private RecyclerView mCrimRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crime_list,container,false);
        mCrimRecyclerView = (RecyclerView) view.findViewById(R.id.crime_recycler_view);
        return view;
    }

    private class CrimeHolder extends RecyclerView.ViewHolder{
        public TextView mTitleTextView;

        public CrimeHolder(View itemView){
            super(itemView);
            mTitleTextView = (TextView) itemView;
        }
    }
    private class CrimeAdapter extends RecyclerView.Adapter<CrimeHolder>{
        private List<Crime> mCrimes;
        public CrimeAdapter(List<Crime> crimes){
            mCrimes = crimes;
        }
        @Override
        public CrimeHolder onCreateViewHolder()
    }

}
