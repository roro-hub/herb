package com.herb.dao;

import com.herb.dto.PriceDto;

import java.util.Date;
import java.util.List;

public interface PriceDao {

    List<PriceDto> groupByMonth(String name,
                                String origin,
                                String site,
                                Date startTime,
                                Date endTime);

    Date getLatestDate();

    List<String> getSiteList(String name, String standard, String origin, Date startDate, Date endDate);
}
