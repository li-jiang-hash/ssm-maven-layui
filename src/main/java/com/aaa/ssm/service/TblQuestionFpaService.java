package com.aaa.ssm.service;

import com.aaa.ssm.pojo.TblQuestionFpa;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:13 2022/09/13 18:58
 * @description: Exercise
 * @Version 1.0.0
 */
public interface TblQuestionFpaService {
    List<TblQuestionFpa> getAllTblQuestionFpa();

    PageInfo<TblQuestionFpa> getAllTblQuestionFpaPage(Integer pageNum);
}
