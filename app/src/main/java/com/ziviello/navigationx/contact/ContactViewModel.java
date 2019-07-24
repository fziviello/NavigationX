package com.ziviello.navigationx.contact;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

public class ContactViewModel extends ViewModel {

    private ContactInteraction contactInteraction;

    public ContactViewModel(ContactInteraction contactInteraction) {
        this.contactInteraction = contactInteraction;
    }

    public void clickHome()
    {
        contactInteraction.gotoHome();
    }


    public static class Factory implements ViewModelProvider.Factory {

        private ContactInteraction interaction;

        public Factory(ContactInteraction interaction) {
            this.interaction = interaction;
        }

        @NonNull
        @Override
        public ContactViewModel create(@NonNull Class modelClass){
            return new ContactViewModel(interaction);
        }
    }
}
