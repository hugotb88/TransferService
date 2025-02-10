package com.appsdeveloperblog.estore.transfers.service;

import com.appsdeveloperblog.estore.transfers.io.model.TransferRestModel;

public interface TransferService {
    public boolean transfer(TransferRestModel productPaymentRestModel);
}
