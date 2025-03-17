package com.ancla.admin.strategies;

import com.ancla.admin.AdminStrategy;
import com.ancla.utils.TextUtils;

public class CheckIngredientsStrategy implements AdminStrategy {
  @Override
  public void execute() {
    System.out.println(TextUtils.printAdminOptions());
  }
}
