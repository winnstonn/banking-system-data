package com.banking.system.data;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class TransferDataResponse {
    private String message;
}
