package com.goosia.memo.service;

import com.goosia.memo.model.MemoVO;

import java.util.List;
import java.util.Locale;

public interface MemoService {
    List<MemoVO> findMemoList();

    MemoVO findMemo(int idx);

    void deleteMemo(int idx);

    void updateMemo(MemoVO req);

    void insertMemo(MemoVO req);
}
