package com.apdoer.springbootmybatis.com.apdoer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Description user
 * @Author apdoer
 * @Date 2019/4/18 20:31
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private static final long	serialVersionUID	= 6215706484608288089L;

    // 用户ID
    private Long				userId;

    // 账号
    private String				account;
    // 用户名称
    private String				name;
    // 邮箱
    private String				email;
    // 密码
    private String				password;
    // google密钥
    private String				googleCode;

    private String				avator;
    // 启用状态（0：启用，1:不启用，2:删除）
    private Byte				enabled;
    // 备注
    private String				remark;
    // 创建时间
    private Date createTime;
}
