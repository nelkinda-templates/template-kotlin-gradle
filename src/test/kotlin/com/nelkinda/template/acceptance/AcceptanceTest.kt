package com.nelkinda.template.acceptance // TODO change

import io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME
import org.junit.platform.suite.api.ConfigurationParameter
import org.junit.platform.suite.api.ConfigurationParameters
import org.junit.platform.suite.api.IncludeEngines
import org.junit.platform.suite.api.SelectClasspathResource
import org.junit.platform.suite.api.Suite

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameters(
    ConfigurationParameter(
        key = FILTER_TAGS_PROPERTY_NAME,
        value = "not(@wip) and not(@future)"
    )
)
class AcceptanceTest
