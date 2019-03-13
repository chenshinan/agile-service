package io.choerodon.agile.app.service;

import io.choerodon.agile.api.dto.ArtDTO;
import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;

/**
 * Created by HuangFuqiang@choerodon.io on 2019/3/11.
 * Email: fuqianghuang01@gmail.com
 */
public interface ArtService {

    ArtDTO createArt(Long programId, ArtDTO artDTO);

    ArtDTO updateArt(Long programId, ArtDTO artDTO);

    void deleteArt(Long programId, Long id);

    Page<ArtDTO> queryArtList(Long programId, PageRequest pageRequest);

    ArtDTO queryArt(Long programId, Long id);

    ArtDTO releaseArt(Long programId, Long artId, Long piNumber);
}