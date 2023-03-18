package com.goosia.memo.service.impl;

import com.goosia.memo.mapper.MemoMapper;
import com.goosia.memo.model.MemoVO;
import com.goosia.memo.service.MemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class MemoServiceImpl implements MemoService {

    @Autowired
    private MemoMapper memoMapper;

    @Override
    public List<MemoVO> hello() {
        log.info("------------------------------------------------------");
        log.info("logging");
        log.info("------------------------------------------------------");
        return memoMapper.selectMemoList();
    }
}
