package com.test.common.data;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xupanpan on 2017/11/29.
 */
@Getter
@Setter
@Builder
public class User {
  private String username;
  private String passpord;
}
