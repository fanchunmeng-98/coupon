package com.geekbang.coupon.calculation.controller.service.intf;

import com.geekbang.coupon.calculation.api.beans.ShoppingCart;
import org.springframework.web.bind.annotation.RequestBody;

public interface CouponCalculationService {

    ShoppingCart computeRule(@RequestBody ShoppingCart cart);
}
