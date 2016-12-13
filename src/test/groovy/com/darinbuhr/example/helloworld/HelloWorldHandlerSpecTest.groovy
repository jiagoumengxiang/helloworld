package com.darinbuhr.example.helloworld

import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll

class HelloWorldHandlerSpecTest extends Specification {

    @Subject
    HelloWorldHandler handler = new HelloWorldHandler()

    @Unroll
    def 'test Hello World handler response'() {
        when:
            String response = handler.response(value)

        then:
            response == expectResponse

        where:
            value      || expectResponse
            null       || "Hello World!"
            ""         || "Hello World!"
            " "        || "Hello World!"
            "Everyone" || "Hello Everyone!"
            "You"      || "Hello You!"
            "You "     || "Hello You!"
            "You!"     || "Hello You!!"
            "To Me"    || "Hello To Me!"
            "To Me  "  || "Hello To Me!"
    }
}