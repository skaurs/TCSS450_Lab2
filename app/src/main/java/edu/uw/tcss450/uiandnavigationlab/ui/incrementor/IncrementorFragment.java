package edu.uw.tcss450.uiandnavigationlab.ui.incrementor;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.uiandnavigationlab.R;
import edu.uw.tcss450.uiandnavigationlab.databinding.FragmentIncrementorBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class IncrementorFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_incrementor, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FragmentIncrementorBinding binding = FragmentIncrementorBinding.bind(getView());

        binding.textCount.setText("My Count is 0");

        //obtain access to ViewModel
        IncrementorViewModel model = new ViewModelProvider(this).get(IncrementorViewModel.class);

        //add observer to the MutableLiveData - mCount
        model.addCountObserver(getViewLifecycleOwner(), count ->
                binding.textCount.setText("My Count is: " + model.getCount()));

        //On button click increase MutableLiveData -mcount
        binding.buttonIncrease.setOnClickListener(button -> model.increment());
    }
}