package com.example.dsl

import spock.lang.Specification

class DSLConfigTest extends Specification {
    def "test configuration loading"() {
        when:
        DSLConfig.loadConfig()

        then:
        noExceptionThrown()
    }
}
