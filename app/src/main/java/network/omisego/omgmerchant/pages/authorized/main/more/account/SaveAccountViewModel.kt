package network.omisego.omgmerchant.pages.authorized.main.more.account

/*
 * OmiseGO
 *
 * Created by Phuchit Sirimongkolsathien on 29/8/2018 AD.
 * Copyright © 2017-2018 OmiseGO. All rights reserved.
 */

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import co.omisego.omisego.model.Account

class SaveAccountViewModel : ViewModel() {
    val liveSaveAccount: MutableLiveData<Account> = MutableLiveData()
}
