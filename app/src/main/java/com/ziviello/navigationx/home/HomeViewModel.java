package com.ziviello.navigationx.home;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

public class HomeViewModel extends ViewModel {

    private HomeInteraction homeInteraction;

    public HomeViewModel(HomeInteraction interaction) {

        homeInteraction =interaction;
    }

    public void clickContact(){
        homeInteraction.gotoContact();
    }


    public static class Factory implements ViewModelProvider.Factory {

        private HomeInteraction interaction;

        public Factory(HomeInteraction interaction) {
            this.interaction = interaction;
        }

       @NonNull
       @Override
       public HomeViewModel create(@NonNull Class modelClass){
            return new HomeViewModel(interaction);
       }
    }


}
