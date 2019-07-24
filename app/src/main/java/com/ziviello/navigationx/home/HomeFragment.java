package com.ziviello.navigationx.home;


import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.fragment.NavHostFragment;
import com.ziviello.navigationx.R;
import com.ziviello.navigationx.databinding.FragmentMainBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements HomeInteraction {

    private FragmentMainBinding fragmentMainBinding;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragmentMainBinding.setViewModel(ViewModelProviders.of(this,new HomeViewModel.Factory(this)).get(HomeViewModel.class));
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        fragmentMainBinding = fragmentMainBinding.inflate(inflater);
        fragmentMainBinding.setLifecycleOwner(this);
        return fragmentMainBinding.getRoot();
    }


    @Override
    public void gotoContact()
    {
        NavHostFragment.findNavController(HomeFragment.this).navigate(R.id.action_mainFragment_to_contactFragment);
    }

}
