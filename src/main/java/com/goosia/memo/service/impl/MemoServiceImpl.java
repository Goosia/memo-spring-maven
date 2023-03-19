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
    public List<MemoVO> findMemoList() {
        log.info("===============================================================");
        log.info("로그 출력을 확인 합니다.");
        log.info("===============================================================");
        return memoMapper.selectMemoList();
    }

    @Override
    public MemoVO findMemo(int idx) {
        return memoMapper.selectMemo(idx);
    }

    @Override
    public void insertMemo(MemoVO req) {
        memoMapper.insertMemo(req);
    }

    @Override
    public void updateMemo(MemoVO req) {
        memoMapper.updateMemo(req);
    }

    @Override
    public void deleteMemo(int idx) {
        memoMapper.deleteMemo(idx);
    }
}
