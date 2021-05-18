package cn.konat4.crawlerarknights.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operator")
public class Operator {

    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "name")
    private String name;

    @Column(name = "elite1")
    private String elite1;

    @Column(name = "elite2")
    private String elite2;

    @Column(name = "skill_level2")
    private String skillLevel2;

    @Column(name = "skill_level3")
    private String skillLevel3;

    @Column(name = "skill_level4")
    private String skillLevel4;

    @Column(name = "skill_level5")
    private String skillLevel5;

    @Column(name = "skill_level6")
    private String skillLevel6;

    @Column(name = "skill_level7")
    private String skillLevel7;

    @Column(name = "skill1_grade1")
    private String skill1Grade1;

    @Column(name = "skill1_grade2")
    private String skill1Grade2;

    @Column(name = "skill1_grade3")
    private String skill1Grade3;

    @Column(name = "skill2_grade1")
    private String skill2Grade1;

    @Column(name = "skill2_grade2")
    private String skill2Grade2;

    @Column(name = "skill2_grade3")
    private String skill2Grade3;

    @Column(name = "skill3_grade1")
    private String skill3Grade1;

    public void operatorInfo() {
        System.out.println("干员编号：" + this.id + " 干员代号：" + this.name +
                "\n精一：" + this.elite1 +
                "\n精二：" + this.elite2 +
                "\n等级2：" + this.skillLevel2 +
                "\n等级3：" + this.skillLevel3 +
                "\n等级4：" + this.skillLevel4 +
                "\n等级5：" + this.skillLevel5 +
                "\n等级6：" + this.skillLevel6 +
                "\n等级7：" + this.skillLevel7 +
                "\n1技能专精1：" + this.skill1Grade1 +
                "\n1技能专精2：" + this.skill1Grade2 +
                "\n1技能专精3：" + this.skill1Grade3 +
                "\n2技能专精1：" + this.skill2Grade1 +
                "\n2技能专精2：" + this.skill2Grade2 +
                "\n2技能专精3：" + this.skill2Grade3 +
                "\n3技能专精1：" + this.skill3Grade1 +
                "\n3技能专精2：" + this.skill3Grade2 +
                "\n3技能专精3：" + this.skill3Grade3);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElite1() {
        return elite1;
    }

    public void setElite1(String elite1) {
        this.elite1 = elite1;
    }

    public String getElite2() {
        return elite2;
    }

    public void setElite2(String elite2) {
        this.elite2 = elite2;
    }

    public String getSkillLevel2() {
        return skillLevel2;
    }

    public void setSkillLevel2(String skillLevel2) {
        this.skillLevel2 = skillLevel2;
    }

    public String getSkillLevel3() {
        return skillLevel3;
    }

    public void setSkillLevel3(String skillLevel3) {
        this.skillLevel3 = skillLevel3;
    }

    public String getSkillLevel4() {
        return skillLevel4;
    }

    public void setSkillLevel4(String skillLevel4) {
        this.skillLevel4 = skillLevel4;
    }

    public String getSkillLevel5() {
        return skillLevel5;
    }

    public void setSkillLevel5(String skillLevel5) {
        this.skillLevel5 = skillLevel5;
    }

    public String getSkillLevel6() {
        return skillLevel6;
    }

    public void setSkillLevel6(String skillLevel6) {
        this.skillLevel6 = skillLevel6;
    }

    public String getSkillLevel7() {
        return skillLevel7;
    }

    public void setSkillLevel7(String skillLevel7) {
        this.skillLevel7 = skillLevel7;
    }

    public String getSkill1Grade1() {
        return skill1Grade1;
    }

    public void setSkill1Grade1(String skill1Grade1) {
        this.skill1Grade1 = skill1Grade1;
    }

    public String getSkill1Grade2() {
        return skill1Grade2;
    }

    public void setSkill1Grade2(String skill1Grade2) {
        this.skill1Grade2 = skill1Grade2;
    }

    public String getSkill1Grade3() {
        return skill1Grade3;
    }

    public void setSkill1Grade3(String skill1Grade3) {
        this.skill1Grade3 = skill1Grade3;
    }

    public String getSkill2Grade1() {
        return skill2Grade1;
    }

    public void setSkill2Grade1(String skill2Grade1) {
        this.skill2Grade1 = skill2Grade1;
    }

    public String getSkill2Grade2() {
        return skill2Grade2;
    }

    public void setSkill2Grade2(String skill2Grade2) {
        this.skill2Grade2 = skill2Grade2;
    }

    public String getSkill2Grade3() {
        return skill2Grade3;
    }

    public void setSkill2Grade3(String skill2Grade3) {
        this.skill2Grade3 = skill2Grade3;
    }

    public String getSkill3Grade1() {
        return skill3Grade1;
    }

    public void setSkill3Grade1(String skill3Grade1) {
        this.skill3Grade1 = skill3Grade1;
    }

    public String getSkill3Grade2() {
        return skill3Grade2;
    }

    public void setSkill3Grade2(String skill3Grade2) {
        this.skill3Grade2 = skill3Grade2;
    }

    public String getSkill3Grade3() {
        return skill3Grade3;
    }

    public void setSkill3Grade3(String skill3Grade3) {
        this.skill3Grade3 = skill3Grade3;
    }

    @Column(name = "skill3_grade2")
    private String skill3Grade2;

    @Column(name = "skill3_grade3")
    private String skill3Grade3;
}
