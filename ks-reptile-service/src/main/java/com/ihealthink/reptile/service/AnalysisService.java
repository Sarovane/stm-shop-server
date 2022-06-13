package com.ihealthink.reptile.service;

/**
 * @author Sarovane
 * @description: 解析美年报告
 * @date: 2022/6/13
 */
public interface AnalysisService {

    /**
     * 解析美年报告，将报告转换成pdf
     * @param htmlReport html报告
     * @return 解析成功
     *
     */
    Boolean analysisReport(String htmlReport);
}
