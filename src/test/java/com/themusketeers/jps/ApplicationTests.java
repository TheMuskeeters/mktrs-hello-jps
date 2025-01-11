/*----------------------------------------------------------------------------*/
/* Source File:   APPLICATIONTESTS.JAVA                                       */
/* Copyright (c), 2024 The Musketeers                                         */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Mar.09/2024  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.themusketeers.jps;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit tests for Application class.
 *
 * @author COQ - Carlos Adolfo Ortiz Q.
 */
@SpringBootTest
@EnableAutoConfiguration(exclude = {
    WebFluxAutoConfiguration.class,
    WebClientAutoConfiguration.class
})
class ApplicationTests {

    @Test
    void contextLoads() {
    }

}
