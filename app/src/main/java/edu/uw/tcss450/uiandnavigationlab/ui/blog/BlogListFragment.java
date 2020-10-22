package edu.uw.tcss450.uiandnavigationlab.ui.blog;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.uiandnavigationlab.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlogListFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blog_list, container, false);

        if(view instanceof RecyclerView){
            ((RecyclerView)view).setAdapter(new BlogRecyclerViewAdapter(BlogGenerator.getBlogList()));
        }
        return view;
    }
}