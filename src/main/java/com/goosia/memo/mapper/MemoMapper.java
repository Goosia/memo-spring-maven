package com.goosia.memo.mapper;

import com.goosia.memo.model.MemoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoMapper {
    List<MemoVO> selectMemoList();

    MemoVO selectMemo(int idx);

    void insertMemo(MemoVO req);

    void updateMemo(MemoVO req);

    void deleteMemo(int idx);
}
