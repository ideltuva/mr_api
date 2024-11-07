package com.api.mr.api.web.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
public class GroupStatementId implements Serializable {
    private BigInteger movementId;
    private String invoiceNo;
    private Integer bundleNo;
}
