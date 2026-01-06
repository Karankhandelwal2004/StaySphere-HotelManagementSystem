package com.coding.projects.airBnbApp.service;

import com.coding.projects.airBnbApp.entity.Booking;

public interface CheckoutService {
    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);
}
