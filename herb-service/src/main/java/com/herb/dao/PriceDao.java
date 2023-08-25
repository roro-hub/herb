package com.herb.dao;

import com.herb.dto.PriceDto;

import java.util.Date;
import java.util.List;

public interface PriceDao {

    List<PriceDto> groupByMonth(List<String> names, List<String> standards, Date startTime, Date endTime);
}
