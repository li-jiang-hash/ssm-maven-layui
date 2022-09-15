package com.aaa.ssm.service.impl;

import com.aaa.ssm.mapper.TblQuestionFpaMapper;
import com.aaa.ssm.pojo.TblQuestionFpa;
import com.aaa.ssm.service.TblQuestionFpaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:13 2022/09/13 18:58
 * @description: Exercise
 * @Version 1.0.0
 */
@Service
@Transactional
public class TblQuestionFpaServiceImpl implements TblQuestionFpaService {

    @Autowired
    private TblQuestionFpaMapper questionFpaMapper;
    @Override
    public List<TblQuestionFpa> getAllTblQuestionFpa() {
        return questionFpaMapper.getAlltblQuestionFpas();
    }

    @Override
    public PageInfo<TblQuestionFpa> getAllTblQuestionFpaPage(Integer pageNum) {
        PageHelper.startPage(pageNum,5);

        List<TblQuestionFpa> list = questionFpaMapper.getAlltblQuestionFpas();
        PageInfo<TblQuestionFpa> page = new PageInfo<>(list, 5);
        return page;
    }
}
