package com.rhl.mcy.openhis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleUser implements Serializable {

    private Serializable userId;
  private String userName;

}
