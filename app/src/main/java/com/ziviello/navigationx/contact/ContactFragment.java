package com.ziviello.navigationx.contact;


import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.fragment.NavHostFragment;

import com.ziviello.navigationx.databinding.FragmentContactBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment implements ContactInteraction{

    private FragmentContactBinding fragmentContactBinding;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragmentContactBinding.setViewModel(ViewModelProviders.of(this,new ContactViewModel.Factory(this)).get(ContactViewModel.class));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentContactBinding = fragmentContactBinding.inflate(inflater);
        fragmentContactBinding.setLifecycleOwner(this);
        return fragmentContactBinding.getRoot();
    }


    @Override
    public void gotoHome() {
        NavHostFragment.findNavController(ContactFragment.this).popBackStack();
    }

}

