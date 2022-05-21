package com.example.core.utils;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.config.ConfigureBuilder;
import com.deepoove.poi.data.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * poi-tl word模板插件 具体使用参考 https://gitee.com/mirrors/poi-tl
 * */
public class PoitlTemplate {
    public static void main(String[] args) {

        try {
            ConfigureBuilder builder = Configure.newBuilder().setValidErrorHandler(new Configure.DiscardHandler());
            XWPFTemplate template = XWPFTemplate.compile("C:\\Users\\zeng\\Desktop\\docker\\test.docx", builder.build())
                    .render(new HashMap<String, Object>() {{
                        put("idea", "cbj");
                        put("station", new TextRenderData("00FF00", "智慧城市智慧交通部门运输组"));
                        put("department", new TextRenderData("00FF00", "智慧交通"));
                        put("worksummary", new PictureRenderData(1000, 500, "C:\\Users\\zeng\\Pictures\\Saved Pictures\\mm.jpg"));
                        put("sign", new PictureRenderData(500, 300, "C:\\Users\\zeng\\Pictures\\Saved Pictures\\cat.jpg"));
                        RowRenderData header = RowRenderData.build(new TextRenderData("00FF00", "姓名"), new TextRenderData("00FF00", "学历"));

                        RowRenderData row0 = RowRenderData.build("张三", "研究生");
                        RowRenderData row1 = RowRenderData.build("李四", "博士");

                        put("header", new MiniTableRenderData(header, Arrays.asList(row0, row1)));

                        put("list", new NumbericRenderData(new ArrayList<TextRenderData>() {
                            {
                                add(new TextRenderData("Plug-in function, define your own function"));
                                add(new TextRenderData("Supports word text, header..."));
                                add(new TextRenderData("Not just templates"));
                            }
                        }));
                    }});
            FileOutputStream out = new FileOutputStream("C:\\Users\\zeng\\Desktop\\docker\\out_template1.docx");

            template.write(out);
            out.flush();

            out.close();
            template.close();
        } catch (IOException e) {

        }
    }
}