package com.baidu.pikaq.demo.service.campaign.service;

import java.math.BigDecimal;
import java.util.List;

import com.baidu.pikaq.demo.service.campaign.bo.Campaign;

/**
 *
 */
public interface CampaignMgr {

    /**
     * 根据APP名获取APP
     *
     * @param name
     */
    Campaign getByName(String name);

    /**
     * @return
     */
    List<Campaign> findAll();

    /**
     * @return
     */
    Campaign create(String name, BigDecimal price);

    /**
     * @param name
     * @param price
     *
     * @return
     */
    Campaign createWithConsumerErrorPikaQStrong(String name, BigDecimal price);

    /**
     * @param name
     * @param price
     *
     * @return
     */
    Campaign createWithConsumerErrorPikaQNormal(String name, BigDecimal price);

    /**
     * @param name
     * @param price
     *
     * @return
     */
    Campaign createWithConsumerError(String name, BigDecimal price);

    /**
     * @param campaignId
     * @param price
     *
     * @return
     */
    void update(Long campaignId, BigDecimal price);

}
