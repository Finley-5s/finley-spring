package com.finley.importAndExport.entity;


import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import com.finley.importAndExport.common.ExcelColumn;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName MdmHouse
 * @Description TODO
 * @Auth Finley
 * @Date 2019/03/05 14:13
 * @Version 1.0
 **/
@Data
@ExcelTarget("20")
@ToString
public class MdmHouseExportTemplate implements Serializable {

    private static final long serialVersionUID = 7724048737717251531L;

    @ExcelColumn(value = "项目分期名称", col = 1)
    private  String wy_pk_devstages_name;

    @ExcelColumn(value = "房产编码", col = 2)
    private  String code;

    @ExcelColumn(value = "地产房名", col=3)
    private  String landhousename;

    @ExcelColumn(value = "房号", col=4)
    private  String houseNum;

    @ExcelColumn(value = "单元", col=5)
    private  String houseunit;

    @ExcelColumn(value = "楼层", col=6)
    private  String housefloor;

    @ExcelColumn(value = "楼栋名称", col=7)
    private  String pk_building_name;

    @ExcelColumn(value = "户型名称", col=8)
    private  String housetype;

    @ExcelColumn(value = "朝向名称", col=9)
    private  String cxName;

    @ExcelColumn(value = "业态类型", col=9)
    private  String houseSort;

    @ExcelColumn(value = "建筑面积", col=10)
    private  String realbldarea;


    @ExcelColumn(value = "房产主键", col=11)
    private  String mdm_code;

    @ExcelColumn(value = "物业房名", col=12)
    private  String wyhousename;
}
