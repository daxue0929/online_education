package com.atguigu.service_base.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author daxue0929
 * @date 2022/10/18
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuiliException extends RuntimeException{
    private Integer code;
    private String msg;
}
