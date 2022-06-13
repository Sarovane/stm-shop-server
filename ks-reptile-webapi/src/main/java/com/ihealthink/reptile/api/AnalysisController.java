package com.ihealthink.reptile.api;


import com.ihealthink.reptile.common.utils.ResultEntity;
import com.ihealthink.reptile.service.AnalysisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Sarovane
 */
@Api(value = "解析美年html报告", tags = {"解析html报告信息"})
@RestController
@RequestMapping("analysis")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AnalysisController {

    private final AnalysisService analysisService;



    /**
     * 解析获取报告信息
     *
     * @param htmlReport html报告字符串
     * @return 新增结果
     */
    @ApiOperation(value = "添加部门信息", notes = "添加部门信息", httpMethod = "POST")
    @PostMapping("report")
    public ResultEntity analysisReport(@RequestBody String htmlReport) {
        analysisService.analysisReport(htmlReport);
       return ResultEntity.ok();
    }

}

