package com.apdoer.web.com.apdoer.web.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author apdoer
 * @Description TODO
 * @CreateDate 2019/4/5-21:29
 * @Version 1.0
 * ===============================
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String sex;
}
