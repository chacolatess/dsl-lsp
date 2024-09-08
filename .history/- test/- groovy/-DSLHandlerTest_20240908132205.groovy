package com.example.dsl

import spock.lang.Specification

class DSLHandlerTest extends Specification {
    def "test DSL handling"() {
        given:
        def handler = new DSLHandler()

        when:
        handler.handleDSL("sample DSL code")

        then:
        noExceptionThrown()
    }
}
