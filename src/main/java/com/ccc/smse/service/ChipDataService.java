package com.ccc.smse.service;

import com.ccc.smse.pojo.ChipData;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cyb
 * @Date: 2019-03-18 20:11
 * @Version 1.0
 */

public interface ChipDataService {
    public List<ChipData> findAll();
}
