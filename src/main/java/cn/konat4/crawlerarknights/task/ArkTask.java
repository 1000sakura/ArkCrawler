package cn.konat4.crawlerarknights.task;

import java.io.IOException;
import java.util.List;

import org.hibernate.internal.CriteriaImpl.OrderEntry;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cn.konat4.crawlerarknights.pojo.Operator;
import cn.konat4.crawlerarknights.service.OperatorService;
import cn.konat4.crawlerarknights.util.HttpUtils;
import cn.konat4.crawlerarknights.util.OperatorUtils;
import cn.konat4.crawlerarknights.util.OperatorUtils.Chip;
import cn.konat4.crawlerarknights.util.OperatorUtils.Consumables;
import cn.konat4.crawlerarknights.util.OperatorUtils.Materials;

@Component
@SuppressWarnings("unused")
public class ArkTask {

    @Autowired
    HttpUtils httpUtils;
    @Autowired
    OperatorService operatorService;
    @Autowired
    OperatorUtils operatorUtils;

    @Scheduled(fixedDelay = 3600 * 1000)
    public void arkTask() throws Exception {

        initOperatorUtils();

        List<Operator> operatorlist = this.operatorService.findAll();

        // ---------------------------------------------------------------cralwer
        // String url = "http://prts.wiki/w/";

        // for(Operator operator : operatorlist) {
        // String html = httpUtils.doGetHtml(url + operator.getName());
        // this.parse(html, operator);
        // }

        // OperatorUtils operatorUtils = new OperatorUtils();
        // operatorUtils.getAllMaterials(httpUtils);

        // -----------------------------------------------------------------all
        // for (Operator operator : operatorlist) {
        //     if (operator.getElite1() != null) {
        //         String[] resources = operator.getElite1().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getElite2() != null) {
        //         String[] resources = operator.getElite2().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getSkillLevel2() != null) {
        //         String[] resources = operator.getSkillLevel2().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getSkillLevel3() != null) {
        //         String[] resources = operator.getSkillLevel3().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getSkillLevel4() != null) {
        //         String[] resources = operator.getSkillLevel4().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getSkillLevel5() != null) {
        //         String[] resources = operator.getSkillLevel5().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getSkillLevel6() != null) {
        //         String[] resources = operator.getSkillLevel6().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getSkillLevel7() != null) {
        //         String[] resources = operator.getSkillLevel7().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getSkill1Grade1() != null) {
        //         String[] resources = operator.getSkill1Grade1().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getSkill1Grade2() != null) {
        //         String[] resources = operator.getSkill1Grade2().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getSkill1Grade3() != null) {
        //         String[] resources = operator.getSkill1Grade3().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getSkill2Grade1() != null) {
        //         String[] resources = operator.getSkill2Grade1().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getSkill2Grade2() != null) {
        //         String[] resources = operator.getSkill2Grade2().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getSkill2Grade3() != null) {
        //         String[] resources = operator.getSkill2Grade3().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getSkill3Grade1() != null) {
        //         String[] resources = operator.getSkill3Grade1().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getSkill3Grade2() != null) {
        //         String[] resources = operator.getSkill3Grade2().split(",");
        //         addResource(resources);
        //     }
        //     if (operator.getSkill3Grade3() != null) {
        //         String[] resources = operator.getSkill3Grade3().split(",");
        //         addResource(resources);
        //     }
        // }

        String[] resources = null;
        Operator operator = new Operator();

        operator = operatorService.findByName("凯尔希");
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("傀影");
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("煌");
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("浊心斯卡蒂");
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("歌蕾蒂娅");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("歌蕾蒂娅");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("歌蕾蒂娅");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("斯卡蒂");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("斯卡蒂");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("棘刺");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("灰烬");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("史尔特尔");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("年");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("年");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);
        
        operator = operatorService.findByName("年");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("麦哲伦");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("麦哲伦");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("刻俄柏");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("刻俄柏");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("赫拉格");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("赫拉格");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("森蚺");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("森蚺");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("闪灵");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("夜莺");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("莫斯提马");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("夕");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("夕");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("银灰");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("能天使");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("陈");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("黑");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("推进之王");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("迷迭香");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("铃兰");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("斯卡蒂");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("斯卡蒂");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("阿");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("阿");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("空弦");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("红");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("食铁兽");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("星极");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("真理");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("崖心");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);
        
        operator = operatorService.findByName("阿米娅(近卫)");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        mergeResource();

        System.out.println();
        System.out.println(operatorUtils.materials);
        System.out.println();
        System.out.println(operatorUtils.chip);
        System.out.println();
        System.out.println(operatorUtils.consumables);
        System.out.println();

        System.out.println("complete");
    }

    private void parse(String html, Operator operator) throws IOException {

        Document doc = Jsoup.parse(html);
        // 获取所有table.wikitable > tbody > tr
        Elements trs = doc.select("table.wikitable.logo > tbody > tr");
        String res;
        int pointer = 0;
        boolean isAnswer = false;

        for (Element tr : trs) {
            // 有的tr只有th没有td
            if (tr.parent().parent().hasClass("nomobile")) {
                continue;
            }
            // System.out.println(tr.parent().parent().classNames().toString());

            Elements tds = tr.getElementsByTag("td");
            // tds一定不是null, 但tds.first()或许是null
            if (tds.first() != null) {
                for (Element td : tds) {
                    Elements divs = td.getElementsByTag("div");
                    res = "";
                    if (divs.first() != null) {
                        for (Element div : divs) {
                            if (div.getElementsByTag("a").first() != null
                                    && div.getElementsByTag("span").first() != null) {
                                String resourceName = div.getElementsByTag("a").first().attr("title");
                                String resourceUse = div.getElementsByTag("span").first().text();
                                if (operatorUtils.materials.containsKey(resourceName)) {
                                    isAnswer = true;
                                } else if (operatorUtils.chip.containsKey(resourceName)) {
                                    isAnswer = true;
                                } else if (operatorUtils.consumables.containsKey(resourceName)) {
                                    isAnswer = true;
                                } else {
                                    continue;
                                }
                                res = res + resourceName + "," + resourceUse + ",";
                            }
                        }
                    }

                    if (isAnswer) {
                        switch (pointer) {
                            case 0:
                                operator.setElite1(res);
                                break;
                            case 1:
                                operator.setElite2(res);
                                break;
                            case 2:
                                operator.setSkillLevel2(res);
                                break;
                            case 3:
                                operator.setSkillLevel3(res);
                                break;
                            case 4:
                                operator.setSkillLevel4(res);
                                break;
                            case 5:
                                operator.setSkillLevel5(res);
                                break;
                            case 6:
                                operator.setSkillLevel6(res);
                                break;
                            case 7:
                                operator.setSkillLevel7(res);
                                break;
                            case 8:
                                operator.setSkill1Grade1(res);
                                break;
                            case 9:
                                operator.setSkill1Grade2(res);
                                break;
                            case 10:
                                operator.setSkill1Grade3(res);
                                break;
                            case 11:
                                operator.setSkill2Grade1(res);
                                break;
                            case 12:
                                operator.setSkill2Grade2(res);
                                break;
                            case 13:
                                operator.setSkill2Grade3(res);
                                break;
                            case 14:
                                operator.setSkill3Grade1(res);
                                break;
                            case 15:
                                operator.setSkill3Grade2(res);
                                break;
                            case 16:
                                operator.setSkill3Grade3(res);
                                break;
                            default:
                                break;
                        }
                        pointer++;
                        // this.operatorService.update(operator.getId());
                        this.operatorService.save(operator);
                    }
                    // if (res != "") {
                    // System.out.println(res);
                    // }
                }
            }

        }

        operator.operatorInfo();

        // Elements divs = doc.select("div");
        // res = "";
        // if(divs.first() != null) {
        // for(Element div : divs){
        // if(div.getElementsByTag("a").first() != null &&
        // div.getElementsByTag("span").first() != null) {
        // res = res + div.getElementsByTag("a").first().attr("title") +
        // ": " + div.getElementsByTag("span").first().text() + ",";
        // }
        // }
        // }
        // if(res != "") {
        // System.out.println(res);
        // }
    }

    private void mergeResource() {
        Integer resourceUse;

        resourceUse = operatorUtils.materials.get("D32钢");
        operatorUtils.materials.put("三水锰矿", operatorUtils.materials.get("三水锰矿") + resourceUse);
        operatorUtils.materials.put("五水研磨石", operatorUtils.materials.get("五水研磨石") + resourceUse);
        operatorUtils.materials.put("RMA70-24", operatorUtils.materials.get("RMA70-24") + resourceUse);
        operatorUtils.materials.put("D32钢", 0);

        resourceUse = operatorUtils.materials.get("双极纳米片");
        operatorUtils.materials.put("改量装置", operatorUtils.materials.get("改量装置") + resourceUse);
        operatorUtils.materials.put("白马醇", operatorUtils.materials.get("白马醇") + resourceUse*2);
        operatorUtils.materials.put("双极纳米片", 0);

        resourceUse = operatorUtils.materials.get("聚合剂");
        operatorUtils.materials.put("提纯源岩", operatorUtils.materials.get("提纯源岩") + resourceUse);
        operatorUtils.materials.put("异铁块", operatorUtils.materials.get("异铁块") + resourceUse);
        operatorUtils.materials.put("酮阵列", operatorUtils.materials.get("酮阵列") + resourceUse);
        operatorUtils.materials.put("聚合剂", 0);

        resourceUse = operatorUtils.materials.get("晶体电子单元");
        operatorUtils.materials.put("晶体电路", operatorUtils.materials.get("晶体电路") + resourceUse);
        operatorUtils.materials.put("聚合凝胶", operatorUtils.materials.get("聚合凝胶") + resourceUse*2);
        operatorUtils.materials.put("炽合金块", operatorUtils.materials.get("炽合金块") + resourceUse);
        operatorUtils.materials.put("晶体电子单元", 0);

        resourceUse = operatorUtils.materials.get("白马醇");
        operatorUtils.materials.put("扭转醇", operatorUtils.materials.get("扭转醇") + resourceUse);
        operatorUtils.materials.put("糖组", operatorUtils.materials.get("糖组") + resourceUse);
        operatorUtils.materials.put("RMA70-12", operatorUtils.materials.get("RMA70-12") + resourceUse);
        operatorUtils.materials.put("白马醇", 0);

        resourceUse = operatorUtils.materials.get("三水锰矿");
        operatorUtils.materials.put("轻锰矿", operatorUtils.materials.get("轻锰矿") + resourceUse*2);
        operatorUtils.materials.put("聚酸酯组", operatorUtils.materials.get("聚酸酯组") + resourceUse);
        operatorUtils.materials.put("扭转醇", operatorUtils.materials.get("扭转醇") + resourceUse);
        operatorUtils.materials.put("三水锰矿", 0);

        resourceUse = operatorUtils.materials.get("五水研磨石");
        operatorUtils.materials.put("研磨石", operatorUtils.materials.get("研磨石") + resourceUse);
        operatorUtils.materials.put("异铁组", operatorUtils.materials.get("异铁组") + resourceUse);
        operatorUtils.materials.put("全新装置", operatorUtils.materials.get("全新装置") + resourceUse);
        operatorUtils.materials.put("五水研磨石", 0);

        resourceUse = operatorUtils.materials.get("RMA70-24");
        operatorUtils.materials.put("RMA70-12", operatorUtils.materials.get("RMA70-12") + resourceUse);
        operatorUtils.materials.put("固源岩组", operatorUtils.materials.get("固源岩组") + resourceUse*2);
        operatorUtils.materials.put("酮凝集组", operatorUtils.materials.get("酮凝集组") + resourceUse);
        operatorUtils.materials.put("RMA70-24", 0);

        resourceUse = operatorUtils.materials.get("提纯源岩");
        operatorUtils.materials.put("固源岩组", operatorUtils.materials.get("固源岩组") + resourceUse*4);
        operatorUtils.materials.put("提纯源岩", 0);

        resourceUse = operatorUtils.materials.get("改量装置");
        operatorUtils.materials.put("全新装置", operatorUtils.materials.get("全新装置") + resourceUse);
        operatorUtils.materials.put("固源岩组", operatorUtils.materials.get("固源岩组") + resourceUse*2);
        operatorUtils.materials.put("研磨石", operatorUtils.materials.get("研磨石") + resourceUse);
        operatorUtils.materials.put("改量装置", 0);

        resourceUse = operatorUtils.materials.get("聚酸酯块");
        operatorUtils.materials.put("聚酸酯组", operatorUtils.materials.get("聚酸酯组") + resourceUse*2);
        operatorUtils.materials.put("酮凝集组", operatorUtils.materials.get("酮凝集组") + resourceUse);
        operatorUtils.materials.put("扭转醇", operatorUtils.materials.get("扭转醇") + resourceUse);
        operatorUtils.materials.put("聚酸酯块", 0);

        resourceUse = operatorUtils.materials.get("糖聚块");
        operatorUtils.materials.put("糖组", operatorUtils.materials.get("糖组") + resourceUse*2);
        operatorUtils.materials.put("异铁组", operatorUtils.materials.get("异铁组") + resourceUse);
        operatorUtils.materials.put("轻锰矿", operatorUtils.materials.get("轻锰矿") + resourceUse);
        operatorUtils.materials.put("糖聚块", 0);

        resourceUse = operatorUtils.materials.get("异铁块");
        operatorUtils.materials.put("异铁组", operatorUtils.materials.get("异铁组") + resourceUse*2);
        operatorUtils.materials.put("全新装置", operatorUtils.materials.get("全新装置") + resourceUse);
        operatorUtils.materials.put("聚酸酯组", operatorUtils.materials.get("聚酸酯组") + resourceUse);
        operatorUtils.materials.put("异铁块", 0);

        resourceUse = operatorUtils.materials.get("酮阵列");
        operatorUtils.materials.put("酮凝集组", operatorUtils.materials.get("酮凝集组") + resourceUse*2);
        operatorUtils.materials.put("糖组", operatorUtils.materials.get("糖组") + resourceUse);
        operatorUtils.materials.put("轻锰矿", operatorUtils.materials.get("轻锰矿") + resourceUse);
        operatorUtils.materials.put("酮阵列", 0);

        resourceUse = operatorUtils.materials.get("聚合凝胶");
        operatorUtils.materials.put("异铁组", operatorUtils.materials.get("异铁组") + resourceUse);
        operatorUtils.materials.put("凝胶", operatorUtils.materials.get("凝胶") + resourceUse);
        operatorUtils.materials.put("炽合金", operatorUtils.materials.get("炽合金") + resourceUse);
        operatorUtils.materials.put("聚合凝胶", 0);

        resourceUse = operatorUtils.materials.get("炽合金块");
        operatorUtils.materials.put("全新装置", operatorUtils.materials.get("全新装置") + resourceUse);
        operatorUtils.materials.put("研磨石", operatorUtils.materials.get("研磨石") + resourceUse);
        operatorUtils.materials.put("炽合金", operatorUtils.materials.get("炽合金") + resourceUse);
        operatorUtils.materials.put("炽合金块", 0);

        resourceUse = operatorUtils.materials.get("晶体电路");
        operatorUtils.materials.put("晶体元件", operatorUtils.materials.get("晶体元件") + resourceUse*2);
        operatorUtils.materials.put("凝胶", operatorUtils.materials.get("凝胶") + resourceUse);
        operatorUtils.materials.put("炽合金", operatorUtils.materials.get("炽合金") + resourceUse);
        operatorUtils.materials.put("晶体电路", 0);
    }

    private void addResource(String[] resources) {

        for (int i = 0; i < resources.length; i = i + 2) {
            String resource = resources[i];
            if (operatorUtils.materials.containsKey(resource)) {
                operatorUtils.materials.put(resource,
                        operatorUtils.materials.get(resource) + Integer.valueOf(resources[i + 1]));
            } else if (operatorUtils.chip.containsKey(resource)) {
                operatorUtils.chip.put(resource,
                        operatorUtils.chip.get(resource) + Integer.valueOf(resources[i + 1]));
            } else if (operatorUtils.consumables.containsKey(resource)) {
                if (resources[i].equals("龙门币")) {
                    switch (resources[i + 1]) {
                        case "1w":
                            operatorUtils.consumables.put(resource,
                                    operatorUtils.consumables.get(resource) + 10000);
                            break;
                        case "1.5w":
                            operatorUtils.consumables.put(resource,
                                    operatorUtils.consumables.get(resource) + 15000);
                            break;
                        case "2w":
                            operatorUtils.consumables.put(resource,
                                    operatorUtils.consumables.get(resource) + 20000);
                            break;
                        case "3w":
                            operatorUtils.consumables.put(resource,
                                    operatorUtils.consumables.get(resource) + 30000);
                            break;
                        case "6w":
                            operatorUtils.consumables.put(resource,
                                    operatorUtils.consumables.get(resource) + 60000);
                            break;
                        case "12w":
                            operatorUtils.consumables.put(resource,
                                    operatorUtils.consumables.get(resource) + 120000);
                            break;
                        case "18w":
                            operatorUtils.consumables.put(resource,
                                    operatorUtils.consumables.get(resource) + 180000);
                            break;
                    }
                } else {
                    operatorUtils.consumables.put(resource,
                            operatorUtils.consumables.get(resource) + Integer.valueOf(resources[i + 1]));
                }

            } else {
                continue;
            }
        }
    }

    private void initOperatorUtils() {
        operatorUtils.materials.put(Materials.D32钢.fieldName, 0);
        operatorUtils.materials.put(Materials.双极纳米片.fieldName, 0);
        operatorUtils.materials.put(Materials.聚合剂.fieldName, 0);
        operatorUtils.materials.put(Materials.晶体电子单元.fieldName, 0);

        operatorUtils.materials.put(Materials.白马醇.fieldName, 0);
        operatorUtils.materials.put(Materials.三水锰矿.fieldName, 0);
        operatorUtils.materials.put(Materials.五水研磨石.fieldName, 0);
        operatorUtils.materials.put(Materials.RMA7024.fieldName, 0);
        operatorUtils.materials.put(Materials.聚合凝胶.fieldName, 0);
        operatorUtils.materials.put(Materials.炽合金块.fieldName, 0);
        operatorUtils.materials.put(Materials.晶体电路.fieldName, 0);

        operatorUtils.materials.put(Materials.扭转醇.fieldName, 0);
        operatorUtils.materials.put(Materials.轻锰矿.fieldName, 0);
        operatorUtils.materials.put(Materials.研磨石.fieldName, 0);
        operatorUtils.materials.put(Materials.RMA7012.fieldName, 0);
        operatorUtils.materials.put(Materials.凝胶.fieldName, 0);
        operatorUtils.materials.put(Materials.炽合金.fieldName, 0);
        operatorUtils.materials.put(Materials.晶体元件.fieldName, 0);

        operatorUtils.materials.put(Materials.提纯源岩.fieldName, 0);
        operatorUtils.materials.put(Materials.改量装置.fieldName, 0);
        operatorUtils.materials.put(Materials.聚酸酯块.fieldName, 0);
        operatorUtils.materials.put(Materials.糖聚块.fieldName, 0);
        operatorUtils.materials.put(Materials.异铁块.fieldName, 0);
        operatorUtils.materials.put(Materials.酮阵列.fieldName, 0);

        operatorUtils.materials.put(Materials.固源岩组.fieldName, 0);
        operatorUtils.materials.put(Materials.全新装置.fieldName, 0);
        operatorUtils.materials.put(Materials.聚酸酯组.fieldName, 0);
        operatorUtils.materials.put(Materials.糖组.fieldName, 0);
        operatorUtils.materials.put(Materials.异铁组.fieldName, 0);
        operatorUtils.materials.put(Materials.酮凝集组.fieldName, 0);

        operatorUtils.materials.put(Materials.固源岩.fieldName, 0);
        operatorUtils.materials.put(Materials.装置.fieldName, 0);
        operatorUtils.materials.put(Materials.聚酸酯.fieldName, 0);
        operatorUtils.materials.put(Materials.糖.fieldName, 0);
        operatorUtils.materials.put(Materials.异铁.fieldName, 0);
        operatorUtils.materials.put(Materials.酮凝集.fieldName, 0);

        operatorUtils.materials.put(Materials.源岩.fieldName, 0);
        operatorUtils.materials.put(Materials.破损装置.fieldName, 0);
        operatorUtils.materials.put(Materials.酯原料.fieldName, 0);
        operatorUtils.materials.put(Materials.代糖.fieldName, 0);
        operatorUtils.materials.put(Materials.异铁碎片.fieldName, 0);
        operatorUtils.materials.put(Materials.双酮.fieldName, 0);

        operatorUtils.chip.put(Chip.先锋双芯片.toString(), 0);
        operatorUtils.chip.put(Chip.近卫双芯片.toString(), 0);
        operatorUtils.chip.put(Chip.重装双芯片.toString(), 0);
        operatorUtils.chip.put(Chip.狙击双芯片.toString(), 0);
        operatorUtils.chip.put(Chip.术师双芯片.toString(), 0);
        operatorUtils.chip.put(Chip.医疗双芯片.toString(), 0);
        operatorUtils.chip.put(Chip.辅助双芯片.toString(), 0);
        operatorUtils.chip.put(Chip.特种双芯片.toString(), 0);

        operatorUtils.chip.put(Chip.先锋芯片组.toString(), 0);
        operatorUtils.chip.put(Chip.近卫芯片组.toString(), 0);
        operatorUtils.chip.put(Chip.重装芯片组.toString(), 0);
        operatorUtils.chip.put(Chip.狙击芯片组.toString(), 0);
        operatorUtils.chip.put(Chip.术师芯片组.toString(), 0);
        operatorUtils.chip.put(Chip.医疗芯片组.toString(), 0);
        operatorUtils.chip.put(Chip.辅助芯片组.toString(), 0);
        operatorUtils.chip.put(Chip.特种芯片组.toString(), 0);

        operatorUtils.chip.put(Chip.先锋芯片.toString(), 0);
        operatorUtils.chip.put(Chip.近卫芯片.toString(), 0);
        operatorUtils.chip.put(Chip.重装芯片.toString(), 0);
        operatorUtils.chip.put(Chip.狙击芯片.toString(), 0);
        operatorUtils.chip.put(Chip.术师芯片.toString(), 0);
        operatorUtils.chip.put(Chip.医疗芯片.toString(), 0);
        operatorUtils.chip.put(Chip.辅助芯片.toString(), 0);
        operatorUtils.chip.put(Chip.特种芯片.toString(), 0);

        operatorUtils.consumables.put(Consumables.龙门币.fieldName, 0);
        operatorUtils.consumables.put(Consumables.技巧概要卷1.fieldName, 0);
        operatorUtils.consumables.put(Consumables.技巧概要卷2.fieldName, 0);
        operatorUtils.consumables.put(Consumables.技巧概要卷3.fieldName, 0);
    }

}

// str.trim(); //去掉首尾空格
// str.replace(" ",""); //去除所有空格，包括首尾、中间
// str.replaceAll(" ", ""); //去掉所有空格，包括首尾、中间
// str.replaceAll(" +",""); //去掉所有空格，包括首尾、中间
// str.replaceAll("\\s*", ""); //可以替换大部分空白字符， 不限于空格 ；
// \\s* 可以匹配空格、制表符、换页符等空白字符的其中任意一个。