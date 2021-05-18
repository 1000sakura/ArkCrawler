package cn.konat4.crawlerarknights.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.konat4.crawlerarknights.pojo.Operator;
import cn.konat4.crawlerarknights.service.OperatorService;

@Component
public class OperatorUtils {

    @Autowired
    HttpUtils httpUtils;
    @Autowired
    OperatorService operatorService;

    public HashMap<String, Integer> materials = new HashMap<String, Integer>();
    public HashMap<String, Integer> chip = new HashMap<String, Integer>();
    public HashMap<String, Integer> consumables = new HashMap<String, Integer>();

    public enum Materials {
        D32钢("D32钢"), 双极纳米片("双极纳米片"), 聚合剂("聚合剂"), 晶体电子单元("晶体电子单元"),
        白马醇("白马醇"), 三水锰矿("三水锰矿"), 五水研磨石("五水研磨石"), RMA7024("RMA70-24"), 聚合凝胶("聚合凝胶"), 炽合金块("炽合金块"), 晶体电路("晶体电路"),
        扭转醇("扭转醇"), 轻锰矿("轻锰矿"), 研磨石("研磨石"), RMA7012("RMA70-12"), 凝胶("凝胶"), 炽合金("炽合金"), 晶体元件("晶体元件"),
        提纯源岩("提纯源岩"), 改量装置("改量装置"), 聚酸酯块("聚酸酯块"), 糖聚块("糖聚块"), 异铁块("异铁块"), 酮阵列("酮阵列"),
        固源岩组("固源岩组"), 全新装置("全新装置"), 聚酸酯组("聚酸酯组"), 糖组("糖组"), 异铁组("异铁组"), 酮凝集组("酮凝集组"),
        固源岩("固源岩"), 装置("装置"), 聚酸酯("聚酸酯"), 糖("糖"), 异铁("异铁"), 酮凝集("酮凝集"),
        源岩("源岩"), 破损装置("破损装置"), 酯原料("酯原料"), 代糖("代糖"), 异铁碎片("异铁碎片"), 双酮("双酮");

        public String fieldName;

        private Materials(String name) {
            this.fieldName = name;
        }
    }

    public enum Chip {
        先锋双芯片, 先锋芯片组, 先锋芯片,
        近卫双芯片, 近卫芯片组, 近卫芯片,
        重装双芯片, 重装芯片组, 重装芯片,
        狙击双芯片, 狙击芯片组, 狙击芯片,
        术师双芯片, 术师芯片组, 术师芯片,
        医疗双芯片, 医疗芯片组, 医疗芯片,
        辅助双芯片, 辅助芯片组, 辅助芯片,
        特种双芯片, 特种芯片组, 特种芯片;
    }

    public enum Consumables {
        龙门币("龙门币"), 技巧概要卷1("技巧概要·卷1"), 技巧概要卷2("技巧概要·卷2"), 技巧概要卷3("技巧概要·卷3");

        public String fieldName;

        private Consumables(String name) {
            this.fieldName = name;
        }
    }

    public void getAllMaterials(HttpUtils httpUtils) {
        // String url = "http://prts.wiki/w/道具一览";
        // String html = httpUtils.doGetHtml(url);
        // Document doc = Jsoup.parse(html);
        // Elements divs = doc.select("div#filter-wrapper > div#filter_result > div.item-icon-wrapper");
        
        // for(Element div : divs) {
        //     if(div.getElementsByTag("a").first() != null)
        //     System.out.println(div.getElementsByTag("a").first().attr("href"));
        // }
    }

    public void addAllOperator() throws IOException {
        Document doc = Jsoup.parse(new File("assets\\prts.html"), "utf8");
        Elements divs = doc.select("table.wikitable > tbody > tr.result-row > td > div");
        
        String res;

        Stack<String> s = new Stack<String>();
        int id = 1;

        for(Element div : divs) {
            if(div.getElementsByTag("a").first() != null) {
                res = div.getElementsByTag("div").first().text();
                String[] strs = res.split(" ");
                if(strs[0] != "") {
                    s.push(strs[0]);
                }
            }
        }
        while(!s.empty()) {
            Operator operator = new Operator();
            operator.setId(id);
            operator.setName(s.pop());
            s.pop();
            this.operatorService.save(operator);
            id++;
        }
    }
}
