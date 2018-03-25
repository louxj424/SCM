package com.netease.SCM.dao;

import com.netease.SCM.entity.Account;

/**
 * Created by louxj424 on 2018/3/24.
 */
public interface AccountMapper extends BaseMapper<Account> {
    Account login(Account account);
}
