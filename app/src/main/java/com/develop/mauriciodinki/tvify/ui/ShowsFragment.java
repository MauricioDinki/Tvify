package com.develop.mauriciodinki.tvify.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.develop.mauriciodinki.tvify.R;
import com.develop.mauriciodinki.tvify.domain.Show;
import com.develop.mauriciodinki.tvify.io.TvMazeApiAdapter;
import com.develop.mauriciodinki.tvify.io.model.ShowsResponse;
import com.develop.mauriciodinki.tvify.ui.adapter.ShowListAdapter;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by mauriciodinki on 23/12/15.
 */
public class ShowsFragment extends Fragment implements Callback<ShowsResponse> {

    public static final int NUM_COLUMNS = 2;
    private RecyclerView mShowList;
    private ShowListAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new ShowListAdapter(getActivity());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_show_list, container, false);

        mShowList = (RecyclerView) root.findViewById(R.id.show_list);

        setupArtistsList();

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
       TvMazeApiAdapter.getApiService()
                .getShows(this);
    }

    private void setupArtistsList () {
        mShowList.setLayoutManager(new GridLayoutManager(getActivity(), NUM_COLUMNS));
        mShowList.setAdapter(adapter);
        mShowList.addItemDecoration(new ItemOffsetDecoration(getActivity(), R.integer.offset));
    }


    @Override
    public void success(ShowsResponse showsResponse, Response response) {
        adapter.addAll(showsResponse.getShows());
    }

    @Override
    public void failure(RetrofitError error) {
        error.printStackTrace();
    }
}
