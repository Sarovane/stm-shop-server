package com.ihealthink.reptile.service.impl;

import com.ihealthink.reptile.common.utils.AnalysisHtmlUtils;
import com.ihealthink.reptile.common.utils.PDFUtil;
import com.ihealthink.reptile.service.AnalysisService;
import com.itextpdf.html2pdf.HtmlConverter;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Sarovane
 * @description:
 * @date: 2022/6/13
 */
@Service
@Slf4j
public class AnalysisServiceImpl implements AnalysisService {
    @Override
    public Boolean analysisReport(String htmlReport) {
        log.info("解析报告传入参数为L{}", htmlReport);
        Document document = Jsoup.parse(htmlReport);
        //将数据拼接为完整的html格式数据
        analysisUserInfo(document);

        try {
            // 将html转换成pdf
            FileOutputStream os =new FileOutputStream("D:\\project");
            HtmlConverter.convertToPdf(document.html(),os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 调用文件服务器将数据存储
        //调用体检预约系统，完成数据绑定。

        //


        return null;
    }

    private Document analysisUserInfo(Document document) {
        //解析获取用户报告信息
        document.head().append(AnalysisHtmlUtils.buildStyleString().toString());
        Elements images = document.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
        for (Element image : images) {
            String src = image.attr("src");
            if (src.equals(AnalysisHtmlUtils.Prefix.IMG_WEIXIN)) {
                image.attr("src", AnalysisHtmlUtils.buildWINXINString().toString());
            }
            if (src.equals(AnalysisHtmlUtils.Prefix.IMG_M)) {
                image.attr("src", AnalysisHtmlUtils.buildImgMString().toString());
            }
            if (src.equals(AnalysisHtmlUtils.Prefix.IMG_F)) {
                image.attr("src", AnalysisHtmlUtils.buildImgFString().toString());
            }
        }

        return document;
    }


}
