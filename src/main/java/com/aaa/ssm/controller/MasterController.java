package com.aaa.ssm.controller;

import com.aaa.ssm.pojo.TblQuestionFpa;
import com.aaa.ssm.service.TblQuestionFpaService;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:江Sir
 * @Date:13 2022/09/13 16:18
 * @description: Exercise
 * @Version 1.0.0
 */
@Controller
public class MasterController {
    @Autowired
    private TblQuestionFpaService tblQuestionFpaService;


    @RequestMapping(value = "/feedback/{pageNum}",method = RequestMethod.GET)
    public String getAllTblQuestionFpa(Model model,@PathVariable("pageNum") Integer pageNum){
//    public String getAllTblQuestionFpa(Model model,int page,int limit){

        PageInfo<TblQuestionFpa> page = tblQuestionFpaService.getAllTblQuestionFpaPage(pageNum);
        model.addAttribute("page",page);
//        page = (page-1)*limit;
        System.out.println("_____"+page);
//        System.out.println(page+"_____"+limit);
        return "feedback";
//        return getObject(tblQuestionFpas);
    }


    @RequestMapping(value = "/feedback",method = RequestMethod.GET)
    public String getAllTblQuestionFpas(Model model){
//    public String getAllTblQuestionFpa(Model model,int page,int limit){

        List<TblQuestionFpa> tblQuestionFpas = tblQuestionFpaService.getAllTblQuestionFpa();
        model.addAttribute("tblQuestionFpas",tblQuestionFpas);
//        page = (page-1)*limit;
        System.out.println("_____"+tblQuestionFpas);
//        System.out.println(page+"_____"+limit);
        return "feedback";
//        return getObject(tblQuestionFpas);
    }
    private <T> JSONObject getObject(List<T> t) {
        JSONObject object=new JSONObject();
        object.put("code",0);
        object.put("msg","");
        object.put("count",50);
        object.put("data",t);
        return object;
    }
}
