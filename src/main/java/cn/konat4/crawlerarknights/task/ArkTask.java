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

        operator = operatorService.findByName("?????????");
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("??????");
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("???");
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("???????????????");
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("????????????");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("????????????");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("????????????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("?????????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("?????????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("??????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("??????");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("????????????");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("???");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("???");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);
        
        operator = operatorService.findByName("???");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("?????????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("?????????");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("?????????");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("?????????");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("?????????");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("?????????");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("??????");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("??????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("??????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("??????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("????????????");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("???");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("???");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("??????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("?????????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("???");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("???");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("????????????");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("?????????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("??????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("?????????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("?????????");
        resources = operator.getSkill3Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill3Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("???");
        resources = operator.getSkill1Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill1Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("???");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("??????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("???");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("?????????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("??????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("??????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);

        operator = operatorService.findByName("??????");
        resources = operator.getSkill2Grade1().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade2().split(",");
        addResource(resources);
        resources = operator.getSkill2Grade3().split(",");
        addResource(resources);
        
        operator = operatorService.findByName("?????????(??????)");
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
        // ????????????table.wikitable > tbody > tr
        Elements trs = doc.select("table.wikitable.logo > tbody > tr");
        String res;
        int pointer = 0;
        boolean isAnswer = false;

        for (Element tr : trs) {
            // ??????tr??????th??????td
            if (tr.parent().parent().hasClass("nomobile")) {
                continue;
            }
            // System.out.println(tr.parent().parent().classNames().toString());

            Elements tds = tr.getElementsByTag("td");
            // tds????????????null, ???tds.first()?????????null
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

        resourceUse = operatorUtils.materials.get("D32???");
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse);
        operatorUtils.materials.put("???????????????", operatorUtils.materials.get("???????????????") + resourceUse);
        operatorUtils.materials.put("RMA70-24", operatorUtils.materials.get("RMA70-24") + resourceUse);
        operatorUtils.materials.put("D32???", 0);

        resourceUse = operatorUtils.materials.get("???????????????");
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse);
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse*2);
        operatorUtils.materials.put("???????????????", 0);

        resourceUse = operatorUtils.materials.get("?????????");
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse);
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("?????????", 0);

        resourceUse = operatorUtils.materials.get("??????????????????");
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse);
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse*2);
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse);
        operatorUtils.materials.put("??????????????????", 0);

        resourceUse = operatorUtils.materials.get("?????????");
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("??????", operatorUtils.materials.get("??????") + resourceUse);
        operatorUtils.materials.put("RMA70-12", operatorUtils.materials.get("RMA70-12") + resourceUse);
        operatorUtils.materials.put("?????????", 0);

        resourceUse = operatorUtils.materials.get("????????????");
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse*2);
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse);
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("????????????", 0);

        resourceUse = operatorUtils.materials.get("???????????????");
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse);
        operatorUtils.materials.put("???????????????", 0);

        resourceUse = operatorUtils.materials.get("RMA70-24");
        operatorUtils.materials.put("RMA70-12", operatorUtils.materials.get("RMA70-12") + resourceUse);
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse*2);
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse);
        operatorUtils.materials.put("RMA70-24", 0);

        resourceUse = operatorUtils.materials.get("????????????");
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse*4);
        operatorUtils.materials.put("????????????", 0);

        resourceUse = operatorUtils.materials.get("????????????");
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse);
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse*2);
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("????????????", 0);

        resourceUse = operatorUtils.materials.get("????????????");
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse*2);
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse);
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("????????????", 0);

        resourceUse = operatorUtils.materials.get("?????????");
        operatorUtils.materials.put("??????", operatorUtils.materials.get("??????") + resourceUse*2);
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("?????????", 0);

        resourceUse = operatorUtils.materials.get("?????????");
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse*2);
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse);
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse);
        operatorUtils.materials.put("?????????", 0);

        resourceUse = operatorUtils.materials.get("?????????");
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse*2);
        operatorUtils.materials.put("??????", operatorUtils.materials.get("??????") + resourceUse);
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("?????????", 0);

        resourceUse = operatorUtils.materials.get("????????????");
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("??????", operatorUtils.materials.get("??????") + resourceUse);
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("????????????", 0);

        resourceUse = operatorUtils.materials.get("????????????");
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse);
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("????????????", 0);

        resourceUse = operatorUtils.materials.get("????????????");
        operatorUtils.materials.put("????????????", operatorUtils.materials.get("????????????") + resourceUse*2);
        operatorUtils.materials.put("??????", operatorUtils.materials.get("??????") + resourceUse);
        operatorUtils.materials.put("?????????", operatorUtils.materials.get("?????????") + resourceUse);
        operatorUtils.materials.put("????????????", 0);
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
                if (resources[i].equals("?????????")) {
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
        operatorUtils.materials.put(Materials.D32???.fieldName, 0);
        operatorUtils.materials.put(Materials.???????????????.fieldName, 0);
        operatorUtils.materials.put(Materials.?????????.fieldName, 0);
        operatorUtils.materials.put(Materials.??????????????????.fieldName, 0);

        operatorUtils.materials.put(Materials.?????????.fieldName, 0);
        operatorUtils.materials.put(Materials.????????????.fieldName, 0);
        operatorUtils.materials.put(Materials.???????????????.fieldName, 0);
        operatorUtils.materials.put(Materials.RMA7024.fieldName, 0);
        operatorUtils.materials.put(Materials.????????????.fieldName, 0);
        operatorUtils.materials.put(Materials.????????????.fieldName, 0);
        operatorUtils.materials.put(Materials.????????????.fieldName, 0);

        operatorUtils.materials.put(Materials.?????????.fieldName, 0);
        operatorUtils.materials.put(Materials.?????????.fieldName, 0);
        operatorUtils.materials.put(Materials.?????????.fieldName, 0);
        operatorUtils.materials.put(Materials.RMA7012.fieldName, 0);
        operatorUtils.materials.put(Materials.??????.fieldName, 0);
        operatorUtils.materials.put(Materials.?????????.fieldName, 0);
        operatorUtils.materials.put(Materials.????????????.fieldName, 0);

        operatorUtils.materials.put(Materials.????????????.fieldName, 0);
        operatorUtils.materials.put(Materials.????????????.fieldName, 0);
        operatorUtils.materials.put(Materials.????????????.fieldName, 0);
        operatorUtils.materials.put(Materials.?????????.fieldName, 0);
        operatorUtils.materials.put(Materials.?????????.fieldName, 0);
        operatorUtils.materials.put(Materials.?????????.fieldName, 0);

        operatorUtils.materials.put(Materials.????????????.fieldName, 0);
        operatorUtils.materials.put(Materials.????????????.fieldName, 0);
        operatorUtils.materials.put(Materials.????????????.fieldName, 0);
        operatorUtils.materials.put(Materials.??????.fieldName, 0);
        operatorUtils.materials.put(Materials.?????????.fieldName, 0);
        operatorUtils.materials.put(Materials.????????????.fieldName, 0);

        operatorUtils.materials.put(Materials.?????????.fieldName, 0);
        operatorUtils.materials.put(Materials.??????.fieldName, 0);
        operatorUtils.materials.put(Materials.?????????.fieldName, 0);
        operatorUtils.materials.put(Materials.???.fieldName, 0);
        operatorUtils.materials.put(Materials.??????.fieldName, 0);
        operatorUtils.materials.put(Materials.?????????.fieldName, 0);

        operatorUtils.materials.put(Materials.??????.fieldName, 0);
        operatorUtils.materials.put(Materials.????????????.fieldName, 0);
        operatorUtils.materials.put(Materials.?????????.fieldName, 0);
        operatorUtils.materials.put(Materials.??????.fieldName, 0);
        operatorUtils.materials.put(Materials.????????????.fieldName, 0);
        operatorUtils.materials.put(Materials.??????.fieldName, 0);

        operatorUtils.chip.put(Chip.???????????????.toString(), 0);
        operatorUtils.chip.put(Chip.???????????????.toString(), 0);
        operatorUtils.chip.put(Chip.???????????????.toString(), 0);
        operatorUtils.chip.put(Chip.???????????????.toString(), 0);
        operatorUtils.chip.put(Chip.???????????????.toString(), 0);
        operatorUtils.chip.put(Chip.???????????????.toString(), 0);
        operatorUtils.chip.put(Chip.???????????????.toString(), 0);
        operatorUtils.chip.put(Chip.???????????????.toString(), 0);

        operatorUtils.chip.put(Chip.???????????????.toString(), 0);
        operatorUtils.chip.put(Chip.???????????????.toString(), 0);
        operatorUtils.chip.put(Chip.???????????????.toString(), 0);
        operatorUtils.chip.put(Chip.???????????????.toString(), 0);
        operatorUtils.chip.put(Chip.???????????????.toString(), 0);
        operatorUtils.chip.put(Chip.???????????????.toString(), 0);
        operatorUtils.chip.put(Chip.???????????????.toString(), 0);
        operatorUtils.chip.put(Chip.???????????????.toString(), 0);

        operatorUtils.chip.put(Chip.????????????.toString(), 0);
        operatorUtils.chip.put(Chip.????????????.toString(), 0);
        operatorUtils.chip.put(Chip.????????????.toString(), 0);
        operatorUtils.chip.put(Chip.????????????.toString(), 0);
        operatorUtils.chip.put(Chip.????????????.toString(), 0);
        operatorUtils.chip.put(Chip.????????????.toString(), 0);
        operatorUtils.chip.put(Chip.????????????.toString(), 0);
        operatorUtils.chip.put(Chip.????????????.toString(), 0);

        operatorUtils.consumables.put(Consumables.?????????.fieldName, 0);
        operatorUtils.consumables.put(Consumables.???????????????1.fieldName, 0);
        operatorUtils.consumables.put(Consumables.???????????????2.fieldName, 0);
        operatorUtils.consumables.put(Consumables.???????????????3.fieldName, 0);
    }

}

// str.trim(); //??????????????????
// str.replace(" ",""); //??????????????????????????????????????????
// str.replaceAll(" ", ""); //??????????????????????????????????????????
// str.replaceAll(" +",""); //??????????????????????????????????????????
// str.replaceAll("\\s*", ""); //???????????????????????????????????? ??????????????? ???
// \\s* ?????????????????????????????????????????????????????????????????????????????????