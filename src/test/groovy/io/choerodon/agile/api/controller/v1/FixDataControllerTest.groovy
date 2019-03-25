package io.choerodon.agile.api.controller.v1

import io.choerodon.agile.AgileTestConfiguration
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.context.annotation.Import
import org.springframework.test.context.ActiveProfiles
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise

/**
 *
 * @author dinghuang123@gmail.com
 * @since 2018/12/24
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(AgileTestConfiguration)
@ActiveProfiles("test")
@Stepwise
class FixDataControllerTest extends Specification {

    @Autowired
    TestRestTemplate restTemplate

    @Shared
    def projectId = 1L

    def 'fixCumulativeFlowDiagram'() {
        when: '修复累积流图'
        def entity = restTemplate.postForEntity('/v1/fix_data/fix_cumulative_flow_diagram', null, null, new HashMap<String, Object>())

        then: '接口是否请求成功'
        entity.statusCode.is2xxSuccessful()
    }
}
